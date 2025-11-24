#include<stdio.h>
#include<math.h>

int main(){
    int T,a,b;
    double c;
    scanf("%d",&T);
    switch (T)
    {
    case 1:
        /* code */
        printf("I love Luogu!");
        break;
    case 2:
        /* code */
        printf("6 4");
        break;
    case 3:
        /* code */
        a=14;
        b=4;
        printf("%d\n%d\n%d",a/b,a/b*b,a%b);
        break;
    case 4:
        /* code */
        c=500.0/3.0;
        printf("%.6g",c);
        break;
    case 5:
        /* code */
        a=260;
        b=220;
        printf("%d",(a+b)/(12+20));
        break;
    case 6://
        double e=6,f=9;
        c=sqrt(e*e+f*f);
        printf("%.6g",c);
        break;
    case 7:
        /* code */
        a=100+10;
        printf("%d\n",a);
        a-=20;
        printf("%d\n",a);
        printf("0");
        break;
    case 8:
        /* code */
        c=3.141593;
        a=5;
        double d=2*c*a;
        printf("%.6g\n",d);
        d=c*a*a;
        printf("%.6g\n",d);
        d=c*pow(a,3)*4/3;
        printf("%.6g\n",d);
        break;
    case 9:
        a=1;
        for (int i = 0; i < 3; i++)
        {
            /* code */
            a=a+1;
            a=a*2;
        }
        printf("%d",a);
        /* code */
        break;
    case 10:
        /* code */
        printf("9");
        break;
    case 11:
        /* code */
        printf("%.6g",100.0/3);
        break;
    case 12:
        /* code */
        a = 'A';
        b = 'M';
        printf("%d\n%c",b-a+1,a+17);
        break;
    case 13://
        /* code */
        int r1=4,r2=10;
        double pi=3.141593;
        double v=4.0/3*pi*r1*r1*r1+4.0/3*pi*r2*r2*r2;
        v=pow(v,1.0/3);
        printf("%.0lf\n",v);
        break;
    case 14:
        /* code */
        printf("50");
        break;
    default:
        return 1;
    }
    return 0;
}