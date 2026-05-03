#include<stdio.h>

int main(){
    //统计字母，数字，空格与其他字符数量
    int letterCount=0,numberCount=0,spaceCount=0,otherCount=0;
    char i;
    while ((i = getchar())!='\n')
    {
        /* code */
        if ((i>='a'&&i<='z') || (i>='A'&&i<='B'))
        {
            /* code */
            letterCount++;
        }else if (i>='0'&&i<='9')
        {
            /* code */
            numberCount++;
        }else if (i == ' ')
        {
            /* code */
            spaceCount++;
        }else{
            otherCount++;
        }
    }
    printf("L:%d,N:%d,S:%d,O:%d\n",letterCount,numberCount,spaceCount,otherCount);
    return 0;
    
}