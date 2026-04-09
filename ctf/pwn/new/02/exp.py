from pwn import *
p=process('./math')
p.recvuntil(b"Welcome to math fun!\n")

for x in range(104):
    p.recvuntil(b"What is ")
    str_t=eval(p.recvuntil(b"?")[:-1].decode())
    p.sendline(str(str_t))
p.interactive()
