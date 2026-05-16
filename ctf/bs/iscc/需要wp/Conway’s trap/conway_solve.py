#!/usr/bin/env python3
# Parameterized Conway's Trap solver
# Usage examples:
#   python3 conway_solve_custom.py
#   python3 conway_solve_custom.py --target-hex df7b... --rounds 5 --prefix ISCC{ --suffix }
#   python3 conway_solve_custom.py --encoded-flag-hex 2524... --check-xor 0xcc --flag-xor 0xaa --flag-rot 3 --flag-mul 23

import argparse
from struct import pack
from typing import Iterable, List, Optional

# -----------------------------
# Default parameters from the original conway_solve.py
# Change these defaults directly, or override them with command-line arguments.
# -----------------------------
DEFAULT_TARGET_HEX = "df7b6a5d4da0f5facf32c4ee4b28b792"
DEFAULT_ROUNDS = 5

# Bytes built in function 0x401d00, before xor with DEFAULT_CHECK_XOR.
DEFAULT_ENCODED_FLAG_HEX = "4c8d44e3c399d6dffe68df3e13cb8a6f69db4166d8455a"
DEFAULT_CHECK_XOR = 0xCC

# Invert:
#   rol8(((seed[i % len(seed)] ^ ch) + (i * FLAG_MUL)) & 0xff, FLAG_ROT) ^ FLAG_XOR == expected[i]
DEFAULT_FLAG_XOR = 0xAA
DEFAULT_FLAG_ROT = 3
DEFAULT_FLAG_MUL = 23

DEFAULT_PREFIX = "ISCC{"
DEFAULT_SUFFIX = "}"

# Optional success-message decryption parameters.
DEFAULT_MESSAGE_KEY = "DoNotPatchMe"
DEFAULT_MESSAGE_WORDS = [
    0x08200007, 0x01153106, 0x0C39090F, 0x4E3D012B,
    0x010E0954, 0x132C0043, 0x00284F21, 0x54053E01,
    0x45280017, 0x0A3B1D30, 0x150D3654,
]
DEFAULT_MESSAGE_TAIL_HWORD = 0x4604


def parse_int(value: str) -> int:
    """Parse decimal or 0x-prefixed integer."""
    return int(value, 0)


def clean_hex(value: str) -> str:
    """Allow pasted hex with spaces, newlines, commas, or 0x prefixes."""
    value = value.replace("0x", "").replace("0X", "")
    for ch in " \n\r\t,;:_-":
        value = value.replace(ch, "")
    if len(value) % 2:
        raise ValueError(f"hex string has odd length: {len(value)}")
    return value


def hex_to_bytes(value: str) -> bytes:
    return bytes.fromhex(clean_hex(value))


def parse_words(value: str) -> List[int]:
    if not value.strip():
        return []
    return [parse_int(part.strip()) for part in value.split(",") if part.strip()]


def rol8(x: int, n: int) -> int:
    n &= 7
    return ((x << n) & 0xFF) | (x >> (8 - n)) if n else x & 0xFF


def ror8(x: int, n: int) -> int:
    n &= 7
    return (x >> n) | ((x << (8 - n)) & 0xFF) if n else x & 0xFF


def conway_step(buf: bytes) -> bytes:
    """Forward function 0x401990."""
    if len(buf) != 16:
        raise ValueError(f"conway_step expects 16 bytes, got {len(buf)}")

    a = list(buf)
    for i in range(0, 16, 2):
        old_odd = a[i + 1]
        new_even = (a[i] + old_odd) & 0xFF
        a[i] = new_even
        a[i + 1] = rol8(new_even ^ old_odd, 1)

    first = a[0]
    for i in range(15):
        a[i] = a[i + 1]
    a[15] = first
    return bytes(a)


def inv_conway_step(buf: bytes) -> bytes:
    """Inverse of function 0x401990."""
    if len(buf) != 16:
        raise ValueError(f"inv_conway_step expects 16 bytes, got {len(buf)}")

    # Undo final rotate-left-by-1 byte shift.
    x = [0] * 16
    x[0] = buf[15]
    for i in range(1, 16):
        x[i] = buf[i - 1]

    # Undo each 2-byte mixer.
    out = [0] * 16
    for i in range(0, 16, 2):
        new_even = x[i]
        new_odd = x[i + 1]
        old_odd = ror8(new_odd, 1) ^ new_even
        old_even = (new_even - old_odd) & 0xFF
        out[i] = old_even
        out[i + 1] = old_odd
    return bytes(out)


def apply_conway_rounds(seed: bytes, rounds: int) -> bytes:
    state = seed
    for _ in range(rounds):
        state = conway_step(state)
    return state


