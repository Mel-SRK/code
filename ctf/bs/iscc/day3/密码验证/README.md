# ISCC 密码验证 - 状态总结

## 算法分析完成度
核心算法已完整逆向，包括：
- TEA 加密验证（16轮，δ=0x9E3779B9）
- GF(2^8) 矩阵乘法验证
- LCG 流密码验证
- Puzzle 矩阵约束
- 校验和和最终检查

## 阻塞点
`combine_T1_T3` 函数的 C++ vector insert 操作复杂度过高，无法通过纯静态分正确中间值 R1/R2/R3。

## 已确定的部分结果
- flag1[0:4] = "(:Q?" (0x283a513f) — 从 Puzzle GF(2^8) 线性方程组解出，已验证正确
- T2 = 单位矩阵（简化了 R2 计算）

## 需要动态调试的部分
1. 使用 Frida hook `verifyFlag` 获取 R1, R2, R3 实际值
2. 或在 Android 模拟器中运行 APK

## 文件清单
- WP.md: 完整算法分析
- solve.py / solve2.py: 求解脚本
- progress.md: 技术细节记录
