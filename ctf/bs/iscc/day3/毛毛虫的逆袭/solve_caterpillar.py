#!/usr/bin/env python3
"""
Generic solver for the ISCC "caterpillar" reverse challenge family.

Usage:
    python solve_caterpillar.py -f caterpillarXX.exe

The script does not depend on IDA or pefile.  It parses enough of the PE
format to resolve RIP-relative references, then extracts:
  1. the LCG seed loaded by the fast-path verifier
  2. the 20-byte transformed target used by memcmp

It finally reverses the printable-ASCII rotation used by the verifier and
prints the ISCC flag.
"""

from __future__ import annotations

import argparse
import dataclasses
import pathlib
import struct
import sys
from typing import Iterable


LCG_A = 1103515245
LCG_C = 12345
PRINTABLE_BASE = 32
PRINTABLE_MOD = 95
DEFAULT_PREFIX = "ISCC"


class SolveError(RuntimeError):
    pass


@dataclasses.dataclass(frozen=True)
class Section:
    name: str
    virtual_address: int
    virtual_size: int
    raw_pointer: int
    raw_size: int

    @property
    def mapped_size(self) -> int:
        return max(self.virtual_size, self.raw_size)


class PEImage:
    def __init__(self, data: bytes) -> None:
        self.data = data
        self.image_base, self.sections = self._parse_headers()

    def _parse_headers(self) -> tuple[int, list[Section]]:
        data = self.data
        if len(data) < 0x40 or data[:2] != b"MZ":
            raise SolveError("not a PE file: missing MZ header")

        pe_offset = self.u32(0x3C)
        if pe_offset + 0x18 > len(data) or data[pe_offset : pe_offset + 4] != b"PE\0\0":
            raise SolveError("not a PE file: missing PE signature")

        number_of_sections = self.u16(pe_offset + 6)
        optional_header_size = self.u16(pe_offset + 20)
        optional_offset = pe_offset + 24
        if optional_offset + optional_header_size > len(data):
            raise SolveError("truncated optional header")

        magic = self.u16(optional_offset)
        if magic == 0x20B:
            image_base = self.u64(optional_offset + 24)
        elif magic == 0x10B:
            image_base = self.u32(optional_offset + 28)
        else:
            raise SolveError(f"unsupported optional header magic: 0x{magic:x}")

        section_offset = optional_offset + optional_header_size
        sections: list[Section] = []
        for index in range(number_of_sections):
            off = section_offset + index * 40
            if off + 40 > len(data):
                raise SolveError("truncated section table")

            raw_name = data[off : off + 8].split(b"\0", 1)[0]
            name = raw_name.decode("ascii", errors="replace")
            virtual_size, virtual_address, raw_size, raw_pointer = struct.unpack_from(
                "<IIII", data, off + 8
            )
            sections.append(
                Section(
                    name=name,
                    virtual_address=virtual_address,
                    virtual_size=virtual_size,
                    raw_pointer=raw_pointer,
                    raw_size=raw_size,
                )
            )

        return image_base, sections

    def u16(self, offset: int) -> int:
        return struct.unpack_from("<H", self.data, offset)[0]

    def u32(self, offset: int) -> int:
        return struct.unpack_from("<I", self.data, offset)[0]

    def u64(self, offset: int) -> int:
        return struct.unpack_from("<Q", self.data, offset)[0]

    def va_from_file_offset(self, offset: int) -> int:
        for section in self.sections:
            start = section.raw_pointer
            end = start + section.raw_size
            if start <= offset < end:
                return self.image_base + section.virtual_address + (offset - start)
        return self.image_base + offset

    def file_offset_from_va(self, va: int) -> int:
        rva = va - self.image_base
        for section in self.sections:
            start = section.virtual_address
            end = start + section.mapped_size
            if start <= rva < end:
                offset = section.raw_pointer + (rva - start)
                if offset >= len(self.data):
                    raise SolveError(f"VA 0x{va:x} maps outside file")
                return offset
        raise SolveError(f"could not map VA 0x{va:x} to a file offset")

    def read_u32_va(self, va: int) -> int:
        return self.u32(self.file_offset_from_va(va))

    def read_bytes_va(self, va: int, size: int) -> bytes:
        off = self.file_offset_from_va(va)
        if off + size > len(self.data):
            raise SolveError(f"VA 0x{va:x} read extends outside file")
        return self.data[off : off + size]

    def rip_target(self, instr_file_offset: int, instr_len: int, rel_offset: int) -> int:
        rel = struct.unpack_from("<i", self.data, instr_file_offset + rel_offset)[0]
        instr_va = self.va_from_file_offset(instr_file_offset)
        return instr_va + instr_len + rel


