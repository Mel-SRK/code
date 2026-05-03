#include<stdio.h>

int gcd(int c,int a){
    while (1)
    {
        if (a > c)
        {
            a -= c;
        }
        else if(a < c)
        {
            c -= a;
        }
        else
        {
            return a;
        }
    }
}

int main(){
    int a,b,c;
    int t;
    scanf("%d %d %d",&a,&b,&c);
    if(a<b){
        t=a;
        a=b;
        b=t;
    }if(c>b){
        t=c;
        c=b;
        b=t;
    }if(a<b){
        t=a;
        a=b;
        b=t;
    }
    
    printf("%d/%d",c/gcd(c,a),a/gcd(c,a));
    return 0;
}