def recover_seed(target_hex: str, rounds: int) -> bytes:
    state = hex_to_bytes(target_hex)
    if len(state) != 16:
        raise ValueError(f"target hex must decode to 16 bytes, got {len(state)}")

    for _ in range(rounds):
        state = inv_conway_step(state)
    return state


def recover_flag_inner(
    seed: bytes,
    encoded_flag_hex: str,
    check_xor: int,
    flag_xor: int,
    flag_rot: int,
    flag_mul: int,
) -> bytes:
    encoded = hex_to_bytes(encoded_flag_hex)
    expected = bytes((b ^ check_xor) & 0xFF for b in encoded)

    inner = []
    for i, e in enumerate(expected):
        v = ror8(e ^ flag_xor, flag_rot)
        ch = ((v - ((i * flag_mul) & 0xFF)) & 0xFF) ^ seed[i % len(seed)]
        inner.append(ch)
    return bytes(inner)


def decrypt_success_message(
    key_text: str,
    words: Iterable[int],
    tail_hword: Optional[int] = None,
) -> bytes:
    key = key_text.encode("latin1")
    if not key:
        raise ValueError("message key must not be empty")

    cipher = b"".join(pack("<I", w & 0xFFFFFFFF) for w in words)
    if tail_hword is not None:
        cipher += pack("<H", tail_hword & 0xFFFF)
    return bytes(c ^ key[i % len(key)] for i, c in enumerate(cipher))


def build_arg_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        description="Parameterized solver for Conway's Trap-style checks."
    )
    parser.add_argument("--target-hex", default=DEFAULT_TARGET_HEX,
                        help="16-byte final target hex after Conway rounds")
    parser.add_argument("--rounds", type=int, default=DEFAULT_ROUNDS,
                        help="number of inverse Conway rounds")
    parser.add_argument("--encoded-flag-hex", default=DEFAULT_ENCODED_FLAG_HEX,
                        help="encoded flag-inner hex from the binary")
    parser.add_argument("--check-xor", type=parse_int, default=DEFAULT_CHECK_XOR,
                        help="xor applied to encoded flag bytes before inversion, e.g. 0xcc")
    parser.add_argument("--flag-xor", type=parse_int, default=DEFAULT_FLAG_XOR,
                        help="final xor constant in flag check, e.g. 0xaa")
    parser.add_argument("--flag-rot", type=int, default=DEFAULT_FLAG_ROT,
                        help="rotate-left amount used in flag check")
    parser.add_argument("--flag-mul", type=parse_int, default=DEFAULT_FLAG_MUL,
                        help="per-index multiplier used in flag check, e.g. 23")
    parser.add_argument("--prefix", default=DEFAULT_PREFIX,
                        help="flag prefix")
    parser.add_argument("--suffix", default=DEFAULT_SUFFIX,
                        help="flag suffix")
    parser.add_argument("--message-key", default=DEFAULT_MESSAGE_KEY,
                        help="success-message xor key; use empty with --no-message")
    parser.add_argument("--message-words", default=",".join(hex(w) for w in DEFAULT_MESSAGE_WORDS),
                        help="comma-separated little-endian dword ciphertext words")
    parser.add_argument("--message-tail-hword", type=parse_int, default=DEFAULT_MESSAGE_TAIL_HWORD,
                        help="optional final little-endian hword; use -1 to omit")
    parser.add_argument("--no-message", action="store_true",
                        help="skip success-message decryption")
    return parser


def main() -> None:
    args = build_arg_parser().parse_args()

    seed = recover_seed(args.target_hex, args.rounds)
    target = hex_to_bytes(args.target_hex)
    verified = apply_conway_rounds(seed, args.rounds) == target

    inner = recover_flag_inner(
        seed=seed,
        encoded_flag_hex=args.encoded_flag_hex,
        check_xor=args.check_xor,
        flag_xor=args.flag_xor,
        flag_rot=args.flag_rot,
        flag_mul=args.flag_mul,
    )
    flag = args.prefix.encode("latin1") + inner + args.suffix.encode("latin1")

    print("seed:", seed.hex())
    print("verified:", verified)
    print("flag:", flag.decode("latin1"))

    if not args.no_message:
        tail = None if args.message_tail_hword == -1 else args.message_tail_hword
        words = parse_words(args.message_words)
        try:
            print("success message:", decrypt_success_message(args.message_key, words, tail).decode("latin1"))
        except UnicodeDecodeError:
            print("success message hex:", decrypt_success_message(args.message_key, words, tail).hex())

    print("\nInput to program:")
    print(seed.hex())
    print(flag.decode("latin1"))


if __name__ == "__main__":
    main()
