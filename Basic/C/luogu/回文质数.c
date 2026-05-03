#include <stdio.h>

int is_prime(int n) {
    if (n < 2)
        return 0;
    if (n % 2 == 0)
        return n == 2;
    for (int i = 3; (long long)i * i <= n; i += 2)
        if (n % i == 0)
            return 0;
    return 1;
}

int main() {
    int a, b;
    scanf("%d %d", &a, &b);

    // 1 位
    for (int i = 2; i <= 9; i++)
        if (i >= a && i <= b && is_prime(i))
            printf("%d\n", i);

    // 2 位
    if (11 >= a && 11 <= b)
        printf("11\n");

    // 3 位
    for (int d1 = 1; d1 <= 9; d1 += 2)
        for (int d2 = 0; d2 <= 9; d2++) {
            int num = 100 * d1 + 10 * d2 + d1;
            if (num > b) break;
            if (num >= a && is_prime(num))
                printf("%d\n", num);
        }

    // 5 位
    for (int d1 = 1; d1 <= 9; d1 += 2)
        for (int d2 = 0; d2 <= 9; d2++)
            for (int d3 = 0; d3 <= 9; d3++) {
                int num = d1 * 10000 + d2 * 1000 + d3 * 100 + d2 * 10 + d1;
                if (num > b) break;
                if (num >= a && is_prime(num))
                    printf("%d\n", num);
            }

    // 7 位
    for (int d1 = 1; d1 <= 9; d1 += 2)
        for (int d2 = 0; d2 <= 9; d2++)
            for (int d3 = 0; d3 <= 9; d3++)
                for (int d4 = 0; d4 <= 9; d4++) {
                    int num = d1 * 1000000 + d2 * 100000 + d3 * 10000 +
                              d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                    if (num > b) break;
                    if (num >= a && is_prime(num))
                        printf("%d\n", num);
                }

    return 0;
}
