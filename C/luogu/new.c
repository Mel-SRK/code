#include<stdio.h>
int a[20][20];

int main(){
    int n,k=0,x=0,y=0;
    scanf("%d",&n);
    while(k<=n*n){
        while(x<n-1&&a[x+1][y]==0){
            a[x][y]=++k;
            ++x;
        }
        while(y<n-1&&a[x][y+1]==0){
            a[x][y]=++k;
            ++y;
        }
        while(x>0&&a[x-1][y]==0){
            a[x][y]=++k;
            --x;
        }
        while(y>0&&a[x][y-1]==0){
            a[x][y]=++k;
            --y;
        }
    }
    for(int i=0;i<n;++i){
        for(int j=0;j<n;++j){
            if(a[j][i]<10)printf(" ");
            printf(" %d",a[j][i]);
        }
        printf("\n");
    }
    return 0;
}