#include <stdio.h>

int main(){
    //一对兔子，第三个月开始每个月生一对兔子，新兔子三个月后再每月生一对
    //2 2 4 6 10 16
    int Fmonth = 1;
    int Smonth = 1;
    int sum;
    printf("%d,%d,",Fmonth,Smonth);
    for (int i = 3; i < 40; i++)
    {
        /* code */
        Fmonth = Smonth + Fmonth;
        Smonth = Fmonth + Smonth;
        printf("%d,",Fmonth);
        printf("%d,",Smonth);
    }
    
    return 0;
}