#!/usr/bin/env python3
from pwn import *

context.log_level = 'debug'

r = remote('39.96.193.120', 10001, timeout=10)
# Receive initial banner
try:
    data = r.recvuntil(b'note:', timeout=10)
    print("=== Received ===")
    print(data.decode(errors='replace'))
    r.sendline(b'100')
    data2 = r.recvuntil(b'rune', timeout=5)
    print(data2.decode(errors='replace'))
    r.sendline(b'magic')
    data3 = r.recv(timeout=5)
    print(data3.decode(errors='replace'))
except EOFError:
    print("EOFError - connection closed")
except Exception as e:
    print(f"Error: {e}")
r.close()
