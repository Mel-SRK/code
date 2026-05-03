#include<stdio.h>
#define MAX(i,j) (i>j?i:j)
#define MIN(i,j) (i<j?i:j)

int main(){
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    if (a>MAX(b,c))
    {
        printf("%d %d %d",MIN(b,c),MAX(b,c),a);
    }else if (b>MAX(a,c))
    {
        printf("%d %d %d",MIN(a,c),MAX(a,c),b);
    }else if(c>MAX(a,b)){
        printf("%d %d %d",MIN(a,b),MAX(a,b),c);
    }else{
        if (a == b)
        {
            printf("%d %d %d",MIN(a,c),MIN(a,c),MAX(a,c));
        }else if (a == c)
        {
            printf("%d %d %d",MIN(a,b),MIN(a,b),MAX(a,b));
        }else //b==c
        {
            printf("%d %d %d",MIN(a,b),MIN(a,b),MAX(a,b));
        }
    }
    return 0;
}