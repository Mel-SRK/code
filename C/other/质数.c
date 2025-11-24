#include<stdio.h>

int main(){
    int n = 90;
    for (int i = 2; i <= n; i++)
    {
        while (n%i==0)
        {
            //可以整除
            //进一步从简
            n/=i;
            printf("%d",i);
            if (n!=1)
            {
                /*  */
                printf("x");
            }
            
        }
        
    }
    
    return 0;
}