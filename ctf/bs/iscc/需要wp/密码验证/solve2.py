#!/usr/bin/env python3
"""
ISCC 密码验证 - Complete solve script
Solves each part sequentially using reverse-engineered algorithm.
"""
import struct

# ============ Constants ============
def gmul(a, b):
    result = 0
    while b:
        if b & 1: result ^= a
        carry = a & 0x80
        a = (a << 1) & 0xFF
        if carry: a ^= 0x1B
        b >>= 1
    return result

def gf_inv(a):
    if a == 0: return 0
    for i in range(1, 256):
        if gmul(a, i) == 1: return i
    raise ValueError

def transform(b):
    return ((b - 0x13) & 0xFF) ^ 0x5A

def matrix_inverse_4x4(M):
    n = 4
    aug = [row[:] + [1 if i == j else 0 for j in range(n)] for i, row in enumerate(M)]
    for col in range(n):
        pivot = None
        for row in range(col, n):
            if aug[row][col] != 0:
                pivot = row; break
        aug[col], aug[pivot] = aug[pivot], aug[col]
        inv = gf_inv(aug[col][col])
        for j in range(2 * n): aug[col][j] = gmul(aug[col][j], inv)
        for row in range(n):
            if row != col and aug[row][col] != 0:
                f = aug[row][col]
                for j in range(2 * n): aug[row][j] ^= gmul(f, aug[col][j])
    return [[aug[i][n + j] for j in range(n)] for i in range(n)]

# Data
TABLE1_RAW = bytes.fromhex("5384792a17483deedb0c01b29fd0b566")
TABLE2_RAW = bytes.fromhex("6e6d6d6d6d6e6d6d6d6d6e6d6d6d6d6e")
TABLE3_RAW = bytes.fromhex("03f4a99a5e8b7c31224f40e5d66db7ca")
TABLE4 = b"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz{}_-!@#$%^&*()[]<>?.,:;+/\\"
AES_SBOX = bytes.fromhex("637c777bf26b6fc53001672bfed7ab76ca82c97dfa5947f0add4a2af9ca472c0b7fd9326363ff7cc34a5e5f171d8311504c723c31896059a071280e2eb27b27509832c1a1b6e5aa0523bd6b329e32f8453d100ed20fcb15b6acbbe394a4c58cfd0efaafb434d338545f9027f503c9fa851a3408f929d38f5bcb6da2110fff3d2cd0c13ec5f974417c4a77e3d645d197360814fdc222a908846eeb814de5e0bdbe0323a0a4906245cc2d3ac629195e479e7c8376d8dd54ea96c56f4ea657aae08ba78252e1ca6b4c6e8dd741f4bbd8b8a703eb5664803f60e613557b986c11d9ee1f8981169d98e949b1e87e9ce5528df8ca1890dbfe6426841992d0fb054bb16")
PERM = [2, 3, 0, 1]

c1 = bytes.fromhex("b4be6a40d6c25d3c")
c2 = bytes.fromhex("03191397f058e1df77be22ec")
c3 = bytes.fromhex("ba8fc95ccd230993b9a8")
puzzle = bytes.fromhex("77774b44001dc3976d59a95e2c49959fb027e532")

# Compute intermediate values
T1 = bytes(transform(b) for b in TABLE1_RAW)
T2 = bytes(transform(b) for b in TABLE2_RAW)
T3 = bytes(transform(b) for b in TABLE3_RAW)
R1 = bytes(a ^ b for a, b in zip(T1, T3))

temp = [0]*16
for i in range(4):
    for k in range(4):
        acc = 0
        for j in range(4):
            acc ^= gmul(T2[i*4+j], R1[k*4+j])
        temp[i*4+k] = acc
R2 = bytes(temp[PERM[i]*4+k] for i in range(4) for k in range(4))

R3 = bytearray(16)
for i in range(16):
    val = R1[i] ^ R2[i] ^ T3[i]
    R3[i] = AES_SBOX[val]
for i in range(1, 16):
    R3[i] ^= R3[i-1]
R3 = bytes(R3)

inter = bytes(R3[(i+1)%16] for i in range(8))
tea_key = [struct.unpack('>I', R1[i*4:(i+1)*4])[0] for i in range(4)]

