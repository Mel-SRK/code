import sys
import os
import re
import struct
import hashlib
import zipfile
import tempfile
import calendar
from datetime import datetime

def extract_zip(zip_path):
    tmpdir = tempfile.mkdtemp()
    with zipfile.ZipFile(zip_path, 'r') as z:
        z.extractall(tmpdir)
    return tmpdir

def parse_flight_log(txt_path):
    with open(txt_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()

    lines = content.strip().split('\n')

    events = {'EVT_A': [], 'EVT_B': [], 'EVT_C': []}
    entries = []

    for line in lines:
        if line.startswith('#') or not line.strip():
            continue
        parts = line.split(',')
        if len(parts) < 10:
            continue
        try:
            idx = int(parts[0])
        except ValueError:
            continue

        local_dt_str = parts[1].strip()
        lon = float(parts[3])
        event_type = parts[8].strip() if len(parts) > 8 else ''
        detail = parts[9].strip() if len(parts) > 9 else ''

        entry = {
            'idx': idx,
            'local_dt': local_dt_str,
            'lon': lon,
            'event': event_type,
            'detail': detail
        }
        entries.append(entry)

        if event_type == 'EVT_A':
            events['EVT_A'].append(entry)
        elif event_type == 'EVT_B':
            events['EVT_B'].append(entry)
        elif event_type == 'EVT_C':
            events['EVT_C'].append(entry)

    # Extract base64 from end of file
    import base64
    b64_match = re.search(r'[A-Za-z0-9+/=]{40,}$', content.strip())
    hint = ''
    if b64_match:
        try:
            hint = base64.b64decode(b64_match.group()).decode()
        except:
            pass

    return entries, events, hint

def local_to_utc_timestamp(local_dt_str, idx, idl_idx=26):
    dt = datetime.strptime(local_dt_str, '%Y-%m-%d %H:%M:%S')

    if idx <= idl_idx:
        # Before/at IDL: timezone = UTC+14 (Kiribati Line Islands)
        utc_dt = datetime(dt.year, dt.month, dt.day, dt.hour, dt.minute, dt.second)
        ts = int(calendar.timegm(utc_dt.timetuple())) - 14 * 3600
    else:
        # After IDL: timezone = UTC-11, FDR bug means date not corrected
        # UTC = local + 11h (since timezone is -11, UTC = local - (-11) = local + 11)
        utc_dt = datetime(dt.year, dt.month, dt.day, dt.hour, dt.minute, dt.second)
        ts = int(calendar.timegm(utc_dt.timetuple())) + 11 * 3600

    return ts

def extract_ciphertext_from_pcap(pcap_path):
    with open(pcap_path, 'rb') as f:
        data = f.read()

    magic = struct.unpack('<I', data[0:4])[0]
    if magic == 0xa1b2c3d4:
        endian = '<'
    elif magic == 0xd4c3b2a1:
        endian = '>'
    else:
        return None

    pos = 24
    payloads = []
    while pos < len(data):
        if pos + 16 > len(data):
            break
        ts_sec, ts_usec, incl_len, orig_len = struct.unpack(f'{endian}IIII', data[pos:pos+16])
        pkt_data = data[pos+16:pos+16+incl_len]
        pos += 16 + incl_len

        if len(pkt_data) < 54:
            continue

        eth_type = struct.unpack('>H', pkt_data[12:14])[0]
        if eth_type != 0x0800:
            continue

        ip_header = pkt_data[14:]
        ip_ihl = (ip_header[0] & 0x0f) * 4
        ip_total_len = struct.unpack('>H', ip_header[2:4])[0]

        tcp_header = ip_header[ip_ihl:]
        tcp_data_offset = ((tcp_header[12] >> 4) & 0x0f) * 4

        payload_len = ip_total_len - ip_ihl - tcp_data_offset
        if payload_len > 0:
            tcp_payload = tcp_header[tcp_data_offset:tcp_data_offset+payload_len]
            payloads.append(tcp_payload)

    # Find CIPH: prefix in payloads
    for payload in payloads:
        text = payload.decode('ascii', errors='ignore')
        if text.startswith('CIPH:'):
            hex_str = text[5:].strip()
            try:
                return bytes.fromhex(hex_str)
            except ValueError:
                continue

    return None

def decrypt_ctr(ciphertext, keymat):
    keystream = b''
    blocks_needed = (len(ciphertext) + 31) // 32
    for i in range(blocks_needed):
        keystream += hashlib.sha256(keymat.encode() + struct.pack(">I", i)).digest()
    return bytes(c ^ k for c, k in zip(ciphertext, keystream))

def solve(zip_path):
    print(f"[*] Extracting {zip_path}...")
    tmpdir = extract_zip(zip_path)

    # Find files
    txt_file = pcap_file = png_file = None
    for root, dirs, files in os.walk(tmpdir):
        for f in files:
            path = os.path.join(root, f)
            if f.endswith('.txt'):
                txt_file = path
            elif f.endswith('.pcap'):
                pcap_file = path
            elif f.endswith('.png'):
                png_file = path

    if not txt_file or not pcap_file:
        print("[-] Missing required files (txt/pcap)")
        return

    # Parse flight log
    print("[*] Parsing flight log...")
    entries, events, hint = parse_flight_log(txt_file)
    print(f"    Found {len(entries)} entries")
    print(f"    EVT_A: {len(events['EVT_A'])} events")
    print(f"    EVT_B: {len(events['EVT_B'])} events")
    print(f"    EVT_C: {len(events['EVT_C'])} events")

    if hint:
        print(f"[*] Decoded hint:\n    {hint.replace(chr(10), chr(10) + '    ')}")

    # Extract ciphertext from pcap
    print("[*] Extracting ciphertext from pcap...")
    ciphertext = extract_ciphertext_from_pcap(pcap_file)
    if not ciphertext:
        print("[-] Failed to extract ciphertext")
        return
    print(f"    Ciphertext ({len(ciphertext)} bytes): {ciphertext.hex()}")

    # Find IDL crossing index
    idl_idx = 26
    for e in events['EVT_B']:
        idl_idx = e['idx']
        break

    # Compute EVT_A timestamp (TCP_SYN_SENT - first EVT_A)
    evt_a = events['EVT_A'][0]
    evt_a_ts = local_to_utc_timestamp(evt_a['local_dt'], evt_a['idx'], idl_idx)
    print(f"[*] EVT_A (idx {evt_a['idx']}): local={evt_a['local_dt']} -> UTC ts={evt_a_ts}")

    # Compute EVT_B timestamp (IDL_CROSS)
    evt_b = events['EVT_B'][0]
    evt_b_ts = local_to_utc_timestamp(evt_b['local_dt'], evt_b['idx'], idl_idx)
    print(f"[*] EVT_B (idx {evt_b['idx']}): local={evt_b['local_dt']} -> UTC ts={evt_b_ts}")

    # Try all EVT_C candidates to find the one that produces valid flag
    print("[*] Trying EVT_C candidates...")
    flag = None
    for evt_c in events['EVT_C']:
        evt_c_ts = local_to_utc_timestamp(evt_c['local_dt'], evt_c['idx'], idl_idx)
        keymat = f"AURORA-ER|flight=LX-517|syn={evt_a_ts}|idl={evt_b_ts}|a2={evt_c_ts}"

        plaintext = decrypt_ctr(ciphertext, keymat)
        try:
            text = plaintext.decode('ascii')
            if text.startswith('ISCC{') and text.endswith('}'):
                flag = text
                print(f"    [+] idx {evt_c['idx']} (marker={evt_c['detail'].split(';')[0].split('=')[1]}): VALID")
                print(f"    KEYMAT: {keymat}")
                break
            else:
                print(f"    [-] idx {evt_c['idx']}: decrypts but not flag format: {text[:30]}...")
        except (UnicodeDecodeError, ValueError):
            print(f"    [-] idx {evt_c['idx']}: invalid decryption")

    if flag:
        print(f"\n[+] FLAG: {flag}")
    else:
        print("\n[-] No valid flag found with pcap ciphertext, trying alternate approach...")
        # If pcap ciphertext doesn't work directly, the flag content might need
        # different EVT_C interpretation. Print all attempts for manual review.
        for evt_c in events['EVT_C']:
            evt_c_ts = local_to_utc_timestamp(evt_c['local_dt'], evt_c['idx'], idl_idx)
            keymat = f"AURORA-ER|flight=LX-517|syn={evt_a_ts}|idl={evt_b_ts}|a2={evt_c_ts}"
            plaintext = decrypt_ctr(ciphertext, keymat)
            print(f"    idx {evt_c['idx']}: {plaintext.hex()[:40]}... | {plaintext[:20]}")

    # Cleanup
    import shutil
    shutil.rmtree(tmpdir, ignore_errors=True)

    return flag

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print(f"Usage: python3 {sys.argv[0]} <challenge.zip>")
        sys.exit(1)

    zip_path = sys.argv[1]
    if not os.path.exists(zip_path):
        print(f"[-] File not found: {zip_path}")
        sys.exit(1)

    result = solve(zip_path)
    if not result:
        sys.exit(1)