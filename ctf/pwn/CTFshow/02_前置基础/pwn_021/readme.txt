提交ctfshow{【.got表与.got.plt是否可写(可写为1，不可写为0)】,【.got的地址】,【.got.plt的地址】}

例如 .got可写.got.plt表可写其地址为0x400820 0x8208820

最终flag为ctfshow{1_1_0x400820_0x8208820}

若某个表不存在，则无需写其对应地址

如不存在.got.plt表，则最终flag值为ctfshow{1_0_0x400820}