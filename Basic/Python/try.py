import math
import pr
# print("hello world")
a="hello"
b="world"
print(a,b)
c=10
while c>0:
    print(c)
    c-=1
ch = ['hello','W021D']
for a in ch:
    print(a,' ',end='')
print('\n')

a=input("输入:")
print(a)
if a == 1:
    print("a is ture")
else:
    print("a is ",a)
i=0
while i<6:
    print(i)
    i+=1
    continue#逃过下面语句
    print("Do u Love me")
    break#跳出当前循环
if abs(-1):
    pass
ch='abcdefg'
print(ch[:6]+'here')

'''
列表是元素可以为不同类型数据的数组
元组为不可修改的列表
'''
ch=['a','b',c]
print(ch)
ch={'aaaa':'1234','1234':'lalala'} #字典
print(ch['aaaa'])
def main(a):
    print("In main:",a)

main(ch)
pr.pr(ch)

file = open('./a.txt','r+')
print ("文件名: ", file.name)
print ("是否已关闭 : ", file.closed)
print ("访问模式 : ", file.mode)
file.write("I'm in the a.txt\n")
print(file.tell())
file.seek(0)#移动光标
f_str=file.read()
print(f_str)
file.close()
