#include<stdio.h>

int main(){
    for (size_t i = 0; i < 3; i++)
    {
        for (size_t j = 0; j < 2-i; j++)
        {
            printf(" ");
        }
        for (size_t n = 0; n < 2*i+1; n++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (size_t i = 2; i > 0; i--)
    {
        for (size_t j = 3; j > i; j--)
        {
            printf(" ");
        }
        for (size_t n = 0; n < 2*i-1; n++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
    
}