#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() {
    int n;
    scanf("%d", &n);
    int num[n];
    for (size_t i = 0; i < n; i++)
        scanf("%d", &num[i]);
    int last[n];
    memset(last, 0, sizeof(last));
    for (size_t i = 0; i < n - 1; i++)
        last[i] = abs(num[i + 1] - num[i]);
    for (size_t i = 1; i < n - 1; i++) {
        int j = i - 1;
        int key = last[i];
        while ((j >= 0) && (last[j] > key)) {
            last[j + 1] = last[j];
            j--;
        }
        last[j + 1] = key;
    }

    for (size_t i = 1; i < n; i++) {
        if (last[i - 1] != i) {
            printf("Not jolly");
            return 0;
        }
    }
    printf("Jolly");
    return 0;
}