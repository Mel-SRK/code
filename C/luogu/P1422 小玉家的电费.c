#include<stdio.h>

int main(){
    int x;
    double y;
    scanf("%d",&x);
    if (x<150)
    {
        /* code */
        y=x*0.4463;
    }else if (x<400)
    {
        /* code */
        y=150*0.4463+(x-150)*0.4663;
    }else{
        y=150*0.4463+(400-150)*0.4663+(x-400)*0.5663;
    }
    printf("%.1f",y);
    return 0;
}