from pwn import *
# 
p=process('./pwn')

payload=b'a'*()

p.sendline(payload)
p.interactive()
