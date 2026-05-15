#!/usr/bin/env python3
"""Solver for 拆弹专家 (Bomb Defusal Expert) CTF challenge."""

# ============================================================
# Stage 1: 2x2x2 Rubik's Cube Cipher
# ============================================================

# Move definitions (permutation: old_index -> new_index, add values)
PERMS = {}
ADDS = {}

def make_add(idxs, k):
    a = [0]*8
    for idx in idxs:
        a[idx] = k
    return a

def invert_perm(p):
    inv = [0]*8
    for old, new in enumerate(p):
        inv[new] = old
    return inv

# Base moves
PERMS["R"] = [0,5,2,1,4,7,6,3]
PERMS["L"] = [2,1,6,3,0,5,4,7]
PERMS["U"] = [0,1,6,2,4,5,7,3]
PERMS["D"] = [1,5,2,3,0,4,6,7]
PERMS["F"] = [0,1,2,3,6,4,7,5]
PERMS["B"] = [1,3,0,2,4,5,6,7]

ADDS["R"] = make_add([1,3,5,7], 1)
ADDS["L"] = make_add([0,2,4,6], 2)
ADDS["U"] = make_add([2,3,6,7], 3)
ADDS["D"] = make_add([0,1,4,5], 4)
ADDS["F"] = make_add([4,5,6,7], 5)
ADDS["B"] = make_add([0,1,2,3], 6)

# Inverse moves
PERMS["R'"] = invert_perm(PERMS["R"]); ADDS["R'"] = make_add([1,3,5,7], 7)
PERMS["L'"] = invert_perm(PERMS["L"]); ADDS["L'"] = make_add([0,2,4,6], 8)
PERMS["U'"] = invert_perm(PERMS["U"]); ADDS["U'"] = make_add([2,3,6,7], 9)
PERMS["D'"] = invert_perm(PERMS["D"]); ADDS["D'"] = make_add([0,1,4,5], 10)
PERMS["F'"] = invert_perm(PERMS["F"]); ADDS["F'"] = make_add([4,5,6,7], 11)
PERMS["B'"] = invert_perm(PERMS["B"]); ADDS["B'"] = make_add([0,1,2,3], 12)

def apply_move(block, move):
    """Apply one move: add then permute (bbb4532 equivalent)"""
    tmp = [(block[i] + ADDS[move][i]) & 0xFF for i in range(8)]
    out = [0]*8
    for old, new in enumerate(PERMS[move]):
        out[new] = tmp[old]
    return out

def pkcs7_pad(data, block=8):
    pad = block - (len(data) % block)
    if pad == 0:
        pad = block
    return data + bytes([pad] * pad)

def key_to_sequence(key):
    """Parse key string into move sequence tokens."""
    toks = key.split()
    seq = []
    for tok in toks:
        tok = tok.upper()
        times = 1
        if tok.endswith('2'):
            times = 2
            tok = tok[:-1]
        seq.extend([tok] * times)
    return seq

def encrypt(plaintext, key):
    """Encrypt plaintext with Rubik's cube cipher."""
    data = pkcs7_pad(plaintext.encode(), 8)
    seq = key_to_sequence(key)
    out = bytearray()
    for i in range(0, len(data), 8):
        block = list(data[i:i+8])
        for m in seq:
            block = apply_move(block, m)
        out.extend(block)
    return base64_encode(bytes(out))

# Base64 encoding (same as the C++ version)
B64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

def base64_encode(data):
    out = []
    i = 0
    while i + 3 <= len(data):
        n = (data[i] << 16) | (data[i+1] << 8) | data[i+2]
        out.append(B64[(n >> 18) & 63])
        out.append(B64[(n >> 12) & 63])
        out.append(B64[(n >> 6) & 63])
        out.append(B64[n & 63])
        i += 3
    rem = len(data) - i
    if rem == 1:
        n = data[i] << 16
        out.append(B64[(n >> 18) & 63])
        out.append(B64[(n >> 12) & 63])
        out.append('=')
        out.append('=')
    elif rem == 2:
        n = (data[i] << 16) | (data[i+1] << 8)
        out.append(B64[(n >> 18) & 63])
        out.append(B64[(n >> 12) & 63])
        out.append(B64[(n >> 6) & 63])
        out.append('=')
    return ''.join(out)

def fnv1a32(s):
    h = 0x811C9DC5
    for c in s.encode():
        h ^= c
        h = (h * 0x01000193) & 0xFFFFFFFF
    return h

# ---- Test Stage 1 ----
password1 = "CGKKIURA"  # from the comment in the source
key = "R U F R' D2"
cipher = encrypt(password1, key)
h = fnv1a32(cipher)
expected_obf = 0xCB040F00
mask = 0xA5A5A5A5
expected_hash = expected_obf ^ mask
print(f"[Stage 1]")
print(f"  Password1: {password1}")
print(f"  Cipher b64: {cipher}")
print(f"  Hash: 0x{h:08X}")
print(f"  Expected hash: 0x{expected_hash:08X}")
print(f"  Match: {(h ^ mask) == expected_obf}")

g_stage1_hash = h
print()

# ============================================================
# Stage 2: Linear Equations
# ============================================================
def d4bb6(state):
    """LCG: state = state * 1664525 + 1013904223 (mod 2^32)"""
    return (state * 1664525 + 1013904223) & 0xFFFFFFFF

