from pwn import *
elf=ELF('./pwn')

# 获取PLT地址
write_plt = elf.plt['write']
print(f"write_plt: {hex(write_plt)}")
# 获取GOT地址
write_got = elf.got['write']
print(f"write_got: {hex(write_got)}")
