# DeepVoid WP

## 漏洞

`modify_content()` 中 `read(0, items[idx], 0x200)` 始终读取 0x200 字节，不检查实际分配的大小，存在堆溢出。

```c
// create_item: malloc(size) -- size 无上限
// modify_content: read(0, items[idx], 0x200) -- 固定 0x200
```

程序没有 view/show 功能，无法直接泄露。但可以通过覆写 GOT 表来泄露和 getshell。

## 利用思路

**Unsafe Unlink** (glibc 2.23) → 获取任意写 → 覆写 GOT 泄露 libc → getshell

### 1. Unsafe Unlink 获取 BSS 写原语

分配 chunk0(size=0x28), chunk1(size=0x80), chunk2(barrier)。

chunk0 内构造 fake chunk：
```
fake_fd = items_addr - 0x18 = 0x6020a8
fake_bk = items_addr - 0x10 = 0x6020b0
// 绕过检查: FD->bk == P 且 BK->fd == P (P=chunk0_data=items[0])
```

溢出 chunk0 覆写 chunk1 的 metadata：
```
chunk1->prev_size = 0x20  // fake chunk size
chunk1->size = 0x90       // 清除 PREV_INUSE
```

free(chunk1) → 后向合并 → unlink → `items[0] = 0x6020a8`

### 2. 改写 items 数组

modify(0) 从 0x6020a8 写入，偏移 0x18 处是 items[0]：
```
payload = pad(24) + p64(free@GOT) + p64(puts@GOT)
// items[0] -> free@GOT, items[1] -> puts@GOT
```

### 3. 泄露 libc

modify(0) → 向 free@GOT 写 `puts@plt` → `free()` 变 `puts()`

remove(1) → `free(puts@GOT)` → `puts(puts@GOT)` → 打印出 libc puts 地址 (6 bytes)

### 4. Getshell

计算 `system = libc_base + system_offset`

modify(0) → 向 free@GOT 写 `system`

remove(4) → `free(chunk4)` → `system("/bin/sh")` → shell

## Flag

(需连接远程服务器获取)

## 关键地址

| 地址 | 说明 |
|------|------|
| 0x6020c0 | items 数组 (chunks) |
| 0x602018 | free@GOT |
| 0x602020 | puts@GOT |
| 0x4006d0 | puts@plt |
| 0x4006c0 | free@plt |

## 防护绕过

| 防护 | 绕过方式 |
|------|---------|
| NX | ret2libc (system) |
| Stack Canary | 不溢出栈，只操作堆和 BSS |
| Partial RELRO | GOT 可写 |
| No PIE | 地址固定 |
