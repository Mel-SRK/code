#!/usr/bin/env python3
"""
Solves the ISCC 密码验证 Android reverse challenge.
Algorithm reverse-engineered from libnativecrypto.so
"""
import struct

# ============ Asset Files ============
cipher1 = bytes.fromhex("b4be6a40d6c25d3c")  # 8 bytes
cipher2 = bytes.fromhex("03191397f058e1df77be22ec")  # 12 bytes
cipher3 = bytes.fromhex("ba8fc95ccd230993b9a8")  # 10 bytes
puzzle  = bytes.fromhex("77774b44001dc3976d59a95e2c49959fb027e532")  # 20 bytes

# ============ Embedded Tables from libnativecrypto.so ============
TABLE1_RAW = bytes.fromhex("5384792a17483deedb0c01b29fd0b566")
TABLE2_RAW = bytes.fromhex("6e6d6d6d6d6e6d6d6d6d6e6d6d6d6d6e")
TABLE3_RAW = bytes.fromhex("03f4a99a5e8b7c31224f40e5d66db7ca")

TABLE4 = b"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz{}_-!@#$%^&*()[]<>?.,:;+/\\"
PERM = [2, 3, 0, 1]  # ShiftRows permutation

AES_SBOX = bytes.fromhex(
    "637c777bf26b6fc53001672bfed7ab76"
    "ca82c97dfa5947f0add4a2af9ca472c0"
    "b7fd9326363ff7cc34a5e5f171d83115"
    "04c723c31896059a071280e2eb27b275"
    "09832c1a1b6e5aa0523bd6b329e32f84"
    "53d100ed20fcb15b6acbbe394a4c58cf"
    "d0efaafb434d338545f9027f503c9fa8"
    "51a3408f929d38f5bcb6da2110fff3d2"
    "cd0c13ec5f974417c4a77e3d645d1973"
    "60814fdc222a908846eeb814de5e0bdb"
    "e0323a0a4906245cc2d3ac629195e479"
    "e7c8376d8dd54ea96c56f4ea657aae08"
    "ba78252e1ca6b4c6e8dd741f4bbd8b8a"
    "703eb5664803f60e613557b986c11d9e"
    "e1f8981169d98e949b1e87e9ce5528df"
    "8ca1890dbfe6426841992d0fb054bb16"
)

# ============ Helper Functions ============
def transform(b):
    """Table byte transform: ((b - 0x13) & 0xFF) ^ 0x5A"""
    return ((b - 0x13) & 0xFF) ^ 0x5A

def gmul(a, b):
    """GF(2^8) multiplication with AES polynomial 0x1B"""
    result = 0
    while b:
        if b & 1:
            result ^= a
        carry = a & 0x80
        a = (a << 1) & 0xFF
        if carry:
            a ^= 0x1B
        b >>= 1
    return result

def gf_inv(a):
    """GF(2^8) multiplicative inverse"""
    if a == 0:
        return 0
    for i in range(1, 256):
        if gmul(a, i) == 1:
            return i
    raise ValueError(f"No inverse for {a}")

def matrix_inverse_4x4(M):
    """Compute 4x4 matrix inverse in GF(2^8)"""
    n = 4
    # Augment with identity
    aug = [row[:] + [1 if i == j else 0 for j in range(n)] for i, row in enumerate(M)]
    for col in range(n):
        # Find pivot
        pivot = None
        for row in range(col, n):
            if aug[row][col] != 0:
                pivot = row
                break
        if pivot is None:
            raise ValueError("Matrix is singular")
        aug[col], aug[pivot] = aug[pivot], aug[col]
        # Normalize pivot row
        inv_pivot = gf_inv(aug[col][col])
        for j in range(2 * n):
            aug[col][j] = gmul(aug[col][j], inv_pivot)
        # Eliminate other rows
        for row in range(n):
            if row != col and aug[row][col] != 0:
                factor = aug[row][col]
                for j in range(2 * n):
                    aug[row][j] ^= gmul(factor, aug[col][j])
    return [[aug[i][n + j] for j in range(n)] for i in range(n)]

