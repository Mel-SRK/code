#include <stdio.h>
#include<time.h>

int isLeapYear(int year){
    if ((year % 4 == 0 && year % 100 !=0)||( year % 400 == 0))
    {
        /* code */
        return 1;
    }
    return 0;
    
}

int main(){
    int year,month,day,sumDays = 0;
    int Ydays = 365;
    int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};

    //printf("Today is(YEAR MONTH DAY):");
    //scanf("%d %d %d",&year,&month,&day);
    char buffer[80];
    struct tm *time_info;
    time_t current_time;
    time(&current_time);
    time_info = localtime(&current_time);
    year = time_info->tm_year + 1900;  // tm_year是从1900开始的年数
    month = time_info->tm_mon + 1;     // tm_mon范围是0-11
    day = time_info->tm_mday;
    if (isLeapYear(year)==1)
    {
        daysInMonth[1]=29;
        Ydays = 366;
    }

    for (int i = 0; i < month-1; i++)
    {
        sumDays=sumDays+daysInMonth[i];
    }
    sumDays = sumDays + day;
    printf("今天是第%d天本年已过去:%d%\n",sumDays,sumDays*100/Ydays);
    return 0;
}