print("=== Intermediates ===")
print(f"R1: {R1.hex()}")
print(f"R2: {R2.hex()}")
print(f"R3: {R3.hex()}")
print(f"Inter: {inter.hex()}")
print(f"TEA key: {[hex(k) for k in tea_key]}")

# ============ Solve flag1 ============
# Puzzle gives first 4 bytes of flag1
# Solve GF(2^8) linear system
P = [[puzzle[row + col*4] for row in range(4)] for col in range(4)]
target = [puzzle[16 + i] for i in range(4)]
M = [row[:] + [target[i]] for i, row in enumerate(P)]
for col in range(4):
    pivot = next(row for row in range(col, 4) if M[row][col] != 0)
    M[col], M[pivot] = M[pivot], M[col]
    inv = gf_inv(M[col][col])
    for j in range(5): M[col][j] = gmul(M[col][j], inv)
    for row in range(4):
        if row != col and M[row][col] != 0:
            f = M[row][col]
            for j in range(5): M[row][j] ^= gmul(f, M[col][j])
flag1_puz = bytes([M[i][4] for i in range(4)])
print(f"\nflag1[0:4] from puzzle: {flag1_puz.hex()} = {flag1_puz}")

# TEA decrypt of cipher1 gives xor_result
def tea_decrypt_le(ciphertext, key):
    v0, v1 = struct.unpack('>II', ciphertext)
    k0, k1, k2, k3 = key
    delta = 0x9E3779B9
    total = (delta * 16) & 0xFFFFFFFF
    for _ in range(16):
        v1 = (v1 - (((v0 << 4) + k2) ^ (v0 + total) ^ ((v0 >> 5) + k3))) & 0xFFFFFFFF
        v0 = (v0 - (((v1 << 4) + k0) ^ (v1 + total) ^ ((v1 >> 5) + k1))) & 0xFFFFFFFF
        total = (total - delta) & 0xFFFFFFFF
    return struct.pack('<II', v0, v1)

xr = tea_decrypt_le(c1, tea_key)
flag1_tea = bytes(a ^ b for a, b in zip(xr, inter))
print(f"flag1 from TEA (LE): {flag1_tea.hex()} = {flag1_tea}")

# Check: brute force flag1[4:8] to satisfy puzzle+TEA simultaneously
# Actually, let me try the approach from the puzzle first, and assume it's right
# If flag1_puz is right, then:
# xor_result[0:4] = flag1_puz ^ inter[0:4]
# TEA input for these bytes must give cipher1 first 4 bytes
# This means the TEA key might be different from what we computed

# Let me try: what TEA key would make puzzle-consistent flag1 work?
# This is the "key recovery" problem which is hard for TEA
# But maybe the key IS the one I computed, and the flag1 offsets are different

# Try: all 95^4 printable flag1[4:8] values
# Check if any make TEA_encrypt(flag1 ^ inter, key) == cipher1
print("\n=== Brute forcing flag1[4:8] (printable) ===")
def tea_encrypt_le(plaintext, key):
    v0, v1 = struct.unpack('<II', plaintext)
    k0, k1, k2, k3 = key
    delta = 0x9E3779B9
    total = 0
    for _ in range(16):
        total = (total + delta) & 0xFFFFFFFF
        v0 = (v0 + (((v1 << 4) + k0) ^ (v1 + total) ^ ((v1 >> 5) + k1))) & 0xFFFFFFFF
        v1 = (v1 + (((v0 << 4) + k2) ^ (v0 + total) ^ ((v0 >> 5) + k3))) & 0xFFFFFFFF
    return struct.pack('<II', v0, v1)

# Build xor_result with known first 4 bytes
known_xr = bytes(a ^ b for a, b in zip(flag1_puz, inter[:4]))

import itertools
import string
found = []
for combo in itertools.product(range(32, 127), repeat=4):
    flag1 = flag1_puz + bytes(combo)
    xr = bytes(a ^ b for a, b in zip(flag1, inter))
    try:
        encrypted = tea_encrypt_le(xr, tea_key)
        if encrypted == c1:
            found.append(flag1)
            print(f"  FOUND: flag1={flag1.hex()} = {flag1}")
            break
    except:
        pass
    # Progress
    if sum(1 for _ in [combo]) == 0:
        pass

