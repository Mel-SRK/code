#!/usr/bin/env python3
"""
Solver for ISCC 如影随形 RE challenge.
Handles non-injective substitution by exploring all reverse paths.
"""
import sys

TARGET = bytes([0x3b, 0x73, 0x3c, 0x62, 0x2f, 0x3f, 0x76, 0x45,
                0x69, 0x43, 0x7b, 0x73, 0x22, 0x7b, 0x43, 0x39])

M = [10, 9, 12, 5, 2, 11, 6, 3, 1, 4, 14, 7, 13, 8, 0, 15]

with open('/home/srk/Documents/code/ctf/bs/iscc/day4/如影随形/attachment-22.exe', 'rb') as f:
    f.seek(0x34e0)
    SUBST_TABLE = list(f.read(96))

def mod95(x):
    return x % 95

def h214(c, shift):
    return mod95(c - 0x20 + shift) + 0x20

def h214_inv(c, shift):
    return mod95(c - 0x20 - shift) + 0x20

def subst(c):
    idx = c - 0x20
    if 0 <= idx < 95:
        return (SUBST_TABLE[idx] + 0x20) & 0xFF
    return c

def subst_loop(char, acc, iters):
    for _ in range(iters):
        looked_up = subst(char)
        combined = acc + looked_up - 0x20
        char = mod95(combined) + 0x20
    return char

def subst_loop_inv_all(char, acc, iters):
    """Return ALL possible previous chars that map to char via subst_loop with given params."""
    if iters == 0:
        return [char]

    # For single iteration, find all prev such that (acc + subst(prev) - 32) % 95 + 32 == char
    result_target = char - 0x20
    candidates = []
    for prev in range(0x20, 0x7f):
        looked_up = subst(prev)
        combined = acc + looked_up - 0x20
        if mod95(combined) + 0x20 == char:
            candidates.append(prev)

    # For multiple iterations, recurse
    result = []
    for cand in candidates:
        sub_results = subst_loop_inv_all(cand, acc, iters - 1)
        result.extend(sub_results)
    return list(set(result))  # deduplicate

def ohf3nw_reverse_multi(mat_in):
    """Reverse OHF3nw, handling ambiguity by returning all candidates.
    Uses iterative deepening to avoid exponential blowup."""

    candidates = [mat_in]

    for r15 in range(1, 5):
        local = 4 - r15
        ebp = r15 - 4
        M_row = 4 - r15

        for r13 in range(3, -1, -1):
            val = M[M_row * 4 + r13]
            target_row = val // 4
            target_col = val % 4
            found_esi = ebp + target_row
            p3 = abs(target_col - r13)
            p4 = abs(found_esi)

            next_candidates = []
            for mat in candidates:
                # For each current candidate, apply u8afi3 reverse
                results = u8afi3_reverse_all(mat, local, r13, p3, p4)
                next_candidates.extend(results)

            # Deduplicate
            seen = set()
            unique = []
            for m in next_candidates:
                t = tuple(m)
                if t not in seen:
                    seen.add(t)
                    unique.append(m)
            candidates = unique

            # Safety: don't let candidates explode
            if len(candidates) > 1000:
                print(f"  WARNING: {len(candidates)} candidates at r15={r15} r13={r13}, truncating")
                candidates = candidates[:1000]

    return candidates

def u8afi3_reverse_all(mat, p1, p2, p3, p4):
    """Reverse u8afi3, returning all possible previous states."""

    # Step 1: Try all possible results of undoing step 4
    # The matrix after step 3 but before step 4
    pre_step4_candidates = []

    if p4 > 0:
        pos = p1 * 4 + p2
        acc_pos = p4 % 95

        if acc_pos < 16:
            if acc_pos != pos:
                accumulator = mod95(mat[acc_pos] - 0x20)
                prev_chars = subst_loop_inv_all(mat[pos], accumulator, p4)
                for pc in prev_chars:
                    new_mat = mat[:]
                    new_mat[pos] = pc
                    pre_step4_candidates.append(new_mat)
            else:
                # acc_pos == pos: accumulator from modified position
                for test_val in range(95):
                    test_char = test_val + 0x20
                    acc = test_val
                    result = subst_loop(test_char, acc, p4)
                    if result == mat[pos]:
                        new_mat = mat[:]
                        new_mat[pos] = test_char
                        pre_step4_candidates.append(new_mat)
        else:
            # p4 > 15 shouldn't happen
            pre_step4_candidates = [mat[:]]
    else:
        pre_step4_candidates = [mat[:]]

    # Deduplicate
    seen = set()
    unique = []
    for m in pre_step4_candidates:
        t = tuple(m)
        if t not in seen:
            seen.add(t)
            unique.append(m)
    pre_step4_candidates = unique

    # Step 2: Undo Caesar chain for each candidate
    results = []
    for m in pre_step4_candidates:
        shift = mod95(p3)
        new_m = m[:]
        for i in range(16):
            c_orig = h214_inv(new_m[i], shift)
            shift = mod95(m[i] - 0x20)  # use the caesared value for shift chain
            new_m[i] = c_orig
        results.append(new_m)

    return results

# Run the solver
print("=== Solving ===")
target_mat = list(TARGET)
candidates = ohf3nw_reverse_multi(target_mat)
print(f"Found {len(candidates)} candidate(s)")

for i, cand in enumerate(candidates):
    flag_inner = ''.join(chr(c) if 32 <= c < 127 else '?' for c in cand)
    print(f"\nCandidate {i}: ISCC{{{flag_inner}}}")

    # Verify
    verify = cand[:]
    for r15 in range(4, 0, -1):
        local = 4 - r15
        ebp = r15 - 4
        M_row = 4 - r15
        for r13 in range(4):
            val = M[M_row * 4 + r13]
            target_row = val // 4
            target_col = val % 4
            found_esi = ebp + target_row
            p3 = abs(target_col - r13)
            p4 = abs(found_esi)
            # Forward step
            s = verify[:]
            shift = mod95(p3)
            for j in range(16):
                c_new = h214(s[j], shift)
                s[j] = c_new
                shift = mod95(c_new - 0x20)
            verify = s[:]
            if p4 > 0:
                pos = local * 4 + r13
                acc_pos_val = p4 % 95
                if acc_pos_val < 16:
                    accumulator = mod95(s[acc_pos_val] - 0x20)
                else:
                    accumulator = 0
                verify[pos] = subst_loop(verify[pos], accumulator, p4)

    match = verify == target_mat
    print(f"  Verify: {match}")
    if match:
        print(f"\n*** FLAG: ISCC{{{flag_inner}}} ***")
