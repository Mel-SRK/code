#include<stdio.h>

void reversePrint(int n){
    char Next;
    if (n<=1)
    {
        /* code */
        Next = getchar();
        putchar(Next);
    }else{
        Next = getchar();
        reversePrint(n - 1);
        putchar(Next);
    }
    
}

int main(){
    printf("input:");
    reversePrint(5);
    return 0;
}