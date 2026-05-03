#include <stdio.h>

int A(int x){
    int a = (x % 2 == 0);
    int b = (x > 4 && x <= 12);
    return a && b;
}

int U(int x){
    int a = (x % 2 == 0);
    int b = (x > 4 && x <= 12);
    return a || b;
}

int B(int x){
    int a = (x % 2 == 0);
    int b = (x > 4 && x <= 12);
    return a ^ b;
}

int Z(int x){
    int a = (x % 2 == 0);
    int b = (x > 4 && x <= 12);
    return !a && !b;
}

int main() {
    int x;
    scanf("%d", &x);
    printf("%d %d %d %d", A(x), U(x), B(x), Z(x));
    return 0;
}