# 迷雾验证 - Writeup

## 题目信息

- **类型**: Mobile Reverse (Android APK)
- **语言**: Kotlin/Java + C++ (NDK Native Library)
- **关键词**: AES解密、自定义Base64、RC4、XOR、Unicorn模拟

---

## 1. 静态分析 - Java层

APK 包名 `com.example.mobile01`，入口 `MainActivity`。

### 输入验证流程

```java
// FlagFormatChecker.java
public static boolean checkBasicFormat(String str) {
    if (str == null || str.length() < 7 
        || !str.substring(0, 5).equals("ISCC{") 
        || str.charAt(str.length() - 1) != '}') {
        return false;
    }
    return true;
}

// FlagDispatcher.java
public static boolean dispatchCheck(String str) {
    if (str.length() % 2 == 0) {
        FlagCore.HeavyCheck(str);
    }
    return LocalExecutor.verify(str);  // 调用 Native 函数
}
```

Flag 格式为 `ISCC{...}`，核心验证在 native 层 `libmobile01.so` 的 `LocalExecutor.verify()`。

### KeyProvider - 获取 Base64 密钥

```java
// KeyProvider.java
public static String a1() {
    // 1. 从 assets/bin.data 读取密文
    InputStream is = MyApp.getAppContext().getAssets().open("bin.data");
    byte[] encrypted = readAll(is);
    
    // 2. AES/CBC/PKCS7Padding 解密
    // key: "1234567890abcdef" (k() 中 XOR 1 两次抵消)
    // iv:  "abcdef1234567890" (iv() 中 XOR 2 两次抵消)
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
    cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
    return new String(cipher.doFinal(encrypted)).trim();
    // 返回: "demo-5483"
}
```

bin.data 解密后为 `demo-5483`（PKCS7 padding 7个 0x07）。

---

## 2. 静态分析 - Native层 (libmobile01.so)

### 2.1 verify 函数核心逻辑

```c
jboolean verify(JNIEnv* env, jclass, jstring input) {
    const char* str = env->GetStringUTFChars(input, 0);
    size_t len = strlen(str);
    
    // (a) 格式检查: 前5字节 XOR "ISCC" == 0, 第5字节 XOR '{' == 0
    if ((*(uint32_t*)str ^ 0x43435349) | (str[4] ^ '{')) goto fail;
    
    // (b) 末尾检查: 最后一个字符 == '}'
    if (str[len - 1] != '}') goto fail;
    
    // (c) 提取内容 (去掉 ISCC{ 和 })
    len -= 6;  // 去除前5字符 + 末尾1字符
    std::string content(str + 5, len);
    
    // (d) 获取密钥
    std::string b64_key = get_b64_key_from_java(env); // "demo-5483"
    std::vector<uint8_t> rc4_key = get_rc4_key();     // "onmlkjihg"
    std::vector<uint8_t> xor_key = get_xor_key();     // "mnpklmwlmno"
    
    // (e) 加密并比较
    std::string result;
    encrypt_full(result, content, b64_key, rc4_key, xor_key);
    
    // (f) 与硬编码常量比较 (29字节)
    return result == "7qnnDZm85b05ef011cb4229154d3a";
}
```

### 2.2 encrypt_full 加密算法

输入 content（16字节，不含 ISCC{ 和 }）：

```
content[0:5]  → 自定义Base64编码 → 7字节
content[5:11] → RC4加密 → to_hex → 12字节
content[11:16] → XOR加密 → to_hex → 10字节
输出 = Base64 + HexRC4 + HexXOR = 29字节
```

### 2.3 自定义 Base64

`build_keyed_b64_table` 对标准 Base64 字母表进行**循环左移**：

```
sum = Σ(b64_key[i]) = Σ("demo-5483") = 678
shift = sum % 64 = 38
Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
Rotated  = "mnopqrstuvwxyz0123456789+/ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkl"
```

编码算法：每个字节 8bit → 累积到 32bit 寄存器 → 每次取6bit查表。

### 2.4 RC4 密钥生成

`get_rc4_key` 使用三个静态字符串拼接后**逆序拷贝**：

```cpp
std::string s1 = "ghi";  // 静态初始化
std::string s2 = "jkl";
std::string s3 = "mno";

// 拼接: concat(s1, s2) + s3 = "ghijklmno"
// 逆序拷贝到输出vector → "onmlkjihg"
vector<uint8_t> rc4_key = {0x6f,0x6e,0x6d,0x6c,0x6b,0x6a,0x69,0x68,0x67};
```

