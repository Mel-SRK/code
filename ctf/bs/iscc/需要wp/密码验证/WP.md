# ISCC 密码验证 Writeup

## 题目描述
一道安卓逆向题目，需要分析 APK 中的密码验证逻辑，找出正确的 flag。

## 分析过程

### 1. APK 解包
使用 jadx 反编译 APK，发现：
- 包名：`com.example.crypto`
- 主要类：`MainActivity`（Compose UI）、`NativeBridge`（JNI 接口）
- Native 库：`libnativecrypto.so`（ARM64/x86_64）

### 2. Java 层分析
`NativeBridge.verifyFlag(AssetManager assetManager, String flag)` 是一个 native 方法，负责验证 flag。

MainActivity 中：
- 要求 flag 长度为 36，以 `ISCC{` 开头，以 `}` 结尾
- 中间 30 个字符传递给 `verifyFlag` 进行验证

### 3. Native 层分析 (libnativecrypto.so)

#### 3.1 Asset 文件
- `cipher1.bin`: 8 bytes = `b4be6a40d6c25d3c`
- `cipher2.bin`: 12 bytes = `03191397f058e1df77be22ec`
- `cipher3.bin`: 10 bytes = `ba8fc95ccd230993b9a8`
- `puzzle.bin`: 20 bytes = `77774b44001dc3976d59a95e2c49959fb027e532`

#### 3.2 嵌入式数据表
- Table1 (16 bytes): `5384792a17483deedb0c01b29fd0b566`
- Table2 (16 bytes): `6e6d6d6d6d6e6d6d6d6d6e6d6d6d6d6e`
- Table3 (16 bytes): `03f4a99a5e8b7c31224f40e5d66db7ca`
- Table4 (88 bytes): 可打印字符集 `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz{}_-!@#$%^&*()[]<>?.,:;+/\\`
- AES S-box (256 bytes): 标准 AES S-box
- ShiftRows 置换: `[2, 3, 0, 1]`

#### 3.3 验证算法

Flag 中间 30 个字符分为三部分：
- **Part 1** (8 chars, flag 第 5-12 字节)
- **Part 2** (12 chars, flag 第 13-24 字节)  
- **Part 3** (10 chars, flag 第 25-34 字节)

**步骤 1: 表变换**
每个 table 字节经过变换：`((b - 0x13) & 0xFF) ^ 0x5A`
得到 T1, T2, T3。T2 恰好是单位矩阵。

**步骤 2: 组合运算**
- R1 = T1 ⊕ T3（逐字节异或）
- R2 = ShiftRows(T2 × R1^T, [2,3,0,1])（GF(2^8) 矩阵运算）
- R3 = AES_SBOX[R1⊕R2⊕T3] 然后累积异或 R3[i] ^= R3[i-1]

**步骤 3: TEA 加密验证（Part 1）**
- 中间值 inter = R3[1:9]
- xor_input = flag1 ⊕ inter
- TEA 加密（16轮，δ=0x9E3779B9，key 从 R1 提取）
- 结果与 cipher1 比较

**步骤 4: GF(2^8) 矩阵乘法验证（Part 2）**
- flag2 × R2^T == cipher2（在 GF(2^8) 中）

**步骤 5: 校验和约束**
- TABLE4[rol3(xor(flag1)) % 88] == flag2[0]

**步骤 6: Puzzle 矩阵验证（Part 1 前 4 字节）**
- 对 puzzle.bin 的 4×4 矩阵进行 GF(2^8) 线性方程组检查
- Σ_j gmul(puzzle[col*4+j], flag1[j]) == puzzle[16+col]

**步骤 7: LCG 流密码验证（Part 3）**
- seed = R3[0:8]（大端序 64-bit）
- LCG: state = (state × 0x5851F42D4C957F2D + 0x14057B7EF767814F) mod 2^64
- 取 state >> 24 的低 8 位作为密钥流
- flag3 ⊕ keystream == cipher3

**步骤 8: 最终检查**
- TABLE4[(flag1|flag2)[8] % 88] == flag3[8]
- TABLE4[(flag1|flag2)[9] % 88] == flag3[9]

### 4. 求解思路

#### Part 1 (前 4 字节): Puzzle 约束
Puzzle 提供了一个 4×4 GF(2^8) 线性方程组，可以直接解出 flag1[0:4]：

```
flag1[0:4] = 0x283a513f = "(:Q?"
```

#### Part 2: 矩阵求逆
由 flag2 × R2^T = cipher2，解得 flag2 = cipher2 × (R2^T)^(-1)

#### Part 3: LCG 解密
直接从 R3[0:8] 计算 LCG 种子，生成密钥流解密 cipher3。

### 5. 当前问题

GF(2^8) 线性方程组的解（Puzzle 约束）与 TEA 解密结果不一致。计算出的 R1/R2/R3 中间值可能存在误差，导致 TEA key 不正确。

正在排查 combine_T1_T3 函数中 T1 复制到输出向量的具体实现细节。

待确认正确的中间值后，即可解出完整 flag。

## 工具
- jadx: APK 反编译
- objdump: x86_64 反汇编
- Python: 算法实现和验证
- capstone (可选): 更精确的反汇编
