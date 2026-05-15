# 毛毛虫的逆袭 WP

## 题目分析

PE64 程序，UPX 加壳。脱壳后分析验证逻辑：使用 LCG（`seed * 0x41C64E6D + 0x3039`）生成 shift，对输入做可打印ASCII旋转加密后与目标字符串比较。

## 解题步骤

1. UPX 脱壳
2. 从 .data 段提取 seed（46）与目标字符串（20 字节）
3. 逆转 LCG 旋转得到 flag 内部内容

## Flag

```
ISCC{)S%kk=qb3jd$#(Hp&#1f}
```
