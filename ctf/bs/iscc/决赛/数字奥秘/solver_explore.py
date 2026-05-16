import ast
import base64
import binascii
import gzip
import hashlib
import json
import lzma
import re
import struct
import zlib
from pathlib import Path


PNG_PATH = Path("challenge.bin")


def parse_png_text_chunks(path: Path):
    data = path.read_bytes()
    assert data[:8] == b"\x89PNG\r\n\x1a\n"
    chunks = {}
    offset = 8
    trailing = b""
    while offset < len(data):
        length = struct.unpack(">I", data[offset : offset + 4])[0]
        ctype = data[offset + 4 : offset + 8]
        chunk_data = data[offset + 8 : offset + 8 + length]
        offset += 12 + length
        if ctype == b"tEXt":
            key, value = chunk_data.split(b"\x00", 1)
            chunks[key.decode()] = value.decode("latin1")
        if ctype == b"IEND":
            trailing = data[offset:]
            break
    return chunks, trailing


class BrainfuckVM:
    def __init__(self, mode="buggy"):
        self.mode = mode
        self.memory = [0] * 30000
        self.ptr = 0
        self.pc = 0
        self.fp_reg = 0.0
        self.output = []

    def run(self, code: str):
        self.memory = [0] * 30000
        self.ptr = 0
        self.pc = 0
        self.fp_reg = 0.0
        self.output = []
        while self.pc < len(code):
            cmd = code[self.pc]
            if cmd == ">":
                self.ptr = (self.ptr + 1) % len(self.memory)
            elif cmd == "<":
                self.ptr = (self.ptr - 1) % len(self.memory)
            elif cmd == "+":
                self.memory[self.ptr] += 1
            elif cmd == "-":
                self.memory[self.ptr] -= 1
            elif cmd == ".":
                self.output.append(self.memory[self.ptr])
            elif cmd == ",":
                self.memory[self.ptr] = 0
            elif cmd == "*":
                self.fp_reg = self.memory[self.ptr] * 0.1
            elif cmd == "#":
                if self.mode == "buggy":
                    val = int(self.fp_reg)
                elif self.mode == "round":
                    val = round(self.fp_reg)
                elif self.mode == "ceil":
                    import math

                    val = math.ceil(self.fp_reg)
                else:
                    raise ValueError(self.mode)
                self.output.append(val)
            self.pc += 1
        return self.output


