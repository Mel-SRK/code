#include<stdio.h>

int main(){
    int c,ne;
    int a=0,b=1;
    int n;
    scanf("%d",&n);
    if(n<=2)
    {
        /* code */
        printf("%d",n-1);
    }else{
        for (int i = 3; i <= n; i++)
        {
            /* code */
            ne = a+b;
            a = b;
            b = ne;
        }
        printf("%d",ne);
        
    }
    
    return 0;
}