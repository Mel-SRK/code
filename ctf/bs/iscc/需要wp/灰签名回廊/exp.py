#!/usr/bin/env python3
"""
Reusable solver template for the ISCC mobile2 APK pattern.

It reconstructs the Java-side hidden fragments, mirrors the native checks, and
uses hashcat for the final SHA-256 preimage step when the remaining keyspace is
large. Constants are grouped near the top so the script can be adapted to close
variants of the same challenge.
"""

from __future__ import annotations

import argparse
import hashlib
import itertools
import shutil
import string
import subprocess
from pathlib import Path

DEFAULT_CERT_SHA256 = "133415c3f8aad739be8d0df905481208aa7448da7254a474028eeeddfc2849af"
DEFAULT_TARGET_SHA256 = "e0264b0931510ace2cfa21f781112143b3e58376e1b35b94b52ada765c6b23fb"
DEFAULT_ALPHABET = string.ascii_letters + string.digits + "_"
DEFAULT_HASHCAT_PATHS = (
    r"E:\tool\Re_Tools\hashcat-7.0.0\hashcat.exe",
)

FLAG_PREFIX = "ISCC{"
INITIAL_CHAIN = 1597463007
MASK64 = (1 << 64) - 1
FNV_PRIME64 = 0x100000001B3
MIX64 = 0xFF51AFD7ED558CCD
SHR51_MIX = 0x20000000366000

PART1_TARGET = bytes([83, 66, 49, 81, 84, 73, 105])
PART2_TARGET0 = 0x1A
PART2_TARGET_REST = bytes([0x7D, 0x64, 0x55, 0x32])
PART3_TARGET0 = 0x9C
PART3_TARGET_REST = bytes([0xC6, 0x81, 0xE4, 0x80])
PART4_MASKED_TARGET = 0x00E30000
PART4_MASK = 0x03FF0000


def derive_part1() -> str:
    return bytes(((byte ^ 0x07) - 1) & 0xFF for byte in PART1_TARGET).decode()


def derive_part1_chain_bytes(cert_digest: bytes) -> bytes:
    return bytes(cert_digest[index % 4] ^ byte for index, byte in enumerate(PART1_TARGET))


def derive_key_fragment2() -> bytes:
    return bytes(value ^ 23 for value in [82, 32, 37, 67])


def derive_key_fragment3() -> bytes:
    return bytes(((index ^ value) ^ 90) for index, value in enumerate([12, 28, 11, 51]))


def derive_key_fragment4() -> bytes:
    raw = bytes([73, 83, 67, 67, 50, 48, 50, 82, 86])
    return raw[7:9]


def derive_part2(key: bytes) -> str:
    if len(key) < 4:
        raise ValueError("part2 key must contain at least 4 bytes")
    out = bytearray(5)
    out[0] = key[0] ^ PART2_TARGET0
    out[4] = key[0] ^ PART2_TARGET_REST[0]
    out[1] = key[1] ^ PART2_TARGET_REST[1]
    out[2] = key[2] ^ PART2_TARGET_REST[2]
    out[3] = key[3] ^ PART2_TARGET_REST[3]
    return out.decode()


def derive_part3(key: bytes) -> str:
    if not key:
        raise ValueError("part3 key must not be empty")
    out = bytearray(5)
    out[0] = ((PART3_TARGET0 - key[0]) & 0xFF) ^ 0x19
    key_indexes = [1 % len(key), 2 % len(key), 3 % len(key), 4 % len(key)]
    for index, target in enumerate(PART3_TARGET_REST, start=1):
        out[index] = ((target - key[key_indexes[index - 1]]) & 0xFF) ^ 0x19
    return out.decode()


def rotate_left64(value: int, bits: int) -> int:
    return ((value << bits) | (value >> (64 - bits))) & MASK64


