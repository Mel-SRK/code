# ISCC 密码验证 - Android Reverse Challenge Progress

## Status
Partially solved. Algorithm fully reverse-engineered but intermediate values may have an error.

## Key Findings

### APK Structure
- Package: `com.example.crypto`
- Native library: `libnativecrypto.so` (ARM64 + x86_64)
- Java: `NativeBridge.verifyFlag(AssetManager, String)` → JNI native
- Assets: cipher1.bin (8 bytes), cipher2.bin (12 bytes), cipher3.bin (10 bytes), puzzle.bin (20 bytes)

### Flag Format
- Total: 36 characters
- Format: `ISCC{` + 30 chars + `}`
- Split: flag1 (8 chars) + flag2 (12 chars) + flag3 (10 chars)

### Algorithm Summary
1. **Table Transform**: 3 embedded 16-byte tables → transform each byte: `((b - 0x13) & 0xFF) ^ 0x5A`
2. **R1**: T1 XOR T3 (element-wise)
3. **R2**: GF(2^8) matrix operation (T2 × R1^T) + ShiftRows([2,3,0,1])
4. **R3**: S-box lookup (R1⊕R2⊕T3) + cumulative XOR
5. **TEA Check** (flag1): flag1 ⊕ inter → bswap → TEA encrypt (16 rounds, δ=0x9E3779B9) → compare with cipher1
6. **Matrix Check** (flag2): flag2 × R2^T in GF(2^8) → compare with cipher2
7. **Checksum**: TABLE4[rotl3(xor(flag1)) % 88] == flag2[0]
8. **Puzzle Check**: GF(2^8) 4×4 linear system on flag1[0:4] vs puzzle matrix
9. **LCG Check** (flag3): seed from R3 → LCG(mult=0x5851F42D4C957F2D, add=0x14057B7EF767814F) → cipher3
10. **Final Checks**: TABLE4[(flag1+flag2)[8] % 88] == flag3[8], TABLE4[(flag1+flag2)[9] % 88] == flag3[9]

### Dead End: Passing verifyFlag directly
- libnativecrypto.so needs Android Bionic libc (versioned symbols incompatible with glibc)
- Could not run on Linux even with stubs

### Open Issue
The puzzle check (GF equations) gives flag1[0:4] = "(:Q?" (0x283a513f), verified correct.
But TEA decrypt of cipher1 with computed key gives different bytes for flag1.
This means either:
1. Intermediate values (R1, R2, R3) are wrong (most likely)
2. TEA implementation differs from standard
3. Some code path modifies data between checks

### Intermediate Values (from Python computation)
```
T1: 1a2b3c4d5e6f708192a3b4c5d6e7f809
T2: 01000000000100000000010000000001  (identity matrix)
T3: aabbccdd11223344556677889900feed
R1: b090f0904f4d43c5c7c5c34d4fe706e4
R2: f043c30690c54de4b04fc74f904dc5e7
R3: 87c2d467ec40672ab977f886dc70577f
```
