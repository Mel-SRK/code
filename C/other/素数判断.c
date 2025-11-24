#include <stdio.h>
// Q:101到200之间的所有素数
// 素数：不能被任何数整除
int main() {
    int i, j;
    for (i = 101; i < 200; i++) {
        for (j = 2; j < i; j++) {
            if (i % j == 0) {
                /* code */
                break;
            }
        }
        if (j >= i) {
            /* code */
            printf("%d,", i);
        }
    }
    return 0;
}