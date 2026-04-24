from pwn import *
p = remote("node4.anna.nssctf.cn", 27500)
context(os="linux", arch="i386")
recv_header = p.recvuntil(b"Have fun!\n")

for x in range(100):
    p.recvuntil(b"What is")
    
    key = p.recvuntil(b"?")
    payload = flat([
        str(eval(key[:-1]))
    ])
    log.success(eval(key[:-1]))
    p.sendline(payload)
p.interactive()