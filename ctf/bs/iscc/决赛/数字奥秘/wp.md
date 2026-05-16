# 数字奥秘 WP

## 题目概览

附件目录里只有：

- `attachment-65.zip`
- `题目提示.txt`

提示内容：

```text
真正的秘密藏在数字之间
提示1：真正的数字奥秘：VTFWT1Fsb3diRVJSVjJSS1VraENWVll4VlRGU1JtZDRWR3RhVldKRk5WRldWM2MwWlZVeFJWTlVSVDA9
```

这串内容多次 Base64 解码后得到：

```text
:SYNC_SENSOR_2025
```

## 一、解压并检查附件

压缩包里只有一个文件：

```text
challenge.bin
```

但 `file` 识别结果表明它实际是 PNG。

进一步解析 PNG 可以发现：

- `tEXt` 文本块里藏了题目的关键数据
- `IEND` 后面还有额外附加数据

PNG 里的关键文本块如下：

```text
SYNC_CODE
PERIODS = [92, 80, 576, 1227, 1622, 436, 823, 786]
SYNC_HINT = payload=base64;encryption=xor;key=merged_result;method=crt
SYNC_PAYLOAD = KwgMpDQIvvoJKmzw4Zq+IRHQ6o7uKTti4fxvx551rVMuPCuhfBY=
README
```

`README` 内容：

```text
1. Run vm.py to get sensor data
2. If data looks incorrect, check vm.py for bugs
3. Use correct data with PERIODS to solve constraints
4. Decrypt payload with the key
```

## 二、提取隐藏的 vm.py

PNG 在 `IEND` 后还有 3006 字节尾随数据，直接提取后可以看到是一段 Python 源码。

核心逻辑是一个 Brainfuck 变体 VM：

- `+` / `-` / `>` / `<` / `[` / `]` 是常规 Brainfuck 指令
- `*`：把当前单元乘以 `0.1` 存进浮点寄存器
- `#`：输出浮点寄存器值，源码里写的是 `int(self.fp_reg)`

这一段非常关键：

```python
elif cmd == '*':
    self.fp_reg = self.memory[self.ptr] * 0.1
elif cmd == '#':
    val = int(self.fp_reg)  # 直接截断
    self.output.append(val)
```

题目 `README` 明示“如果数据不对，检查 vm.py for bugs”，这里的 `int()` 直接截断就是故意埋的坑。

## 三、分析 SYNC_CODE

`SYNC_CODE` 实际不是复杂程序，而是 8 段重复结构：

```text
+++...*#>++++...*#>...++++...*#
```

也就是说，每一段只是：

1. 把当前单元加到某个值
2. 执行 `*`
3. 执行 `#`
4. `>` 到下一个单元

因此输出本质上就是 8 个数字。

### 1. 按原始 VM 运行

原始 `int()` 截断版输出：

```python
[33, 65, 241, 172, 539, 129, 28, 445]
```

### 2. 修复 bug 后运行

把 `int(self.fp_reg)` 改成正常四舍五入后：

```python
[34, 66, 242, 173, 540, 130, 29, 446]
```

这组数据才是正确的 sensor data。

## 四、用 PERIODS 做 CRT

题目提示里已经写了：

```text
method=crt
```

于是解下面这组同余：

```text
x ≡ 34  (mod 92)
x ≡ 66  (mod 80)
x ≡ 242 (mod 576)
x ≡ 173 (mod 1227)
x ≡ 540 (mod 1622)
x ≡ 130 (mod 436)
x ≡ 29  (mod 823)
x ≡ 446 (mod 786)
```

CRT 最小正解为：

```text
2649266
```

总模数为：

```text
258203493986425920
```

这里只需要最小正解 `2649266`。

## 五、恢复最终 key

如果直接拿 `2649266` 去循环异或 `SYNC_PAYLOAD`，并不能得到正常明文。

结合最开始提示多层 Base64 解出的：

```text
:SYNC_SENSOR_2025
```

可以推断最终 key 不是单独的 CRT 结果，而是：

```text
2649266:SYNC_SENSOR_2025
```

再结合异或后仍不像正常短 key，可以继续测试常见做法，最终命中：

```python
sha256(b"2649266:SYNC_SENSOR_2025").digest()
```

也就是说，真正用于异或的是这串文本的 `sha256` 摘要。

## 六、解出 payload

解密代码：

```python
import base64
import hashlib

payload = base64.b64decode("KwgMpDQIvvoJKmzw4Zq+IRHQ6o7uKTti4fxvx551rVMuPCuhfBY=")
key = hashlib.sha256(b"2649266:SYNC_SENSOR_2025").digest()

flag = bytes(c ^ key[i % len(key)] for i, c in enumerate(payload))
print(flag.decode())
```

输出：

```text
ISCC{c1eDSXCxukOTnJhwLDxLbvD87psLgdF3}
```

## Flag

```text
ISCC{c1eDSXCxukOTnJhwLDxLbvD87psLgdF3}
```
