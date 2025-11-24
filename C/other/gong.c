#include <stdio.h>

int main(){
    int a,b,c;
    printf("input:");
    scanf("%d %d",&a,&b);
    for (int i = 2; i <= b; i++)
    {
        /* code */
        if (a%i==0&&b%i==0)
        {
            /* code */
            c = i;
        }
    }
    printf("%d",c);

    return 0;
    //最大公约数
}