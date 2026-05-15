#!/usr/bin/env python3
"""镜厅中的回响 一键求解脚本
用法: python solve_misc4.py <attachment.zip>
拖拽 zip 到脚本上也可运行。
"""
import hashlib
import shutil
import subprocess
import sys
import tempfile
import zipfile
from pathlib import Path

import numpy as np
from scipy.io import wavfile as wav
import imageio_ffmpeg

MORSE = {
    '.-': 'A', '-...': 'B', '-.-.': 'C', '-..': 'D', '.': 'E', '..-.': 'F', '--.': 'G',
    '....': 'H', '..': 'I', '.---': 'J', '-.-': 'K', '.-..': 'L', '--': 'M', '-.': 'N',
    '---': 'O', '.--.': 'P', '--.-': 'Q', '.-.': 'R', '...': 'S', '-': 'T', '..-': 'U',
    '...-': 'V', '.--': 'W', '-..-': 'X', '-.--': 'Y', '--..': 'Z',
    '-----': '0', '.----': '1', '..---': '2', '...--': '3', '....-': '4', '.....': '5',
    '-....': '6', '--...': '7', '---..': '8', '----.': '9',
    '.-.-.-': '.', '--..--': ',', '..--..': '?', '-.-.--': '!',
    '-....-': '-', '-..-.': '/', '-.--.': '(', '-.--.-': ')',
    '.----.': "'", '---...': ':', '-.-.-.': ';', '.-.-.': '+', '-...-': '=',
    '..--.-': '_', '.-..-.': '"', '...-..-': '$', '.--.-.': '@',
    '.-...': '&',
}


def clear_zip_fake_encrypt(src: Path, dst: Path) -> None:
    data = bytearray(src.read_bytes())
    i = 0
    while True:
        j = data.find(b'PK\x03\x04', i)
        if j < 0:
            break
        data[j + 6] &= 0xFE
        i = j + 4
    i = 0
    while True:
        j = data.find(b'PK\x01\x02', i)
        if j < 0:
            break
        data[j + 8] &= 0xFE
        i = j + 4
    dst.write_bytes(data)


def extract_audio(zip_path: Path, outdir: Path) -> Path:
    outdir.mkdir(parents=True, exist_ok=True)
    fixed_zip = outdir / 'fixed.zip'
    mp4 = outdir / 'task.mp4'
    audio = outdir / 'audio.wav'

    clear_zip_fake_encrypt(zip_path, fixed_zip)
    with zipfile.ZipFile(fixed_zip) as zf:
        names = zf.namelist()
        target = next((n for n in names if n.lower().endswith('.mp4')), None)
        if target is None:
            raise RuntimeError(f'no mp4 inside {zip_path}: {names}')
        with zf.open(target) as src, open(mp4, 'wb') as dst:
            shutil.copyfileobj(src, dst)

    ffmpeg_exe = imageio_ffmpeg.get_ffmpeg_exe()
    subprocess.run(
        [ffmpeg_exe, '-y', '-v', 'error', '-i', str(mp4), '-vn', '-acodec', 'pcm_s16le', str(audio)],
        check=True,
    )
    return audio


def echo_decode(audio: Path, ws: int = 2205, d0: int = 100, d1: int = 130) -> str:
    sr, x = wav.read(audio)
    if x.ndim == 2 and x.shape[1] == 2:
        sig = (x[:, 0].astype(np.float64) + x[:, 1].astype(np.float64)) / 2.0
    else:
        sig = x.astype(np.float64)

    bits = []
    for off in range(0, len(sig) - ws + 1, ws):
        seg = sig[off:off + ws] - sig[off:off + ws].mean()
        cep = np.fft.irfft(np.log(np.abs(np.fft.rfft(seg)) ** 2 + 1e-10))
        p0 = float(np.max(cep[max(1, d0 - 2):d0 + 3]))
        p1 = float(np.max(cep[max(1, d1 - 2):d1 + 3]))
        bits.append(0 if p0 > p1 else 1)

    raw = bytes(int(''.join(map(str, bits[i:i + 8])), 2) for i in range(0, len(bits) - 7, 8))
    end = 0
    while end < len(raw) and raw[end] in b'.- /':
        end += 1
    morse = raw[:end].decode('ascii')
    return ''.join(MORSE[tok] for tok in morse.split() if tok in MORSE)


def atbash(s: str) -> str:
    out = []
    for c in s:
        if 'A' <= c <= 'Z':
            out.append(chr(ord('Z') - (ord(c) - ord('A'))))
        elif 'a' <= c <= 'z':
            out.append(chr(ord('z') - (ord(c) - ord('a'))))
        else:
            out.append(c)
    return ''.join(out)


def solve(zip_path: Path) -> str:
    with tempfile.TemporaryDirectory() as td:
        audio = extract_audio(zip_path, Path(td))
        decoded = echo_decode(audio)
    return f'ISCC{{{atbash(decoded)}}}'


def main():
    if len(sys.argv) < 2:
        print(f'用法: python {sys.argv[0]} <attachment.zip>', file=sys.stderr)
        sys.exit(1)

    zip_path = Path(sys.argv[1])
    if not zip_path.exists():
        print(f'文件不存在: {zip_path}', file=sys.stderr)
        sys.exit(1)

    md5 = hashlib.md5(zip_path.read_bytes()).hexdigest()
    print(f'MD5: {md5}')
    flag = solve(zip_path)
    print(f'FLAG: {flag}')


if __name__ == '__main__':
    main()