if not found:
    print("  No match found with current key/inter")
    # Try different endianness for TEA
    def tea_encrypt_be(plaintext, key):
        v0, v1 = struct.unpack('>II', plaintext)
        k0, k1, k2, k3 = key
        delta = 0x9E3779B9
        total = 0
        for _ in range(16):
            total = (total + delta) & 0xFFFFFFFF
            v0 = (v0 + (((v1 << 4) + k0) ^ (v1 + total) ^ ((v1 >> 5) + k1))) & 0xFFFFFFFF
            v1 = (v1 + (((v0 << 4) + k2) ^ (v0 + total) ^ ((v0 >> 5) + k3))) & 0xFFFFFFFF
        return struct.pack('>II', v0, v1)
    
    print("  Trying BE TEA...")
    for combo in itertools.product(range(32, 127), repeat=4):
        flag1 = flag1_puz + bytes(combo)
        xr = bytes(a ^ b for a, b in zip(flag1, inter))
        encrypted = tea_encrypt_be(xr, tea_key)
        if encrypted == c1:
            found.append(flag1)
            print(f"  FOUND (BE): flag1={flag1.hex()} = {flag1}")
            break

if not found:
    print("  No match with puzzle-derived flag1 and TEA.")
    print("  This confirms intermediate values are inconsistent with puzzle.")
    # Maybe we should use TEA-derived flag1 and see if puzzle is wrong?
    print("\n  Using TEA-derived flag1 and solving remaining parts...")
    flag1 = flag1_tea
else:
    flag1 = found[0]

# ============ Solve flag2 ============
C_mat = [[R2[row + col*4] for col in range(4)] for row in range(4)]
C_inv = matrix_inverse_4x4(C_mat)
flag2 = bytearray(12)
for i in range(3):
    for j in range(4):
        acc = 0
        for k in range(4):
            acc ^= gmul(c2[i*4+k], C_inv[k][j])
        flag2[i*4+j] = acc
flag2 = bytes(flag2)
print(f"\nflag2: {flag2.hex()} = {flag2}")

# ============ Solve flag3 ============
seed = int.from_bytes(R3[:8], 'big')
state = seed
mult = 0x5851F42D4C957F2D
addend = 0x14057B7EF767814F
keystream = []
for _ in range(10):
    state = (state * mult + addend) & 0xFFFFFFFFFFFFFFFF
    keystream.append((state >> 0x18) & 0xFF)
flag3 = bytes(a ^ b for a, b in zip(c3, keystream))
print(f"flag3: {flag3.hex()} = {flag3}")

# ============ Verify checksums ============
xor_sum = 0
for b in flag1:
    xor_sum ^= b
rot = ((xor_sum << 3) | (xor_sum >> 5)) & 0xFF
check_byte = TABLE4[rot % 88]
print(f"\nChecksum: TABLE4[{rot%88}] = {chr(check_byte)} (flag2[0] = {chr(flag2[0])}) {'OK' if check_byte == flag2[0] else 'FAIL'}")

merged = flag1 + flag2
print(f"Final check a: TABLE4[{merged[8]%88}] = {chr(TABLE4[merged[8]%88])} (flag3[8] = {chr(flag3[8])}) {'OK' if TABLE4[merged[8]%88]==flag3[8] else 'FAIL'}")
print(f"Final check b: TABLE4[{merged[9]%88}] = {chr(TABLE4[merged[9]%88])} (flag3[9] = {chr(flag3[9])}) {'OK' if TABLE4[merged[9]%88]==flag3[9] else 'FAIL'}")

# ============ Assemble Flag ============
flag = b"ISCC{" + flag1 + flag2 + flag3 + b"}"
print(f"\nFLAG: {flag}")
try:
    print(f"FLAG: {flag.decode()}")
except:
    print(f"FLAG (hex): {flag.hex()}")
print(f"Length: {len(flag)}")
print(f"All printable: {all(32 <= b < 127 for b in flag[5:35])}")
