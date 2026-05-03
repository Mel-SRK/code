#include<stdio.h>

int age(int n){
    int c;
    if (n<=1)
    {
        /* code */
        c=10;
    }else{
        c = age(n-1)+2;
    }
    return c;
    
}

int main(){
    int n = 5;
    printf("%d",age(n));
    return 0;
}