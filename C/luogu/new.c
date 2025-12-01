#include <stdio.h>

char num[500];
int k;
void jian(int a) {
    num[0] -= a;
    for (size_t i = 0; i < k; i++) {
        while (num[i] < 0) {
            num[i + 1]--;
            num[i] += 10;
        }
    }
    while (num[k + 1] == 0) {
        k--;
        num[k] = '\0';
    }
}

int chen(int a){
    for (size_t i = 0; i < k; i++)
    {
        printf(" ");
    }
    
}

int main() {
    int n;
    scanf("%d", &n);
    while (n > 0) {
        num[k++] = n % 10;
        n /= 10;
    }
    // for (size_t i = 0; i < k; i++) {
    //     /* code */
    // }
    jian(1);
    for (size_t i = 0; i < k; i++)
    {
        printf("%d",num[i]);
    }
    
    return 0;
}