def tea_decrypt(ciphertext, key):
    """TEA decryption (16 rounds, standard delta)"""
    v0, v1 = struct.unpack('>II', ciphertext)
    k0, k1, k2, k3 = key
    delta = 0x9E3779B9
    total = (delta * 16) & 0xFFFFFFFF
    for _ in range(16):
        v1 = (v1 - (((v0 << 4) + k2) ^ (v0 + total) ^ ((v0 >> 5) + k3))) & 0xFFFFFFFF
        v0 = (v0 - (((v1 << 4) + k0) ^ (v1 + total) ^ ((v1 >> 5) + k1))) & 0xFFFFFFFF
        total = (total - delta) & 0xFFFFFFFF
    return struct.pack('>II', v0, v1)

def lcg_generate(seed, count):
    """LCG PRNG keystream generation"""
    state = seed & 0xFFFFFFFFFFFFFFFF
    mult = 0x5851F42D4C957F2D
    addend = 0x14057B7EF767814F
    output = []
    for _ in range(count):
        state = (state * mult + addend) & 0xFFFFFFFFFFFFFFFF
        output.append((state >> 0x18) & 0xFF)
    return bytes(output)

# ============ Compute Intermediate Values ============
T1 = bytes(transform(b) for b in TABLE1_RAW)  # 16 bytes
T2 = bytes(transform(b) for b in TABLE2_RAW)  # 16 bytes
T3 = bytes(transform(b) for b in TABLE3_RAW)  # 16 bytes

# R1 = T1 ^ T3 (element-wise)
R1 = bytes(a ^ b for a, b in zip(T1, T3))

# R2 = T2 * R1 in GF(2^8) matrix form, then ShiftRows
# T2 is 4x4 matrix, R1 is treated as 4x4 column-major
# temp[i,k] = Σ_j T2[i,j] * R1[k,j]  (i=row, k=col, j=inner)
temp = [0] * 16
for i in range(4):       # row of T2 (result row)
    for k in range(4):   # col of R1 (result col)
        acc = 0
        for j in range(4):  # inner dim
            acc ^= gmul(T2[i * 4 + j], R1[k * 4 + j])
        temp[i * 4 + k] = acc

# ShiftRows: R2[i][k] = temp[PERM[i]][k]
R2 = bytes(temp[PERM[i] * 4 + k] for i in range(4) for k in range(4))

# R3: S-box + cumulative XOR
R3 = bytearray(16)
for i in range(16):
    val = R1[i] ^ R2[i] ^ T3[i]
    R3[i] = AES_SBOX[val]
for i in range(1, 16):
    R3[i] ^= R3[i - 1]
R3 = bytes(R3)

print("=== Intermediate Values ===")
print(f"T1: {T1.hex()}")
print(f"T2: {T2.hex()}")
print(f"T3: {T3.hex()}")
print(f"R1: {R1.hex()}")
print(f"R2: {R2.hex()}")
print(f"R3: {R3.hex()}")
print()

# T2 is an identity matrix
print(f"T2 as 4x4 matrix: {[[T2[i*4+j] for j in range(4)] for i in range(4)]}")

# ============ Solve Flag Part 1 (8 bytes) via TEA ============
# Key intermediate: inter = R3[1:9] (bytes at indices 1..8)
inter = bytes(R3[(i + 1) % 16] for i in range(8))
print(f"inter (R3[1:9]): {inter.hex()}")

# TEA key from R1 as 4 big-endian uint32
tea_key = [struct.unpack('>I', R1[i * 4:(i + 1) * 4])[0] for i in range(4)]
print(f"TEA key: {[hex(k) for k in tea_key]}")

# Decrypt cipher1 to get xor_result
xor_result = tea_decrypt(cipher1, tea_key)
print(f"xor_result (TEA decrypted): {xor_result.hex()}")

# flag1 = xor_result XOR inter
flag1 = bytes(a ^ b for a, b in zip(xor_result, inter))
print(f"Flag part 1: {flag1}")

