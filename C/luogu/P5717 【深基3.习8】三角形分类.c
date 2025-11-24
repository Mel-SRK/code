#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    if (a + b <= c || a + c <= b || b + c <= a) {
        printf("Not triangle\n");
        return 0;
    }

    if (a > b) {
        int t = a; a = b; b = t;
    }
    if (b > c) {
        int t = b; b = c; c = t;
    }
    if (a > b) {
        int t = a; a = b; b = t;
    }

    if (a * a + b * b == c * c) {
        printf("Right triangle\n");
    } else if (a * a + b * b > c * c) {
        printf("Acute triangle\n");
    } else {
        printf("Obtuse triangle\n");
    }

    if (a == b || b == c) {
        printf("Isosceles triangle\n");
    }
    if (a == b && b == c) {
        printf("Equilateral triangle\n");
    }

    return 0;
}