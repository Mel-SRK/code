#!/usr/bin/env python3
"""
ISCC 2026 Day1 - 暗箱解密行动 (Dark Box Decryption Operation)
Mobile CTF Challenge - Exploit Script

Password parts (24 chars total):
  p1 = CT.=6`    (from p1_display.png hex: 43542E3D3660)
  p2 = ATMtJf     (FNV=0xEFAF45, XOR=0, interlock with p1)
  p3 = DkAdfl     (FNV=0x25B657, XOR=0, data.bin offset check)
  p4 = C0DE!!     (Base64 encoding check)

Decryption: RC4 with full password as key
"""

import hashlib


def rc4_crypt(key: bytes, data: bytes) -> bytes:
    S = list(range(256))
    j = 0
    for i in range(256):
        j = (j + S[i] + key[i % len(key)]) & 0xFF
        S[i], S[j] = S[j], S[i]

    result = bytearray()
    i = j = 0
    for byte in data:
        i = (i + 1) & 0xFF
        j = (j + S[i]) & 0xFF
        S[i], S[j] = S[j], S[i]
        k = S[(S[i] + S[j]) & 0xFF]
        result.append(byte ^ k)
    return bytes(result)


if __name__ == '__main__':
    p1 = "CT.=6`"
    p2 = "ATMtJf"
    p3 = "DkAdfl"
    p4 = "C0DE!!"
    password = p1 + p2 + p3 + p4

    print(f"Password: {password}")
    print(f"Length: {len(password)}")

    # Verify SHA-256
    sha = hashlib.sha256(password.encode()).hexdigest()
    expected = "34a13d854d774f43313b5db4e1c9551ea189f176ae78e75b496b1d3805b94b2e"
    print(f"SHA-256: {sha}")
    print(f"Match: {sha == expected}")

    # Decrypt flag
    import os
    apk_dir = '/tmp/apk_analysis'
    with open(f'{apk_dir}/assets/flag.enc', 'rb') as f:
        flag_enc = f.read()

    flag = rc4_crypt(password.encode(), flag_enc)
    print(f"\nFlag: {flag.decode()}")