def egcd(a, b):
    if b == 0:
        return a, 1, 0
    g, x1, y1 = egcd(b, a % b)
    return g, y1, x1 - (a // b) * y1


def crt_pair(a1, m1, a2, m2):
    g, x, _ = egcd(m1, m2)
    if (a2 - a1) % g:
        return None
    lcm = m1 // g * m2
    t = ((a2 - a1) // g * x) % (m2 // g)
    return (a1 + m1 * t) % lcm, lcm


def crt_all(residues, moduli):
    a, m = residues[0], moduli[0]
    merged = [(a, m)]
    for ai, mi in zip(residues[1:], moduli[1:]):
        out = crt_pair(a, m, ai, mi)
        if out is None:
            return None
        a, m = out
        merged.append((a, m))
    return a, m, merged


def build_key_materials(outputs, periods, crt_result):
    x, mod, merged = crt_result
    materials = []

    def add(name, value):
        if isinstance(value, bytes) and value:
            materials.append((name, value))

    numbers = [x, mod] + [a for a, _ in merged] + [m for _, m in merged]
    texts = [
        str(outputs),
        str(periods),
        str((x, mod)),
        str([x, mod]),
        str(x),
        str(mod),
        str(merged),
        json.dumps(outputs),
        json.dumps(outputs, separators=(",", ":")),
        json.dumps([x, mod]),
        json.dumps([x, mod], separators=(",", ":")),
        ",".join(map(str, outputs)),
        " ".join(map(str, outputs)),
        "[" + ",".join(map(str, outputs)) + "]",
        ";".join(f"x%{m}={a}" for a, m in zip(outputs, periods)),
        "SYNC_SENSOR_2025",
        ":SYNC_SENSOR_2025",
        "merged_result",
        "result",
        "crt",
    ]
    for t in texts:
        for suffix in ("", "\n", "\r\n"):
            add("text", (t + suffix).encode())

    for n in numbers:
        add("dec", str(n).encode())
        add("hex", hex(n).encode())
        add("xhex", format(n, "x").encode())
        for size in (2, 4, 8, 16, 24, 32):
            if n < 1 << (size * 8):
                add("be", n.to_bytes(size, "big"))
                add("le", n.to_bytes(size, "little"))

    arr_bytes = bytes(v & 0xFF for v in outputs)
    add("arr_u8", arr_bytes)
    for size_code in ("H", "I", "Q"):
        for endian in ("<", ">"):
            try:
                packed = b"".join(struct.pack(endian + size_code, v) for v in outputs)
                add("packed", packed)
            except struct.error:
                pass

    base = list(materials)
    for name, blob in base:
        add(name + "_b64", base64.b64encode(blob))
        add(name + "_hex", blob.hex().encode())
        for hname, hfunc in (
            ("md5", hashlib.md5),
            ("sha1", hashlib.sha1),
            ("sha256", hashlib.sha256),
            ("sha512", hashlib.sha512),
        ):
            digest = hfunc(blob).digest()
            add(name + "_" + hname, digest)
            add(name + "_" + hname + "_hex", digest.hex().encode())

    dedup = []
    seen = set()
    for item in materials:
        if item[1] not in seen:
            seen.add(item[1])
            dedup.append(item)
    return dedup


def xor_repeat(data, key):
    return bytes(b ^ key[i % len(key)] for i, b in enumerate(data))


def xor_oneshot(data, key):
    if len(key) != len(data):
        return None
    return bytes(a ^ b for a, b in zip(data, key))


def looks_interesting(blob: bytes):
    printable = sum(32 <= c < 127 or c in (9, 10, 13) for c in blob)
    txt = "".join(chr(c) if 32 <= c < 127 else "." for c in blob)
    if b"ISCC{" in blob or b"flag{" in blob.lower():
        return True, {"printable": printable, "text": txt}
    if printable >= len(blob) - 2:
        return True, {"printable": printable, "text": txt}
    if re.fullmatch(rb"[A-Za-z0-9+/=\r\n]+", blob):
        return True, {"printable": printable, "text": txt}
    if re.fullmatch(rb"[0-9a-fA-F]+", blob) and len(blob) % 2 == 0:
        return True, {"printable": printable, "text": txt}
    if blob[:1] in b"[{\"" and blob[-1:] in b"]}\"":
        return True, {"printable": printable, "text": txt}
    return False, {"printable": printable, "text": txt}


def second_layers(blob: bytes):
    out = [("raw", blob)]
    if re.fullmatch(rb"[A-Za-z0-9+/=\r\n]+", blob):
        try:
            out.append(("base64", base64.b64decode(blob)))
        except binascii.Error:
            pass
    if re.fullmatch(rb"[0-9a-fA-F]+", blob) and len(blob) % 2 == 0:
        try:
            out.append(("hex", bytes.fromhex(blob.decode())))
        except ValueError:
            pass
    for name, fn in (
        ("zlib", zlib.decompress),
        ("gzip", gzip.decompress),
        ("lzma", lzma.decompress),
    ):
        try:
            out.append((name, fn(blob)))
        except Exception:
            pass
    return out


def main():
    chunks, trailing = parse_png_text_chunks(PNG_PATH)
    code = chunks["SYNC_CODE"]
    periods = ast.literal_eval(chunks["PERIODS"])
    payload = base64.b64decode(chunks["SYNC_PAYLOAD"])

    print("trailing_len", len(trailing))
    print("payload_len", len(payload))

    for mode in ("buggy", "round", "ceil"):
        outputs = BrainfuckVM(mode).run(code)
        crt_result = crt_all(outputs, periods)
        print("\nMODE", mode)
        print("outputs", outputs)
        print("crt", crt_result[:2] if crt_result else None)
        if not crt_result:
            continue
        materials = build_key_materials(outputs, periods, crt_result)
        print("key_materials", len(materials))
        hits = 0
        for name, key in materials:
            for xor_name, out in (
                ("repeat", xor_repeat(payload, key)),
                ("oneshot", xor_oneshot(payload, key)),
            ):
                if out is None:
                    continue
                ok, info = looks_interesting(out)
                if ok:
                    print("\nHIT", mode, name, xor_name, "key_len", len(key))
                    print("key", repr(key[:80]))
                    print("out", out)
                    print("text", info["text"])
                    hits += 1
                for layer_name, layer_blob in second_layers(out):
                    if layer_name == "raw":
                        continue
                    ok2, info2 = looks_interesting(layer_blob)
                    if ok2:
                        print("\nLAYER_HIT", mode, name, xor_name, layer_name, "key_len", len(key))
                        print("key", repr(key[:80]))
                        print("layer", layer_blob)
                        print("text", info2["text"])
                        hits += 1
        print("interesting_hits", hits)


if __name__ == "__main__":
    main()
