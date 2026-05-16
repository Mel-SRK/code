#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from __future__ import annotations

import argparse
import base64
import gzip
import hashlib
import zipfile
from io import BytesIO
from pathlib import Path

import numpy as np
from PIL import Image


# =========================================================
# Constants
# =========================================================

CHANNEL_SEEDS = {
    "R": 863148490,
    "G": 72199925,
    "B": 2239801264,
}

CHANNEL_INDEX = {
    "R": 0,
    "G": 1,
    "B": 2,
}

FLAG_PREFIX = b"ISCC{"
FLAG_SUFFIX = b"}"


# =========================================================
# Utility Functions
# =========================================================

def extract_lsb_payload(
    img: Image.Image,
    channel: int,
    max_bytes: int = 16,
) -> bytes:
    """
    从指定颜色通道提取 LSB payload。
    """
    arr = np.array(img.convert("RGB"))

    bits = (arr[:, :, channel] & 1).reshape(-1)
    bits = bits[: max_bytes * 8]

    return np.packbits(bits, bitorder="big").tobytes()


def scramble_between_markers(
    data: bytes,
    seed: int,
    prefix: bytes = FLAG_PREFIX,
    suffix: bytes = FLAG_SUFFIX,
) -> bytes:
    """
    对 flag 中间部分进行伪随机重排。
    """

    start = data.find(prefix)
    end = data.find(suffix, start + len(prefix))

    if start < 0 or end < 0:
        return data

    left = data[: start + len(prefix)]

    middle = np.frombuffer(
        data[start + len(prefix): end],
        dtype=np.uint8,
    ).copy()

    right = data[end:]

    indices = np.arange(len(middle), dtype=np.int64)
    np.random.RandomState(seed).shuffle(indices)

    shuffled = middle[indices]

    return left + shuffled.tobytes() + right


def extract_flag_inner(data: bytes) -> str:
    """
    提取 ISCC{xxx} 中的 xxx。
    """
    text = data.decode()

    start = text.index("{") + 1
    end = text.rindex("}")

    return text[start:end]


def load_challenge(path: Path):
    """
    读取 zip 内资源。
    """

    with zipfile.ZipFile(path) as zf:
        img_data = zf.read("Input.png")
        state_data = zf.read("model_state.npz")

    img = Image.open(BytesIO(img_data))
    state = np.load(BytesIO(state_data))

    return img, state


def decode_hint(state) -> str:
    """
    解码 hint。
    """

    encoded = bytes(state["base_hint_bytes"])

    return gzip.decompress(
        base64.b64decode(encoded)
    ).decode()


# =========================================================
# Core Solver
# =========================================================

def solve_zip(path: Path) -> dict:
    """
    求解单个 zip challenge。
    """

    img, state = load_challenge(path)

    hint = decode_hint(state)

    # 提取 RGB 三个通道 payload
    payloads = {
        ch: extract_lsb_payload(img, CHANNEL_INDEX[ch])
        for ch in ("R", "G", "B")
    }

    # 已恢复出的 channel mapping:
    # (R, G, B) -> (G, B, R)
    #
    # logical B 最终映射到 output G
    output_g = scramble_between_markers(
        payloads["B"],
        seed=CHANNEL_SEEDS["B"],
    )

    flag1 = extract_flag_inner(payloads["R"])
    flag2 = extract_flag_inner(output_g)

    digest = hashlib.md5(
        (flag1 + flag2).encode()
    ).hexdigest()

    final_flag = f"ISCC{{{digest}}}"

    return {
        "path": path,
        "hint": hint,
        "payloads": payloads,
        "output_g": output_g,
        "flag1": flag1,
        "flag2": flag2,
        "flag": final_flag,
    }


# =========================================================
# CLI
# =========================================================

def iter_targets(paths: list[str]) -> list[Path]:
    """
    获取待处理 zip 文件列表。
    """

    if paths:
        return [Path(p) for p in paths]

    return sorted(
        Path(".").glob("*.zip"),
        key=lambda p: p.name.lower(),
    )


def print_result(result: dict) -> None:
    """
    格式化输出结果。
    """

    print(f"== {result['path']} ==")
    print(result["hint"])

    for ch in ("R", "G", "B"):
        payload = result["payloads"][ch].decode()
        print(f"input {ch}: {payload}")

    print(f"mapped final G: {result['output_g'].decode()}")

    print(f"flag1 = {result['flag1']}")
    print(f"flag2 = {result['flag2']}")

    print(result["flag"])
    print()


def main() -> None:
    parser = argparse.ArgumentParser(
        description="Solve TrainModel-style ISCC misc attachments."
    )

    parser.add_argument(
        "zipfiles",
        nargs="*",
        help=(
            "zip attachments to solve; "
            "defaults to all zip files in current directory"
        ),
    )

    args = parser.parse_args()

    for path in iter_targets(args.zipfiles):
        result = solve_zip(path)
        print_result(result)


if __name__ == "__main__":
    main()