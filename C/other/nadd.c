#include<stdio.h>

int main(){
    int a,b,c,n,sum;
    scanf("%d %d",&a,&n);
    sum = a;
    for (int i = 1; i <n; i++)
    {
        /* code */
        b = a;
        c = b*10+a;
        sum = b+c;
    }
    printf("%d\n",sum);
    return 0;
    
}