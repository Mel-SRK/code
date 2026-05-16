# 消失的喵星密使 Writeup

## 1. 题目分析

APK 包含 Java 层和 Native 层（libmobile03.so），核心逻辑：

- **Java 层**：6x6 宫格（ADFGVX 密码），用户点击图标生成编码序列
- **Native 层**：用编码序列 + hint.png 中提取的 S-box 派生 AES-256 密钥，解密密文验证 flag

## 2. Java 层分析

### 2.1 前缀校验 `_B._g()`

```java
byte[] bArr = {11, 17, 1, 1, 57};
// XOR with 66 → ISCC{
```

flag 必须以 `ISCC{` 开头、`}` 结尾。

### 2.2 宫格布局 `_B._s`

6x6 图标网格，对应的 ADFGVX 键数组：

```java
private final String[] _k = {"X", "D", "A", "G", "V", "F"};
```

注意：键顺序不是标准的 ADFGVX，而是 **X, D, A, G, V, F**。

### 2.3 编码序列校验 `_C._c()`

MD5 校验目标：`26f3bf982611a19db52f2d1c265af560`

### 2.4 密文提示 `MainActivity`

```
密使巡逻日志：雪球在印记的起点打转，它转而扑向那抹舞动的斑斓，
在清甜的气息中小憩片刻；它凝视苍穹中央的光源，却为未竟之事而黯然，
终没入无光的轮廓里。
```

对应的图标序列：

🐾 → 🦋 → 🌿 → ☀️ → 😿 → 🐈‍⬛

### 2.5 计算编码

根据新的 `_k` 键序（X=0, D=1, A=2, G=3, V=4, F=5），Grid 中每个图标的坐标：

| 图标 | 坐标 | 行键 | 列键 | 编码 |
|------|------|------|------|------|
| 🐾 | [0][0] | X | X | XX |
| 🦋 | [1][3] | D | G | DG |
| 🌿 | [2][5] | A | F | AF |
| ☀️ | [3][1] | G | D | GD |
| 😿 | [4][5] | V | F | VF |
| 🐈‍⬛ | [5][0] | F | X | FX |

编码序列：**XXDGAFGDVFFX**

MD5 验证：`md5("XXDGAFGDVFFX") = 26f3bf982611a19db52f2d1c265af560` ✓

## 3. Native 层分析

### 3.1 S-box 提取

`hint.png` 蓝色通道 LSB 隐写了 `MEOW` 标记 + 256 字节 S-box：

```python
bits = []
for pixel in image:
    bits.append(blue_channel & 1)
data = bits_to_bytes(bits)
sbox = data[data.find(b'MEOW')+4:][:256]
```

### 3.2 关键函数

| 函数 | 作用 |
|------|------|
| `f_ext` | 从 Bitmap 提取 S-box |
| `f1` | 从编码序列派生 32 字节密钥 |
| `f_exp` | AES-256 密钥扩展（标准 Rcon） |
| `f_enc` | AES-256 加密（自定义 S-box） |
| `f_d64` | Base64 解码 |
| `f_monitor` | 反调试（检查 TracerPid） |

### 3.3 密钥派生（f1）

**第一步：重排编码**

模拟 `ld4` 交错加载，12 字节编码重排为：

```
原始: X X D G A F G D V F F X
重排: X F F X A V D G F G D X
```

**第二步：ADFGVX 查表**

Native 层硬编码了 ADFGVX→坐标的映射：

- 行偏移：A=0, D=6, F=12, G=18, V=24, X=30
- 列偏移：A=0, D=1, F=2, G=3, V=4, X=5

查表字符串（.rodata，指针存储在 `_m_tbl` 经 RELATIVE 重定位）：

```
dizc7wqy3ralmp84jks9vx21bhgu50t6fnoe
```

构成 6×6 矩阵：

```
     X D A G V F
 X:  d i z c 7 w
 D:  q y 3 r a l
 A:  m p 8 4 j k
 G:  s 9 v x 2 1
 V:  b h g u 5 0
 F:  t 6 f n o e
```

每对 ADFGVX 字符映射到一个字母：

| 对 | 查表结果 |
|----|---------|
| XF | f |
| FX | 0 |
| AV | 7 |
| DG | r |
| GF | 4 |
| DX | l |

**第三步：S-box 替换 + 轮常数 XOR**

```python
key[i] = sbox[table_char] ^ (i * 19)
```

32 个循环（i=0..31），重复使用 6 个查表结果，产生 32 字节 AES-256 密钥。

### 3.4 加密验证（f_enc + f_val）

```c
// f_val 核心逻辑：
encrypted_block1 = f_enc(flag[0:16])
encrypted_block2 = f_enc(flag[16:32])
ciphertext = base64_decode("vWwgs9PgXvujnCQNDgUqPAtCHcXoGwlJS8Wh4i8nl/c=")
expected = ciphertext XOR 0x66
if encrypted_block1 == expected[0:16] && encrypted_block2 == expected[16:32]:
    SUCCESS
```

f_enc 是 **标准 AES-256**（14 轮），使用自定义 S-box：
1. AddRoundKey（初始密钥）
2. 13 轮：SubBytes → ShiftRows → MixColumns → AddRoundKey
3. 最终轮：SubBytes → ShiftRows → AddRoundKey

MixColumns 使用标准 GF(2^8) 运算（不可约多项式 0x1B）。

## 4. 解密

逆向 f_enc 进行 AES-256 解密：

1. 从 hint.png 提取 S-box，计算逆 S-box
2. 用编码 XXDGAFGDVFFX 经 f1 派生 32 字节密钥
3. 用 f_exp（标准 AES-256 密钥扩展）生成 240 字节轮密钥
4. 对 `base64_decode(ciphertext) XOR 0x66` 执行 AES-256 解密

```python
# 目标密文
ct = base64.b64decode('vWwgs9PgXvujnCQNDgUqPAtCHcXoGwlJS8Wh4i8nl/c=')
target = bytes([b ^ 0x66 for b in ct])

# AES-256 解密
round_keys = key_expansion(derived_key, sbox)
block1 = aes256_decrypt(target[:16], round_keys, inv_sbox)
block2 = aes256_decrypt(target[16:32], round_keys, inv_sbox)
flag = block1 + block2  # sh4dowc4t_guard8dt
```

## 5. Flag

**ISCC{sh4dowc4t_guard8dt}**
