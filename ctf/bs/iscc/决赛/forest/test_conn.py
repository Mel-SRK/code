#!/usr/bin/env python3
from pwn import *

context.log_level = 'debug'

r = remote('39.96.193.120', 10001)
try:
    data = r.recv(timeout=5)
    print("=== Received ===")
    print(data)
except:
    print("No data received")
r.close()
