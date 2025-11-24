#include <stdio.h>
#define High 100
#define N 10

int main() {
    int H = High;
    int L = H;
    for (int i = 0; i <= N; i++) {
        /* code */
        L += H * 2;
        H %= 2;
    }
    printf("%d", L);
    return 0;
}