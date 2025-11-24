#include <stdio.h>

int main() {
    int x, n;
    scanf("%d %d", &x, &n);

    int sum = 0;
    int day = x;

    for (int i = 0; i < n; i++) {
        if (day != 6 && day != 7) {
            sum += 250;
        }
        day++;
        if (day > 7) day = 1;
    }
    
    printf("%d", sum);
    return 0;
}