@dataclasses.dataclass(frozen=True)
class Candidate:
    seed_va: int
    seed: int
    target_va: int
    target: bytes
    score: int


def find_all(data: bytes, needle: bytes) -> Iterable[int]:
    pos = 0
    while True:
        pos = data.find(needle, pos)
        if pos < 0:
            return
        yield pos
        pos += 1


def is_printable_ascii(blob: bytes) -> bool:
    return all(PRINTABLE_BASE <= b < PRINTABLE_BASE + PRINTABLE_MOD for b in blob)


def extract_prefix(data: bytes) -> str:
    marker = b"Input flag in the format "
    start = data.find(marker)
    if start < 0:
        return DEFAULT_PREFIX

    start += len(marker)
    end = data.find(b"{", start)
    if end < 0:
        return DEFAULT_PREFIX

    prefix = data[start:end]
    if prefix and all(32 <= b <= 126 for b in prefix):
        return prefix.decode("ascii", errors="strict")
    return DEFAULT_PREFIX


def read_target_from_lea_rdx(pe: PEImage, lea_offset: int, expected_size: int) -> tuple[int, bytes] | None:
    # 48 8D 15 xx xx xx xx == lea rdx, [rip+rel32]
    if pe.data[lea_offset : lea_offset + 3] != b"\x48\x8D\x15":
        return None

    try:
        target_va = pe.rip_target(lea_offset, instr_len=7, rel_offset=3)
        target = pe.read_bytes_va(target_va, expected_size)
    except (struct.error, SolveError):
        return None

    if not is_printable_ascii(target):
        return None
    return target_va, target


def find_memcmp_target_after_seed(pe: PEImage, seed_load_offset: int) -> tuple[int, bytes] | None:
    data = pe.data
    window = data[seed_load_offset : seed_load_offset + 0x500]

    # The verifier sets memcmp's third argument with "mov r8d, 0x14".
    # If a future attachment changes only the target/seed, this remains stable.
    size_markers = list(find_all(window, b"\x41\xB8\x14\x00\x00\x00"))
    search_starts = [seed_load_offset + marker for marker in size_markers]

    # Fallback: scan the whole local verifier window for memcmp-style lea rdx.
    if not search_starts:
        search_starts = [seed_load_offset]

    best: tuple[int, int, bytes] | None = None
    for start in search_starts:
        local = data[start : min(len(data), start + 0x120)]
        for rel in find_all(local, b"\x48\x8D\x15"):
            lea_offset = start + rel
            found = read_target_from_lea_rdx(pe, lea_offset, expected_size=20)
            if found is None:
                continue
            target_va, target = found
            score = 0

            # Strong signature around the real memcmp call:
            # lea rdx, target; lea rcx, local_buf; call memcmp; test eax, eax
            tail = data[lea_offset : lea_offset + 0x18]
            if b"\x48\x8D\x4D" in tail:
                score += 3
            if b"\x85\xC0" in tail:
                score += 3

            # The target is normally a C string with a NUL right after 20 bytes.
            try:
                if pe.read_bytes_va(target_va + 20, 1) == b"\0":
                    score += 2
            except SolveError:
                pass

            # Prefer targets found after the memcmp-size marker.
            score += max(0, 1000 - abs(lea_offset - start)) // 100
            if best is None or score > best[0]:
                best = (score, target_va, target)

    if best is None:
        return None
    _, target_va, target = best
    return target_va, target


