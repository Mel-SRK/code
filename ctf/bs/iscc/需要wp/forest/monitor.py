#!/usr/bin/env python3
"""Monitor remote server and auto-exploit when it comes online."""
import socket
import time
import subprocess
import sys
from datetime import datetime

HOST = "39.96.193.120"
PORT = 10001
CHECK_INTERVAL = 30  # seconds between checks
MAX_RETRIES = 3      # retry check before considering online
EXPLOIT_SCRIPT = "./solve_forest_local.py"


def check_server() -> bool:
    """Return True if server is sending the expected banner."""
    try:
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        s.settimeout(5)
        s.connect((HOST, PORT))
        time.sleep(1)
        data = s.recv(4096)
        s.close()
        # Server is up if it sends any data (tree, banner, etc.)
        if data and len(data) > 10:
            # Verify it's the right binary by checking for known banner text
            if b"Fogwood" in data or b"Greetings" in data or b"*" in data:
                return True
            # Even if partial, if we got substantial data it's likely up
            return len(data) > 50
        return False
    except (socket.timeout, ConnectionRefusedError, OSError):
        return False


def run_exploit():
    """Run the exploit script."""
    print(f"[{datetime.now().strftime('%H:%M:%S')}] Running exploit...")
    result = subprocess.run(
        [sys.executable, EXPLOIT_SCRIPT, "REMOTE"],
        capture_output=False,
        timeout=60,
    )
    return result.returncode == 0


def main():
    print(f"Monitoring {HOST}:{PORT} every {CHECK_INTERVAL}s...")
    failures = 0

    while True:
        now = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        if check_server():
            failures = 0
            print(f"[{now}] Server appears ONLINE! Waiting 3s then exploiting...")
            time.sleep(3)

            # Double-check
            if check_server():
                run_exploit()
                print("Exploit finished. Continuing to monitor...")
            else:
                print("False alarm, server went offline again.")
        else:
            failures += 1
            if failures == 1:
                print(f"[{now}] Server offline", end="", flush=True)
            else:
                print(".", end="", flush=True)
            if failures % 20 == 0:
                print()  # newline every ~10 min

        time.sleep(CHECK_INTERVAL)


if __name__ == "__main__":
    # Quick first check
    print(f"[{datetime.now().strftime('%H:%M:%S')}] Initial check...")
    if check_server():
        print("Server is ALREADY online! Exploiting...")
        run_exploit()
    else:
        main()
