#include<stdio.h>
#define MAX(i, j) (((i) > (j)) ? (i) : (j))
int main(){
    int m,t,s;
    scanf("%d %d %d",&m,&t,&s);
    if(t==0){
        printf("0");
        return 0;
    }
    s=(s+t-1)/t;
    printf("%d",MAX(m-s,0));
    return 0;
}