def find_candidates(pe: PEImage) -> list[Candidate]:
    data = pe.data
    candidates: list[Candidate] = []

    # 44 8B 15 rel32 == mov r10d, dword ptr [rip+rel32]
    # In this challenge it loads dword_... into the LCG state.
    for off in find_all(data, b"\x44\x8B\x15"):
        nearby = data[off : off + 0x80]
        if b"\x45\x69\xD2\x6D\x4E\xC6\x41" not in nearby:
            continue
        if b"\x41\x81\xC2\x39\x30\x00\x00" not in nearby:
            continue

        try:
            seed_va = pe.rip_target(off, instr_len=7, rel_offset=3)
            seed = pe.read_u32_va(seed_va)
        except (struct.error, SolveError):
            continue

        target_info = find_memcmp_target_after_seed(pe, off)
        if target_info is None:
            continue
        target_va, target = target_info

        score = 10
        if 0 <= seed <= 0xFFFFFFFF:
            score += 1
        candidates.append(Candidate(seed_va, seed, target_va, target, score))

    return sorted(candidates, key=lambda item: item.score, reverse=True)


def reverse_fast_path(seed: int, target: bytes) -> str:
    chars: list[str] = []
    state = seed & 0xFFFFFFFF

    for b in target:
        state = (LCG_A * state + LCG_C) & 0xFFFFFFFF
        shift = (state >> 24) % PRINTABLE_MOD
        plain = ((b - PRINTABLE_BASE - shift) % PRINTABLE_MOD) + PRINTABLE_BASE
        chars.append(chr(plain))

    return "".join(chars)


def forward_fast_path(seed: int, text: str) -> bytes:
    out = bytearray()
    state = seed & 0xFFFFFFFF

    for ch in text.encode("ascii"):
        state = (LCG_A * state + LCG_C) & 0xFFFFFFFF
        shift = (state >> 24) % PRINTABLE_MOD
        out.append(((ch - PRINTABLE_BASE + shift) % PRINTABLE_MOD) + PRINTABLE_BASE)

    return bytes(out)


def solve(path: pathlib.Path, verbose: bool = False) -> str:
    data = path.read_bytes()
    pe = PEImage(data)
    prefix = extract_prefix(data)
    candidates = find_candidates(pe)
    if not candidates:
        raise SolveError("could not locate the fast-path seed/target pattern")

    candidate = candidates[0]
    inner = reverse_fast_path(candidate.seed, candidate.target)
    encoded = forward_fast_path(candidate.seed, inner)
    if encoded != candidate.target:
        raise SolveError("internal check failed while reversing fast path")

    flag = f"{prefix}{{{inner}}}"

    if verbose:
        print(f"[+] image base : 0x{pe.image_base:x}", file=sys.stderr)
        print(f"[+] seed VA    : 0x{candidate.seed_va:x}", file=sys.stderr)
        print(f"[+] seed       : {candidate.seed}", file=sys.stderr)
        print(f"[+] target VA  : 0x{candidate.target_va:x}", file=sys.stderr)
        print(f"[+] target     : {candidate.target.decode('ascii')!r}", file=sys.stderr)
        print(f"[+] inner      : {inner!r}", file=sys.stderr)

    return flag


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser(
        description="Solve ISCC caterpillar attachments by extracting seed/target from the PE."
    )
    parser.add_argument("-f", "--file", required=True, type=pathlib.Path, help="path to caterpillar exe")
    parser.add_argument("-v", "--verbose", action="store_true", help="print extracted addresses/constants")
    args = parser.parse_args(argv)

    try:
        print(solve(args.file, verbose=args.verbose))
    except (OSError, SolveError, struct.error) as exc:
        print(f"[-] {exc}", file=sys.stderr)
        return 1
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
