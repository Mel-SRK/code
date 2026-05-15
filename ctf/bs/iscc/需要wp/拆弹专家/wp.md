# 拆弹专家 Writeup

**ISCC 拆弹专家 - Reverse Engineering**

附件给出一个 C++ 源文件，实现了一个"拆弹"程序，需要依次输入 3 个密码才能拆除炸弹并获得 Flag。

---

## 第一关：魔方密码

通过分析 `sg6j` 函数可知：
- 输入必须是 8 个 ASCII 可打印字符
- 使用魔方密码 (2x2x2 Rubik's cube cipher) 加密，密钥为 `R U F R' D2`
- 密文 base64 编码后做 FNV1a32 hash，与预期值比较

关键注释 `line 637` 直接泄露了第一关答案：
```cpp
static const uint32_t EXPECT_OBF = 0xCB040F00u; // generated for stage1=CGKKIURA
```

**密码1：`CGKKIURA`**

---

## 第二关：线性方程组

`d4n7` 函数根据第一关的 hash 值生成系数 `g_a[5]` 和目标值 `g_e[5]`：

1. 从 hash 中提取偏移修正基础系数 `[2,3,4,5,6]`
2. 用 `hash ^ 0x12345678` 做种子运行 LCG 生成 x1~x5
3. 构造线性方程组计算 g_e

LCG 参数：`state = state * 1664525 + 1013904223 (mod 2^32)`

方程组：
```
e1 = a1*x1 + x2 + x5
e2 = x1 + a2*x2 + x3
e3 = x2 + a3*x3 + x4
e4 = x3 + a4*x4 + x5
e5 = x1 + x4 + a5*x5
```

输入格式为 9 位数字：`x1` (1位) + `x2` (2位) + `x3` (2位) + `x4` (2位) + `x5` (2位)

由于系数和目标值都是由同一个种子派生的，直接取 LCG 生成的 x 值即可。

计算得：`g_a = [3, 5, 6, 5, 8]`，`x = [4, 35, 18, 25, 86]`

**密码2：`435182586`**

---

## 第三关：迷宫

`b5k8` 函数根据 seed 生成 4x4 迷宫：
- seed = `atoi(password2) ^ (stage1_hash * 0x9E3779B1)`
- 用 LCG 随机生成一条从 (0,0) 到 (3,3) 的通路
- 额外随机格子的条件 `(r % 100) < -0.1` 恒为 false，所以只有主路径

迷宫（1 可通行，0 墙壁）：
```
1100
0110
0011
0001
```

BFS 求最短路径，使用 LRUD 四个方向输入。

**密码3：`RDRDRD`**

---

## Flag

```
ISCC{CGKKIURA435182586RDRDRD}
```
