#include <stdio.h>

int main() {
    int L, k,sum = 0, n = 0;
    scanf("%d", &L);
    for (int i = 2;; i++)
    {
        int Flag = 1;
        for (int j = 2; j*j < i; j++)
        {
            if (i%j==0)
            {
                Flag=0;
                break;
            }
            
        }
        if (Flag){
            if (sum+i>L)break;
            printf("%d\n",i);
            sum+=i;
            n++;
        }
    }
    
    printf("%d", n);
    return 0;
}
