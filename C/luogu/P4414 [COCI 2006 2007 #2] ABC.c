#include <stdio.h>

int main() {
    int a, b, c, t;
    char ABC[4];
    scanf("%d %d %d %s",&a,&b,&c,ABC);
    if (a > b) {
        t = a;
        a = b;
        b = t;
    }
    if (c < b) {
        t = c;
        c = b;
        b = t;
    }
    if (a > b) {
        t = a;
        a = b;
        b = t;
    }
    for (size_t i = 0; i < 3; i++) {
        if (i) printf(" "); 
        if (ABC[i] == 'A') {
            /* code */
            printf("%d", a);
        }
        if (ABC[i] == 'B') {
            /* code */
            printf("%d", b);
        }
        if (ABC[i] == 'C') {
            /* code */
            printf("%d", c);
        }
    }
    return 0;
}