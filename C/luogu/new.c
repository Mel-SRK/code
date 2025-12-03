#include <stdio.h>
#include <string.h>
#define MAX(a, b) a > b ? a : b
#define MIN(a, b) a > b ? b : a
char a[1000], b[1000], c[1000][1000];

char mul(char *str1, char *str2) {
    int max = MAX(strlen(str1), strlen(str2));
    int min = MIN(strlen(str1), strlen(str2));
    for (size_t i = 0; i < min; i++) {
        for (size_t j = 0; j < max; j++) {
            c[i][j] = a[i] * b[j];
        }
    }
    memset(a,0,1000);
    for (size_t i = 0; i < max; i++) {
        for (size_t j = 0; j < min; j++) {
            for (size_t k = 0; k < min; k++) {
                a[i] += c[j][k];
            }
        }
    }
}

int main() {
    char n;
    scanf("%s", &n);
    mul(&n, &n);
    printf("%s",a);
    return 0;
}