# Conway's Trap - Writeup

## 题目分析

程序接受两段输入：
1. **Seed**: 32 位 hex 字符串，解析为 16 字节
2. **Flag**: 需满足格式 `ISCC{...}`

### 关键函数

- `0x401990` — Conway 变换 (5 轮迭代，每轮 16 字节混淆)
- `0x401d00` — Flag 校验函数，栈上初始化 23 字节编码数组

### Flag 校验算法 (函数 0x401d00)

```
for i in 0..22:
    expected[i] = encoded[i] ^ 0xCC
    v = rol8((seed[i % 16] ^ flag[i]) + i * 23, 3) ^ 0xAA
    if v != expected[i]: fail
```

参数：MUL=23, ROT=3, XOR=0xAA, CHECK_XOR=0xCC, ROUNDS=5

### 修改点

附件相比原题修改了函数 0x401d00 栈上的 encoded flag 初始化数据（.text 偏移 0x1124~0x114c，共 18 字节差异），其他参数不变。

原编码数据 (23 bytes): `4c44c5e31d04d7bffee5df4413ae4a749081417f2f9238`
新编码数据 (23 bytes): `4c8d44e3c399d6dffe68df3e13cb8a6f69db4166d8455a`

### 解法

1. 目标 hex `df7b6a5d4da0f5facf32c4ee4b28b792` 逆向 5 轮 Conway 得到原始 seed
2. 逆向 flag 校验公式，用 seed 和 encoded flag 解出 flag 原文

逆运算：
```
v = ror8(expected[i] ^ 0xAA, 3)
flag[i] = ((v - i * 23) & 0xFF) ^ seed[i % 16]
```

## Flag

**`ISCC{N8$w0lhmves(rMTEzntWcai}`**
