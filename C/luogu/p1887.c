#include <stdio.h>

int main() {
    long long n;
    int m;
    scanf("%lld %d", &n, &m);

    long long t = n / m;
    int a = n % m;

    int small = m - a;

    for (int i = 0; i < small; i++) {
        printf("%lld", t);
        if (i != m - 1) printf(" ");
    }

    for (int i = 0; i < a; i++) {
        printf("%s%lld", " ", t + 1);
    }

    printf("\n");
    return 0;
}