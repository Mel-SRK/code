from pwn import *
context(os='linux',arch='amd64',log_level='debug')
p=remote("node5.anna.nssctf.cn",29335)
elf=ELF('./ret2csu')
libc=ELF('./libc.so.6')