### 2.5 XOR 密钥生成

`get_xor_key` 拼接顺序不同（str3 + str1 + str2），且每个字符串**先减1**：

```cpp
std::string s1 = "lmnx";  // 减1 → "klmw"
std::string s2 = "mnop";  // 减1 → "lmno"  
std::string s3 = "noq";   // 减1 → "mnp"

// 拼接: concat(s3, s1) + s2 = "mnp" + "klmw" + "lmno" = "mnpklmwlmno"
vector<uint8_t> xor_key = {0x6d,0x6e,0x70,0x6b,0x6c,0x6d,0x77,0x6c,0x6d,0x6e,0x6f};
```

---

## 3. 目标常量提取（关键坑点）

目标常量在 `.rodata` 中使用**重叠加载**：

```asm
movups -0x1f3e8(%rip), %xmm0  ; 从 0x42281 加载16字节 → buffer[0:16]
movups -0x1f3d0(%rip), %xmm0  ; 从 0x4228e 加载16字节 → buffer[13:29]
movb  $0x0, 0x1d(%rax)        ; buffer[29] = '\0'
```

**正确读取方式**：

```
buffer[0:13]  = rodata[0x42281][0:13]  = "7qnnDZm85b05e"
buffer[13:29] = rodata[0x4228e][0:16]  = "f011cb4229154d3a"
完整目标 = "7qnnDZm85b05ef011cb4229154d3a" (29字节)
```

> ⚠️ 不能简单拼接两个 16+13=29 字节，因为有 3 字节重叠！

---

## 4. 解密过程

### 分割目标

```
Base64部分: "7qnnDZm"           (0:7)
RC4 Hex:    "85b05ef011cb"      (7:19)
XOR Hex:    "4229154d3a"         (19:29)
```

### 解密 content[0:5] - Base64 解码

```python
rotated = "mnopqrstuvwxyz0123456789+/ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkl"
indices = [rotated.index(c) for c in "7qnnDZm"]  
# [21, 4, 1, 1, 29, 51, 0]
# 解码 6bit 值 → 5字节: "T@Aw0"
```

### 解密 content[5:11] - RC4

```python
rc4_key = b"onmlkjihg"
hex_key = bytes.fromhex("85b05ef011cb")
content_5_11 = rc4_decrypt(hex_key, rc4_key)
# → b":,~}!m"
```

### 解密 content[11:16] - XOR

```python
xor_key = b"mnpklmwlmno"
hex_xor = bytes.fromhex("4229154d3a")
content_11_16 = bytes([hex_xor[i] ^ xor_key[i % 11] for i in range(5)])
# → b"/Ge&V"
```

### 完整 Flag

```
ISCC{T@Aw0:,~}!m/Ge&V}
```

---

## 5. 解题脚本

```python
# 密钥
rc4_key = b"onmlkjihg"
xor_key = b"mnpklmwlmno"

# 字母表
std = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
rotated = std[38:] + std[:38]  # shift = sum("demo-5483") % 64

# 目标常量 (注意重叠读取!)
target = "7qnnDZm85b05ef011cb4229154d3a"

# 1. Base64 解码
indices = [rotated.index(c) for c in target[:7]]
val = 0
for idx in indices: val = (val << 6) | idx
b64_decoded = bytes([(val>>34)&0xff, (val>>26)&0xff, (val>>18)&0xff, (val>>10)&0xff, (val>>2)&0xff])

# 2. RC4 解密
def rc4(data, key):
    S = list(range(256)); j = 0
    for i in range(256):
        j = (j + S[i] + key[i % len(key)]) % 256
        S[i], S[j] = S[j], S[i]
    out, i, j = bytearray(), 0, 0
    for b in data:
        i = (i + 1) % 256; j = (j + S[i]) % 256
        S[i], S[j] = S[j], S[i]
        out.append(b ^ S[(S[i] + S[j]) % 256])
    return bytes(out)

hex_key = bytes.fromhex(target[7:19])
rc4_decoded = rc4(hex_key, rc4_key)

# 3. XOR 解密
hex_xor = bytes.fromhex(target[19:29])
xor_decoded = bytes([hex_xor[i] ^ xor_key[i % 11] for i in range(5)])

# 4. 拼接
content = b64_decoded + rc4_decoded + xor_decoded
flag = b"ISCC{" + content + b"}"
print(flag.decode())  # ISCC{T@Aw0:,~}!m/Ge&V}
```
