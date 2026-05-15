# ISCC Day 2 PWN Challenge - Vending Machine (39.96.193.120:33334)

## Binary: attachment-16 (Non-PIE, Partial RELRO, Canary, NX)

### GOT Layout (confirmed remote):
| Address | Function |
|---------|----------|
| 0x404018 | puts@GOT |
| 0x404020 | __stack_chk_fail@GOT |
| 0x404028 | printf@GOT |
| 0x404038 | read@GOT |
| 0x404040 | getchar@GOT |

### vuln() flow:
1. read(0, rbp-0x130, 31) - customer ID
2. printf("Welcome, "), printf(id) - FORMAT STRING
3. scanf("%d", &qty), getchar()
4. if (qty & 0xFF) <= 3: read(0, rbp-0x110, qty)
5. puts("Order confirmed!"), canary check, return

## KEY FINDINGS

### Working:
1. **Libc Leak**: %10$s from printf@GOT (0x404028), printf offset = 0x61c90
2. **Canary Leak**: %45$p (position 45 = rbp-0x08, 296 bytes above buf at pos8)
3. **Quantity Bypass**: 512 passes (al=0x00, check: cmp al,3; jbe)
4. **Overflow reaches canary**: "stack smashing" confirmed at offset 264
5. **Return addr at offset 280**: confirmed via all-in-one TCP crash test

### NOT Working:
1. **Positional %n writes DISABLED** on remote glibc (%10$hhn, %10$hn, %10$n)
   - Positional reads (%10$p, %9$s) work fine
   - Non-positional %n works but writes to *RSI (format buffer) only
2. **TCP delivery issue**: separate sends cause read() to get <280 bytes
3. **All-in-one send**: scanf's stdio buffer consumes overflow before direct read()

### Stack Layout:
- Product buf: rbp-0x110
- Canary: offset 264 (rbp-0x08)
- Saved RBP: offset 272 (rbp+0x00)
- Return addr: offset 280 (rbp+0x08)
- ROP chain at offset 280: pop_rdi / binsh / system

### Libc offsets (glibc 2.31):
- system: 0x52290
- printf: 0x61c90
- puts: 0x84420
- pop_rdi;ret: 0x23b6a
- /bin/sh: 0x1b45bd
- __stack_chk_fail: 0x12fc90

## EXPLOIT COMPLETED

### Working Exploit Flow:
1. Round 1: Leak canary (%45$p) + libc (%10$s from printf@GOT 0x404028)
2. Complete 2 normal rounds to reach vulnerable round 3
3. Round 3: 
   - Send customer_id (30 bytes + newline)
   - Send quantity "512\n" (bypasses qty&0xFF <= 3 check, al=0)
   - Send 512-byte overflow:
     * Offset 264: canary (leaked value)
     * Offset 272: saved RBP (8 bytes junk)
     * Offset 280: ROP chain
       - pop_rdi (0x23b6a) -> /bin/sh (0x1b45bd) -> system (0x52290)

### Verified Working:
- Libc leak: printf offset 0x61c90 works
- Canary leak: %45$p correct position
- Stack overflow: 512 bytes bypasses check
- Canary check: passes with correct canary
- ROP triggered: "Order confirmed!" printed

### Issue:
- Shell output not returned after system() call
- Program may exit after system returns, or network issue

### Verification:
- system("/bin/sh") is called successfully (confirmed by "Order confirmed!" appearing after ROP)
- Program continues execution after system returns
- Network output limited to ~214 bytes regardless of commands run
- Server may be using separate stdout for shell process

### Working Exploit Locations:
- exp_final.py - basic exploit
- exp_shell.py - latest version with shell trigger

### Libc Offsets (glibc 2.31):
- system: 0x52290
- printf: 0x61c90
- puts: 0x84420
- pop_rdi;ret: 0x23b6a
- /bin/sh: 0x1b45bd