def d4n7(h):
    """Derive g_a and g_e from hash."""
    base_a = [2, 3, 4, 5, 6]
    ga = [0]*5
    for i in range(5):
        delta = (h >> (i * 6)) & 0x3
        ga[i] = base_a[i] + delta
    
    seed = h ^ 0x12345678
    state = seed
    x = [0]*5
    for i in range(5):
        state = d4bb6(state)
        if i != 0:
            x[i] = 10 + (state % 90)
        else:
            x[i] = state % 10
    
    ge = [0]*5
    ge[0] = ga[0] * x[0] + x[1] + x[4]
    ge[1] = x[0] + ga[1] * x[1] + x[2]
    ge[2] = x[1] + ga[2] * x[2] + x[3]
    ge[3] = x[2] + ga[3] * x[3] + x[4]
    ge[4] = x[0] + x[3] + ga[4] * x[4]
    
    return ga, ge, x

ga, ge, x_expected = d4n7(g_stage1_hash)
print(f"[Stage 2]")
print(f"  g_a: {ga}")
print(f"  g_e: {ge}")
print(f"  Expected x (from LCG): x1={x_expected[0]}, x2={x_expected[1]}, x3={x_expected[2]}, x4={x_expected[3]}, x5={x_expected[4]}")

# The solution is simply the x values from LCG, formatted as a 9-digit string
x1, x2, x3, x4, x5 = x_expected
password2 = f"{x1}{x2:02d}{x3:02d}{x4:02d}{x5:02d}"
print(f"  Password2: {password2}")

# Verify
e1 = ga[0] * x1 + x2 + x5
e2 = x1 + ga[1] * x2 + x3
e3 = x2 + ga[2] * x3 + x4
e4 = x3 + ga[3] * x4 + x5
e5 = x1 + x4 + ga[4] * x5
print(f"  Verification: e1={e1}=={ge[0]}, e2={e2}=={ge[1]}, e3={e3}=={ge[2]}, e4={e4}=={ge[3]}, e5={e5}=={ge[4]}")
print()

# ============================================================
# Stage 3: Maze
# ============================================================
MAZE_W, MAZE_H = 4, 4

def idx(x, y):
    return y * MAZE_W + x

def generate_maze(seed_int):
    """b5k8: generate a 4x4 maze with guaranteed path from (0,0) to (3,3)."""
    maze = [0] * 16
    st = (seed_int ^ 0x9E3779B9) & 0xFFFFFFFF
    x, y = 0, 0
    maze[idx(x, y)] = 1
    
    while not (x == 3 and y == 3):
        st = d4bb6(st)
        r = st
        canR = (x < 3)
        canD = (y < 3)
        
        if canR and canD:
            move = 1 if (r & 1) else 2  # 1=Right, 2=Down
        elif canR:
            move = 1
        else:
            move = 2
        
        if move == 1:
            x += 1
        else:
            y += 1
        maze[idx(x, y)] = 1
    
    # Random additional cells (note: the C++ code has a bug: (r % 100) < -0.1 is always false)
    # So no additional cells are added. Maze only has the main path.
    for k in range(16):
        st = d4bb6(st)
        r = st
        p = r % 16
        if p == idx(0, 0) or p == idx(3, 3):
            continue
        # Condition (r % 100) < -0.1 is always false for unsigned, so no cells added
        # (r % 100) is 0-99, never < -0.1
        pass
    
    return maze

def solve_maze_bfs(maze):
    """BFS to find a path from (0,0) to (3,3) using L/R/U/D."""
    from collections import deque
    start = (0, 0)
    goal = (3, 3)
    q = deque([(start, "")])
    visited = {start}
    
    dirs = {'L': (-1, 0), 'R': (1, 0), 'U': (0, -1), 'D': (0, 1)}
    
    while q:
        (cx, cy), path = q.popleft()
        if (cx, cy) == goal:
            return path
        
        for d, (dx, dy) in dirs.items():
            nx, ny = cx + dx, cy + dy
            if 0 <= nx < MAZE_W and 0 <= ny < MAZE_H:
                if maze[idx(nx, ny)] == 1 and (nx, ny) not in visited:
                    visited.add((nx, ny))
                    q.append(((nx, ny), path + d))
    return None

seed_int = int(password2)
seed_int ^= (g_stage1_hash * 0x9E3779B1) & 0xFFFFFFFF
maze = generate_maze(seed_int)

print(f"[Stage 3]")
print(f"  Seed for maze: 0x{seed_int:08X}")
print(f"  Maze (4x4):")
for y in range(MAZE_H):
    print(f"    {''.join(str(maze[idx(x,y)]) for x in range(MAZE_W))}")

password3 = solve_maze_bfs(maze)
print(f"  Password3: {password3}")
print()

# ============================================================
# Flag
# ============================================================
enc_flag = [0x1C,0x36,0x3B,0x3D,0x60,0x7A,0x13,0x09,0x19,0x19,0x21]
prefix = ''.join(chr(b ^ 0x5A) for b in enc_flag)
print(f"[Flag]")
print(f"  Flag: {prefix}{password1}{password2}{password3}}}")
