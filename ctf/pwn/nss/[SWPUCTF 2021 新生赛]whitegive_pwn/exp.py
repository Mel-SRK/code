from pwn import *
from LibcSearcher import *
context(arch='amd64',os='linux',log_level='debug')
p=remote('node7.anna.nssctf.cn',29682)

payload=flat([])



