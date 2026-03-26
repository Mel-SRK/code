#include<stdio.h>
#include<string.h>
#include<unistd.h>  //可直接调用read,此库的函数操作更为直接

char global_msg[]="Hello Pwn Data Segment!";
int global_bss_var;

void vulnerable_function(){
    char buf[16];   //占用16字节
    printf("Please input your name:\n");
    read(0,buf,100);    //c11标准后gets()函数被废弃，0为标准输入，最多读取100字节的内容
    printf("Welcome,%s",buf);   //read会把换行符也读进去
}

int main(){
    printf("===I Love Pwn===\n");
    vulnerable_function();
    return 0;
}
