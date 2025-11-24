#include<stdio.h>
#include<stdlib.h>

int main(){
    int a,b,c,d;
    scanf("%d %d %d %d",&a,&b,&c,&d);
    a=c-a;
    b=d-b;
    if (b<0){
        a--;
        b=60-abs(b);
    }
    printf("%d %d",a,b);
    return 0;
}