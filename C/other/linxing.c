#include <stdio.h>

int main() {
    for (int n = 0; n <= 11; n++) {
        for (int a = 11; a > n; a--) {
            /* code */
            printf(" ");
        }
        for (int b = 1; b < n; b++) {
            /* code */
            printf("* ");
        }
        printf("\n");
    }
    for (int n = 11; n > 0; n--) {
        for (int a = 11; a > n; a--) {
            /* code */
            printf(" ");
        }
        for (int b = 1; b < n; b++) {
            /* code */
            printf(" *");
        }
        printf("\n");
    }
    return 0;
}