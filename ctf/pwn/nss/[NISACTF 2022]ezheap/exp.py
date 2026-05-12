from pwn import *
context(arch='i386',log_level='debug',os='linux')
elf=ELF('./pwn')
