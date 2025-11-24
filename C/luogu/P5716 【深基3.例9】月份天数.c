#include <stdio.h>

int isLeapYear(int year){
    if ((year % 4 == 0 && year % 100 !=0)||( year % 400 == 0))
    {
        /* code */
        return 1;
    }
    return 0;
}

int main(){
    int year,month;
    int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
    scanf("%d %d",&year,&month);
    if (isLeapYear(year)==1)
        daysInMonth[1]=29;
    printf("%d",daysInMonth[month-1]);
    return 0;
}