def compute_chain_token(part_index: int, previous: int, data: bytes) -> int:
    value = (previous ^ ((part_index * FNV_PRIME64) & MASK64)) & MASK64
    i = 0
    length = len(data)
    while i + 1 < length:
        tmp = value ^ data[i]
        A = (tmp * FNV_PRIME64) & MASK64
        B = (tmp * SHR51_MIX) & MASK64
        A >>= 51
        value = A | B
        tmp2 = value ^ data[i + 1]
        C = (tmp2 * FNV_PRIME64) & MASK64
        D = (tmp2 * SHR51_MIX) & MASK64
        C >>= 51
        value = C | D
        i += 2
    if i < length:
        tmp = value ^ data[i]
        A = (tmp * FNV_PRIME64) & MASK64
        B = (tmp * SHR51_MIX) & MASK64
        A >>= 51
        value = A | B
    tmp = value ^ (value >> 33)
    mixed = (tmp * MIX64) & MASK64
    return (mixed ^ (mixed >> 33)) & MASK64


def derive_chain_token(cert_digest: bytes, key2: bytes, key3: bytes) -> int:
    token = compute_chain_token(1, INITIAL_CHAIN, derive_part1_chain_bytes(cert_digest))
    token = compute_chain_token(2, token, key2)
    return compute_chain_token(3, token, key3)


def derive_part4_rc4_key(token: int, key2: bytes, key3: bytes, key4: bytes) -> bytes:
    token_key = bytes(
        [
            ((token >> 0) & 0xFF) ^ ord("S"),
            ((token >> 8) & 0xFF) ^ ord("e"),
            ((token >> 16) & 0xFF) ^ ord("c"),
            ((token >> 24) & 0xFF) ^ ord("u"),
        ]
    )
    return token_key + key2 + key3 + bytes([0, 0])


def rc4_keystream(key: bytes, length: int) -> bytes:
    state = list(range(256))
    index_j = 0
    for index_i in range(256):
        index_j = (index_j + state[index_i] + key[index_i % len(key)]) & 0xFF
        state[index_i], state[index_j] = state[index_j], state[index_i]

    # Native PRGA ignores KSA final j, starts fresh with i=j=0
    stream = bytearray()
    index_i = 0
    index_j = 0
    for _ in range(length):
        index_i = (index_i + 1) & 0xFF
        index_j = (index_j + state[index_i]) & 0xFF
        state[index_i], state[index_j] = state[index_j], state[index_i]
        stream.append(state[(state[index_i] + state[index_j]) & 0xFF])
    return bytes(stream)


def part4_prefix_passes(prefix4: str, rc4_key: bytes) -> bool:
    if len(prefix4) != 4:
        raise ValueError("part4 prefix must be exactly 4 characters")
    stream = rc4_keystream(rc4_key, 4)
    values = [ord(char) ^ stream[index] for index, char in enumerate(prefix4)]
    mixed = ((((values[0] << 6) ^ (values[1] << 3) ^ values[2]) << 12) ^ (values[3] << 9))
    return (mixed & PART4_MASK) == PART4_MASKED_TARGET


def iter_part4_prefixes(alphabet: str, rc4_key: bytes):
    for chars in itertools.product(alphabet, repeat=4):
        prefix4 = "".join(chars)
        if part4_prefix_passes(prefix4, rc4_key):
            yield prefix4


def find_hashcat() -> str | None:
    from_path = shutil.which("hashcat") or shutil.which("hashcat.exe")
    if from_path:
        return from_path
    for candidate in DEFAULT_HASHCAT_PATHS:
        if Path(candidate).exists():
            return candidate
    return None


def write_hashcat_inputs(prefix_file: Path, hash_file: Path, known_prefix: str, alphabet: str, rc4_key: bytes, target_hash: str) -> int:
    count = 0
    with prefix_file.open("w", encoding="utf-8", newline="\n") as handle:
        for prefix4 in iter_part4_prefixes(alphabet, rc4_key):
            handle.write(f"{known_prefix}{prefix4}\n")
            count += 1
    hash_file.write_text(f"{target_hash}\n", encoding="utf-8")
    return count


