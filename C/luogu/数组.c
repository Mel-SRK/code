#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int bits[n];
    for (size_t i = 0; i < n; i++) {
        scanf("%d", &bits[i]);
    }
    if (bits[n - 1] == 0 && bits[n - 2] != 1) {
        printf("True");
    } else {
        printf("False");
    }

    return 0;
}