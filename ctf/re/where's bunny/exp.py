"""
Solver for "Where's bunny.exe" RE challenge.
Reverses: TEA decrypt -> cyclic SUB -> cyclic XOR -> RC4
"""
import argparse
import hashlib
import struct
from pathlib import Path

U32_MASK = 0xFFFFFFFF

DEFAULT_TARGET_HEX = "8444B378AA6D5E394B0F9129CEA6628E7A084F6422DDF6BE"
DEFAULT_KEYS = ("344", "21", "89", "233")
DEFAULT_PREFIX = "ISCC{"
DEFAULT_SUFFIX = "}"


def u32(value: int) -> int:
    return value & U32_MASK


def tea_decrypt_block(block: bytes, key: bytes) -> bytes:
    """Inverse of the 32-round little-endian TEA encrypt (sub_401880)."""
    v0, v1 = struct.unpack("<2I", block)
    k0, k1, k2, k3 = struct.unpack("<4I", key)
    delta = 0x9E3779B9
    total = u32(delta * 32)

    for _ in range(32):
        v1 = u32(
            v1
            - (
                u32((v0 << 4) + k2)
                ^ u32(v0 + total)
                ^ u32((v0 >> 5) + k3)
            )
        )
        v0 = u32(
            v0
            - (
                u32((v1 << 4) + k0)
                ^ u32(v1 + total)
                ^ u32((v1 >> 5) + k1)
            )
        )
        total = u32(total - delta)

    return struct.pack("<2I", v0, v1)


def tea_encrypt_block(block: bytes, key: bytes) -> bytes:
    """The exact 32-round little-endian TEA variant used by sub_401880."""
    v0, v1 = struct.unpack("<2I", block)
    k0, k1, k2, k3 = struct.unpack("<4I", key)
    delta = 0x9E3779B9
    total = 0

    for _ in range(32):
        total = u32(total + delta)
        v0 = u32(
            v0
            + (
                u32((v1 << 4) + k0)
                ^ u32(v1 + total)
                ^ u32((v1 >> 5) + k1)
            )
        )
        v1 = u32(
            v1
            + (
                u32((v0 << 4) + k2)
                ^ u32(v0 + total)
                ^ u32((v0 >> 5) + k3)
            )
        )

    return struct.pack("<2I", v0, v1)


def tea_key_from_seed(seed: bytes) -> bytes:
    """sub_401AC0: SHA256(str(seed)) -> first 16 bytes as key."""
    return hashlib.sha256(seed).digest()[:16]


def add_padding(data: bytes) -> bytes:
    """sub_401B80: pad with N bytes of value N (N = 1..8)."""
    pad_len = 8 - (len(data) & 7)
    if pad_len >= 8:
        pad_len = 8
    return data + bytes([pad_len]) * pad_len


def strip_padding(data: bytes) -> bytes:
    if not data:
        raise ValueError("empty TEA plaintext")
    pad_len = data[-1]
    if pad_len < 1 or pad_len > 8:
        raise ValueError(f"invalid TEA padding length: {pad_len}")
    if data[-pad_len:] != bytes([pad_len]) * pad_len:
        raise ValueError("invalid TEA padding bytes")
    return data[:-pad_len]


def tea_encrypt(data: bytes, seed: bytes) -> bytes:
    key = tea_key_from_seed(seed)
    padded = add_padding(data)
    return b"".join(
        tea_encrypt_block(padded[offset:offset + 8], key)
        for offset in range(0, len(padded), 8)
    )


def tea_decrypt(data: bytes, seed: bytes) -> bytes:
    if len(data) % 8:
        raise ValueError("TEA ciphertext length must be a multiple of 8")
    key = tea_key_from_seed(seed)
    padded = b"".join(
        tea_decrypt_block(data[offset:offset + 8], key)
        for offset in range(0, len(data), 8)
    )
    return strip_padding(padded)


def rc4(data: bytes, key: bytes) -> bytes:
    if not key:
        raise ValueError("RC4 key must not be empty")
    state = list(range(256))
    j = 0
    for i in range(256):
        j = (j + state[i] + key[i % len(key)]) & 0xFF
        state[i], state[j] = state[j], state[i]
    out = bytearray()
    i = 0
    j = 0
    for byte in data:
        i = (i + 1) & 0xFF
        j = (j + state[i]) & 0xFF
        state[i], state[j] = state[j], state[i]
        stream_byte = state[(state[i] + state[j]) & 0xFF]
        out.append(byte ^ stream_byte)
    return bytes(out)


def cyclic_xor(data: bytes, key: bytes) -> bytes:
    if not key:
        raise ValueError("XOR key must not be empty")
    return bytes(byte ^ key[index % len(key)] for index, byte in enumerate(data))


def cyclic_add(data: bytes, key: bytes) -> bytes:
    if not key:
        raise ValueError("ADD key must not be empty")
    return bytes((byte + key[index % len(key)]) & 0xFF for index, byte in enumerate(data))


def cyclic_sub(data: bytes, key: bytes) -> bytes:
    if not key:
        raise ValueError("ADD key must not be empty")
    return bytes((byte - key[index % len(key)]) & 0xFF for index, byte in enumerate(data))


def solve_from_values(
    target_hex: str,
    rc4_key: bytes,
    xor_key: bytes,
    add_key: bytes,
    tea_seed: bytes,
    prefix: str,
    suffix: str,
) -> tuple[str, str]:
    """Reverse the checker and return (flag, forward_hex)."""
    ciphertext = bytes.fromhex(target_hex)

    # Reverse the encryption chain: TEA -> ADD -> XOR -> RC4
    stage = tea_decrypt(ciphertext, tea_seed)
    stage = cyclic_sub(stage, add_key)
    stage = cyclic_xor(stage, xor_key)
    inner = rc4(stage, rc4_key)

    try:
        inner_text = inner.decode("utf-8")
    except UnicodeDecodeError:
        inner_text = inner.decode("latin-1")

    flag = f"{prefix}{inner_text}{suffix}"

    # Verify forward direction
    verify = rc4(inner, rc4_key)
    verify = cyclic_xor(verify, xor_key)
    verify = cyclic_add(verify, add_key)
    verify = tea_encrypt(verify, tea_seed)
    return flag, verify.hex().upper()


def parse_pe_sections(blob: bytes) -> tuple[int, list[tuple[int, int, int, int, str]]]:
    """Return image base and section tuples: (va, vsize, raw_offset, raw_size, name)."""
    if blob[:2] != b"MZ":
        raise ValueError("not a PE file: missing MZ header")

    pe_offset = struct.unpack_from("<I", blob, 0x3C)[0]
    if blob[pe_offset:pe_offset + 4] != b"PE\0\0":
        raise ValueError("not a PE file: missing PE signature")

    coff_offset = pe_offset + 4
    section_count = struct.unpack_from("<H", blob, coff_offset + 2)[0]
    optional_header_size = struct.unpack_from("<H", blob, coff_offset + 16)[0]
    optional_offset = coff_offset + 20
    magic = struct.unpack_from("<H", blob, optional_offset)[0]

    if magic == 0x10B:
        image_base = struct.unpack_from("<I", blob, optional_offset + 28)[0]
    elif magic == 0x20B:
        image_base = struct.unpack_from("<Q", blob, optional_offset + 24)[0]
    else:
        raise ValueError(f"unknown PE optional header magic: 0x{magic:x}")

    section_offset = optional_offset + optional_header_size
    sections = []
    for index in range(section_count):
        off = section_offset + index * 40
        name = blob[off:off + 8].rstrip(b"\0").decode("ascii", errors="replace")
        virtual_size, virtual_address, raw_size, raw_offset = struct.unpack_from(
            "<IIII", blob, off + 8
        )
        sections.append((virtual_address, virtual_size, raw_offset, raw_size, name))

    return image_base, sections


def va_to_offset(blob: bytes, va: int) -> int:
    image_base, sections = parse_pe_sections(blob)
    rva = va - image_base

    for virtual_address, virtual_size, raw_offset, raw_size, name in sections:
        span = max(virtual_size, raw_size)
        if virtual_address <= rva < virtual_address + span:
            offset = raw_offset + (rva - virtual_address)
            if offset >= len(blob):
                raise ValueError(f"VA 0x{va:X} maps outside file via section {name}")
            return offset

    raise ValueError(f"VA 0x{va:X} was not inside any PE section")


def read_c_string_at_va(path: Path, va: int) -> str:
    blob = path.read_bytes()
    offset = va_to_offset(blob, va)
    end = blob.find(b"\0", offset)
    if end < 0:
        raise ValueError(f"no null terminator found after VA 0x{va:X}")
    return blob[offset:end].decode("ascii")


def normalize_key_list(raw_keys: str) -> tuple[bytes, bytes, bytes, bytes]:
    parts = [part.strip() for part in raw_keys.split(",")]
    if len(parts) != 4 or any(not part for part in parts):
        raise ValueError("expected exactly four comma-separated keys, e.g. 344,21,89,233")
    return tuple(part.encode("ascii") for part in parts)  # type: ignore[return-value]


def build_arg_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        description="Solve Where's-bunny-style RC4/XOR/ADD/TEA checker values."
    )
    parser.add_argument(
        "--target-hex",
        default=DEFAULT_TARGET_HEX,
        help="target ciphertext hex string from IDA .rdata, default is this sample",
    )
    parser.add_argument(
        "--exe",
        type=Path,
        help="optional PE path; use with --target-va to read target hex automatically",
    )
    parser.add_argument(
        "--target-va",
        type=lambda value: int(value, 0),
        help="optional VA of target C string, e.g. 0x4201F0",
    )
    parser.add_argument(
        "--keys",
        default=",".join(DEFAULT_KEYS),
        help="four active key strings in order: rc4,xor,add,tea_seed",
    )
    parser.add_argument("--prefix", default=DEFAULT_PREFIX, help="flag prefix")
    parser.add_argument("--suffix", default=DEFAULT_SUFFIX, help="flag suffix")
    return parser


def main() -> None:
    args = build_arg_parser().parse_args()

    target_hex = args.target_hex
    if args.exe and args.target_va is not None:
        target_hex = read_c_string_at_va(args.exe, args.target_va)
    elif args.exe or args.target_va is not None:
        raise SystemExit("--exe and --target-va must be supplied together")

    rc4_key, xor_key, add_key, tea_seed = normalize_key_list(args.keys)
    flag, forward_hex = solve_from_values(
        target_hex=target_hex,
        rc4_key=rc4_key,
        xor_key=xor_key,
        add_key=add_key,
        tea_seed=tea_seed,
        prefix=args.prefix,
        suffix=args.suffix,
    )

    print(f"target   = {target_hex.upper()}")
    print(f"computed = {forward_hex}")
    print(f"match    = {forward_hex == target_hex.upper()}")
    print(f"flag     = {flag}")


if __name__ == "__main__":
    main()
