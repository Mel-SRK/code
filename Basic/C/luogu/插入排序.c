#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int num[n];
    for (size_t i = 0; i < n; i++)
        scanf("%d", &num[i]);
    for (size_t i = 1; i < n; i++) {
        int j = i - 1;
        int key = num[i];
        while ((j >= 0) && (num[j] > key)) {
            num[j + 1] = num[j];
            j--;
        }
        num[j + 1] = key;
    }
    for (size_t i = 0; i < n; i++) {
        printf("%d", num[i]);
    }

    return 0;
}