def run_hashcat(hashcat: str, hash_file: Path, prefix_file: Path, alphabet: str, output_file: Path) -> str | None:
    command = [
        hashcat,
        "-m",
        "1400",
        "-a",
        "6",
        str(hash_file),
        str(prefix_file),
        "?1?1?1}",
        "-1",
        alphabet,
        "--potfile-disable",
        "--outfile",
        str(output_file),
        "--outfile-format",
        "2",
        "--session",
        "iscc_mobile2",
        "--restore-disable",
        "--quiet",
    ]
    subprocess.run(command, check=False)
    if not output_file.exists():
        return None
    for line in output_file.read_text(encoding="utf-8", errors="ignore").splitlines():
        candidate = line.strip()
        if candidate:
            return candidate
    return None


def python_bruteforce(known_prefix: str, alphabet: str, rc4_key: bytes, target_hash: str, max_candidates: int) -> str | None:
    prefixes = list(iter_part4_prefixes(alphabet, rc4_key))
    total = len(prefixes) * (len(alphabet) ** 3)
    if total > max_candidates:
        raise RuntimeError(f"Python keyspace is {total:,}; use hashcat or raise --max-python-candidates")
    for prefix4 in prefixes:
        base = f"{known_prefix}{prefix4}"
        for tail in itertools.product(alphabet, repeat=3):
            candidate = f"{base}{''.join(tail)}}}"
            if hashlib.sha256(candidate.encode()).hexdigest() == target_hash:
                return candidate
    return None


def solve(args: argparse.Namespace) -> str | None:
    cert_digest = bytes.fromhex(args.cert_sha256)
    key2 = derive_key_fragment2()
    key3 = derive_key_fragment3()
    key4 = derive_key_fragment4()

    part1 = derive_part1()
    part2 = derive_part2(key2)
    part3 = derive_part3(key3)
    known_prefix = f"{FLAG_PREFIX}{part1}{part2}{part3}"

    token = derive_chain_token(cert_digest, key2, key3)
    rc4_key = derive_part4_rc4_key(token, key2, key3, key4)

    print(f"[+] known prefix: {known_prefix}")
    print(f"[+] chain token : 0x{token:016x}")
    print(f"[+] rc4 key : {rc4_key.hex()}")

    workdir = Path(args.workdir)
    workdir.mkdir(parents=True, exist_ok=True)
    prefix_file = workdir / "hashcat_prefixes.txt"
    hash_file = workdir / "sha256_target.txt"
    output_file = workdir / "hashcat_found.txt"
    prefix_count = write_hashcat_inputs(prefix_file, hash_file, known_prefix, args.alphabet, rc4_key, args.target_sha256)
    print(f"[+] part4 prefixes passing native filter: {prefix_count:,}")

    if args.python:
        return python_bruteforce(known_prefix, args.alphabet, rc4_key, args.target_sha256, args.max_python_candidates)

    hashcat = args.hashcat or find_hashcat()
    if not hashcat:
        print("[!] hashcat not found; rerun with --hashcat PATH or --python for small keyspaces")
        print(f"[!] generated prefix file: {prefix_file}")
        return None
    return run_hashcat(hashcat, hash_file, prefix_file, args.alphabet, output_file)


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description="Reusable solver for the mobile2 APK native-check pattern.")
    parser.add_argument("--cert-sha256", default=DEFAULT_CERT_SHA256, help="APK signer certificate SHA-256 digest")
    parser.add_argument("--target-sha256", default=DEFAULT_TARGET_SHA256, help="final SHA-256 hash checked by Java")
    parser.add_argument("--alphabet", default=DEFAULT_ALPHABET, help="alphabet for the unknown 7-byte suffix")
    parser.add_argument("--hashcat", help="path to hashcat.exe/hashcat")
    parser.add_argument("--workdir", default="solver_work", help="directory for generated hashcat files")
    parser.add_argument("--python", action="store_true", help="use Python brute force instead of hashcat")
    parser.add_argument("--max-python-candidates", type=int, default=5_000_000, help="safety cap for Python brute force")
    return parser


def main() -> int:
    args = build_parser().parse_args()
    flag = solve(args)
    if not flag:
        return 1
    print(f"[+] flag: {flag}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
