#include<stdio.h>
int main(){
    int n=0;
    char F;
    printf("in:");
    scanf("%d",&n);
    if (n>=60)
    {
        /* code */
        F = (n>=80)?'A':'B';
    }else{
        F = 'C';
    }
    printf("\n%c\n",F);
    return 0;
}