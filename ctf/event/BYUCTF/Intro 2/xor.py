enc=b"HS_I^LQ]OFIEGOu^EuXO\\uLOFFKYW"
flag=''.join(chr(b^0x2A)for b in enc)
print(flag)

