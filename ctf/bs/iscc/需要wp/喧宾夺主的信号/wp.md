# 喧宾夺主的信号 - Writeup

## 1. 分析流量

pcapng 中有 1509 个数据包：

- **1500 个 UDP 包**：源 192.168.1.100，目标 239.255.255.250:1900 (SSDP 组播)，每个包携带 28 字节看似随机的 base64 数据（掩护流量）
- **9 个 TCP 包**：192.168.1.100 → 45.78.1.1:80，是一次 HTTP POST

## 2. 提取 HTTP 中的 ZIP

TCP 流中的 HTTP POST 请求携带 JSON，内含 base64 编码的 AES 加密 ZIP：

```
POST /command HTTP/1.1
Host: 45.78.1.1
Content-Type: application/json
Content-Length: 684

{"instruction": "UEsDBBQAAQBjABNEdFybqEoDTQEAAN4BAAAJAAsAaW1hZ2UucG5nAZkHAAEAQUUDCAA4w3yesc6CYBVwJuaOy5z+8ACPGlSjDuBxmXCPSvhfPKDs+zlC+yJhkO6dIJV/EwwrEleXBT0biEbx/U+7V+QfBzTcgKjX7Hc7X/7L7KoHzb6/HN2sjWacIZJNiY0YF+TQvMD6KtDuzLHtsm9e2Np9CbzCJ2TPaCaEasFFmfsJhlX+VxtBf0lq3XFU+POgR6+hI0nlF36l6LXRy8YHOKdpoKE6foAcYRvpupJ7U9LaaDk9BybOWHFH3zc9hA1pq08r3A09MwpFtvYfWa1jxVp/FQfBzLBxGAT2HFJT4kXmnbG+WzmqdwIXhyx5883YKgGMVJJDdiduls7fT34wTN+jqW6QmyLM4V5ZoAMKifst8RPAiXqCKPAU8NA0QLABVFnY4vje8H735Okn3URuIXc8knWqUJlPHmNfaqVq3wst05m8pO3j1hOKLLdgNEJQSwECFAAUAAEAYwATRHRcm6hKA00BAADeAQAACQALAAAAAAAAAAAAtoEAAAAAaW1hZ2UucG5nAZkHAAEAQUUDCABQSwUGAAAAAAEAAQBCAAAAfwEAAAAA", "note": "This is the real command."}
```

将 `instruction` 字段 base64 解码得到 AES 加密的 ZIP 文件（含 `image.png`）。

## 3. 寻找密码

题目提示「声东击西，三十六计第一套第六计」——关键线索是 **6**。

UDP 组播的 1500 个包中有 1497 个唯一 payload，其中存在一个**出现 2 次的重复 payload**。找出重复包并解码：

```
Hex: 55 32 68 6c 62 6d 64 45 62 32 35 6e 53 6d 6c 59 61 55 41 7a 4e 69 30 78 4c 54 59 3d
```

hex 解码得到 ASCII：
```
U2hlbmdEb25nSmlYaUAzNi0xLTY=
```

再次 base64 解码得到密码：

```
ShengDongJiXi@36-1-6
```

即「声东击西」拼音 + 36计-第1套-第6计。

## 4. 解压 ZIP 并 LSB 隐写

用密码解压得到 100×100 的 PNG 图片。图像看似纯色，但分析后发现：

- 大部分像素 RGB 值为 `(73, 109, 137)`
- 另有 108 个像素的 RGB 值有 ±1 的微小偏差，共 8 种颜色
- 这是典型的 **LSB 隐写**：每个像素 3 通道共 3 bit 数据

提取所有像素 RGB 通道的 LSB（最低有效位），按 MSB 优先拼接为字节，得到 flag。

## Flag

**`ISCC{1d3fa1fc4t10n_1s_th3_hk3y_t0j_v1ct0Zry}`**