# ============ Verify Puzzle Constraints ============
# Puzzle matrix P[4][4]: P[i][j] = puzzle[j + i*4]
# Check: for each col i: Σ_j gmul(P[i][j], flag1[j]) == puzzle[16+i]
P = [[puzzle[j + i * 4] for j in range(4)] for i in range(4)]
b_puz = [puzzle[16 + i] for i in range(4)]
print(f"\nPuzzle matrix P:")
for row in P:
    print(f"  {[hex(x) for x in row]}")
print(f"Puzzle target: {[hex(x) for x in b_puz]}")

# Verify puzzle constraints with computed flag1
for i in range(4):
    acc = 0
    for j in range(4):
        acc ^= gmul(P[i][j], flag1[j])
    assert acc == b_puz[i], f"Puzzle constraint {i} failed: {acc} != {b_puz[i]}"
print("Puzzle constraints VERIFIED")

# ============ Solve Flag Part 2 (12 bytes) via Matrix Inverse ============
# R2 is a 4x4 matrix (column-major representation in the 16-byte vector)
# flag2 is 3×4 byte matrix (12 bytes, row-major)
# Operation: result[i*4+j] = Σ_k gmul(flag2[k + i*4], R2[k + j*4]) 
# This is: result[3x4] = flag2[3x4] × R2[4x4]
# We have cipher2 = result, so flag2 = cipher2 × R2_inv
C_mat = [[R2[row + col * 4] for col in range(4)] for row in range(4)]
print(f"\nR2 as 4x4 matrix:")
for row in C_mat:
    print(f"  {[hex(x) for x in row]}")

C_inv = matrix_inverse_4x4(C_mat)
print(f"R2 inverse:")
for row in C_inv:
    print(f"  {[hex(x) for x in row]}")

# cipher2 is organized as 3 rows × 4 cols (row-major)
# flag2[i*4 + j] = Σ_k gmul(cipher2[i*4 + k], C_inv[k][j])
flag2 = bytearray(12)
for i in range(3):
    for j in range(4):
        acc = 0
        for k in range(4):
            acc ^= gmul(cipher2[i * 4 + k], C_inv[k][j])
        flag2[i * 4 + j] = acc
flag2 = bytes(flag2)
print(f"Flag part 2: {flag2}")

# Verify: result = flag2 × C_mat should equal cipher2
for i in range(3):
    for j in range(4):
        acc = 0
        for k in range(4):
            acc ^= gmul(flag2[i * 4 + k], C_mat[k][j])
        assert acc == cipher2[i * 4 + j], f"Matrix verify failed at ({i},{j})"
print("Matrix multiply VERIFIED")

# ============ Verify Checksum Constraint ============
xor_sum = 0
for b in flag1:
    xor_sum ^= b
rot = ((xor_sum << 3) | (xor_sum >> 5)) & 0xFF
expected_byte = TABLE4[rot % 88]
assert expected_byte == flag2[0], f"Checksum failed: {chr(expected_byte)} != {chr(flag2[0])}"
print(f"Checksum constraint VERIFIED: TABLE4[{rot % 88}] = '{chr(expected_byte)}' == flag2[0]")

# ============ Solve Flag Part 3 (10 bytes) via LCG ============
seed = int.from_bytes(R3[:8], 'big')
print(f"\nLCG seed (R3[0:8]): {hex(seed)}")
keystream = lcg_generate(seed, 10)
flag3 = bytes(a ^ b for a, b in zip(cipher3, keystream))
print(f"Flag part 3: {flag3}")

# ============ Verify Final Checks ============
merged = flag1 + flag2
assert TABLE4[merged[8] % 88] == flag3[8], f"Final check 1 failed"
assert TABLE4[merged[9] % 88] == flag3[9], f"Final check 2 failed"
print(f"Final checks VERIFIED")

# ============ Assemble Flag ============
flag = b"ISCC{" + flag1 + flag2 + flag3 + b"}"
print(f"\n{'='*60}")
try:
    print(f"FLAG: {flag.decode()}")
except:
    print(f"FLAG (hex): {flag.hex()}")
print(f"{'='*60}")
print(f"Length: {len(flag)} (expected 36)")
print(f"All printable: {all(32 <= b < 127 for b in flag[5:35])}")
