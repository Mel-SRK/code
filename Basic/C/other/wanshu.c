#include <stdio.h>

int main() {
    int a, sum = 0;
    scanf("%d", &a);
    for (int i = 1; i < a; i++) {
        /* code */
        if (a % i == 0) {
            /* code */
            sum += i;
        }
    }
    if (sum == a) {
        /* code */
        printf("Y");
    }
    printf("N");
    return 0;
}