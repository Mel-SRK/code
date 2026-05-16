# 灰签名回廊 WP

## 题目概览

附件是一个 APK：`attachment-68.apk`。

目录里原本给了一个 `exp.py`，但脚本有问题，直接跑不出结果，需要先修正再利用。

最终 `flag`：

```text
ISCC{SD5URMm_Sgf8_f7c3_2vhUry}
```

## 一、先看 Java 逻辑

用 `jadx` 反编译后，核心类在：

- `jadx_out/sources/com/example/gnd/security/SecureValidator.java`
- `jadx_out/sources/com/example/gnd/hidden/SecretContentProvider.java`
- `jadx_out/sources/com/example/gnd/hidden/SecretReceiver.java`
- `jadx_out/sources/com/example/gnd/hidden/SecretActivity.java`

主校验在 `SecureValidator.c(String str)`。

关键逻辑：

1. 输入必须满足：

```text
str.startsWith("ISCC{")
str.endsWith("}")
```

2. 去掉前后包裹后，内部长度必须是：

```text
nativeGetMagicNumber() * 2
```

而 native 里 `nativeGetMagicNumber()` 返回 `0xc`，所以总长度是 `24`。

3. 内部再被切成四段：

- `part1 = [0:7]`
- `part2 = [7:12]`
- `part3 = [12:17]`
- `part4 = [17:24]`

4. `part2/3/4` 的 key 来源：

- `fragment2`：来自导出的 `ContentProvider`
- `fragment3`：来自隐藏 `BroadcastReceiver`
- `fragment4`：来自隐藏 `Activity`

## 二、隐藏片段恢复

### 1. fragment2

`SecretContentProvider.query()` 里直接写死了：

```java
int[] iArr = {82, 32, 37, 67};
arrayList.add((char)(iArr[i] ^ 23));
```

解出来明文是：

```text
E72T
```

之后再经 `f00.t()` 做了一层自定义 base64 编码缓存到 `fragment2`。

### 2. fragment3

`SecretReceiver` 中：

- 广播 action：`com.example.gnd.SECRET_ACTION`
- 先发 `code=auth` 且 `token=ISCC2026`
- 再发 `code=getkey` 且 `part=3`

代码里：

```java
int[] iArr = {12, 28, 11, 51};
arrayList.add((char)((i ^ iArr[i]) ^ 90));
```

解出来明文是：

```text
VGSj
```

### 3. fragment4

`SecretActivity` 通过 deeplink 触发：

```text
securevault://secret/unlock?token=RC4_KEY_PART4
```

取字节数组：

```java
byte[] bArr = {73, 83, 67, 67, 50, 48, 50, 82, 86};
String strT = f00.t(new String(new byte[]{bArr[7], bArr[8]}, mb.a));
```

所以明文是：

```text
RV
```

## 三、前三段直接逆出来

### 1. part1

Java 和 native 配合后，目标字节是：

```text
[83, 66, 49, 81, 84, 73, 105]
```

现成 `exp.py` 已经把逆向公式写出来了：

```python
bytes(((byte ^ 0x07) - 1) & 0xFF for byte in PART1_TARGET)
```

得到：

```text
SD5URMm
```

### 2. part2

利用 `fragment2 = E72T`，按 native 校验逆出：

```text
_Sgf8
```

### 3. part3

利用 `fragment3 = VGSj`，按 native 校验逆出：

```text
_f7c3
```

所以此时已知前缀就是：

```text
ISCC{SD5URMm_Sgf8_f7c3
```

## 四、现有 exp 的两个关键错误

原脚本主要错了两处。

### 1. 前缀写错

原脚本写的是：

```python
FLAG_PREFIX = "ISCC2"
```

但真实前缀应为：

```python
FLAG_PREFIX = "ISCC{"
```

### 2. chain token 少了一步最终混合

`nativeComputeChainToken()` 在处理完数据后，还有一段额外 avalanche：

```c
tmp = value ^ (value >> 33)
mixed = tmp * 0xff51afd7ed558ccd
return mixed ^ (mixed >> 33)
```

原脚本的 `compute_chain_token()` 直接返回了循环后的 `value`，导致：

- `chain token` 错
- `part4` RC4 key 错
- 后面全部搜索空间都跑偏

修正后得到：

```text
chain token = 0x9934a2a3b84e12d3
rc4 key     = 80772dcd453732545647536a0000
```

## 五、part4 处理

`part4` 总长 7。

其中前 4 位受 native `nativeVerifyPart4()` 约束，后 3 位只参与最终 SHA-256。

### 1. 先筛前 4 位

脚本根据 native RC4 和位运算条件枚举前 4 位，得到合法前缀集合。

修正后生成的前缀数量为：

```text
59598
```

### 2. 再爆最后 3 位

总 keyspace 为：

```text
59598 * 63^3 = 14902301106
```

直接 Python 跑太慢，所以用 `hashcat`。

命令形态：

```bash
hashcat -m 1400 -a 6 solver_work/sha256_target.txt solver_work/hashcat_prefixes.txt '?1?1?1}' -1 abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_
```

其中：

- 左边 wordlist 是所有合法前 4 位前缀
- 右边 mask 是最后 `3` 个未知字符再补上 `}`

最开始纯 kernel 速度只有约 `7.8 MH/s`，切到优化内核 `-O` 后速度约 `48 MH/s`，几分钟内即可出结果。

命中结果为：

```text
ISCC{SD5URMm_Sgf8_f7c3_2vhUry}
```

## 六、最终结论

题目本质是：

1. Java 层拆分四段
2. 三个隐藏组件给出 `fragment2/3/4`
3. native 校验决定 `part1~part4` 的结构
4. 最终再过一层整串 SHA-256

修掉原 `exp.py` 的两个错误后，配合 `hashcat` 即可稳定复现。

最终 `flag`：

```text
ISCC{SD5URMm_Sgf8_f7c3_2vhUry}
```
