class Human:
    def __init__(self,sex,height,age):
        sex=self.sex
        height=self.hight
        age=self.age
        print("创建Human")

class man(Human):
    def l_out(l):
        print(l)

class woman(Human):
    def l_in(l):
        print(l)

Tom = man
Tom.age=16
Tom.sex=1
Tom.height=170
Tom.l_out(15)
