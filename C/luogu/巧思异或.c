#include <math.h>
#include <stdio.h>

int main() {
    long long n, t;
    double a;
    long long ans = 0;
    long long x;

    scanf("%lld", &n);

    for (long long i = 1; i <= n; i++) {
        scanf("%lf%lld", &a, &t);
        for (long long j = 1; j <= t; j++) {
            x = (long long)floor(j * a);
            ans ^= x;
        }
    }
    printf("%lld", ans);
    return 0;
}