#include<stdio.h>

int main(){
    for (int i = 1; i <= 9; i++)
    {
        /* code */
        for (int j = 1; j <= i; j++)
        {
            /* code */
            printf("%dx%d=%d ",i,j,j*i);
        }
        printf("\n");
    }
    return 0;
}