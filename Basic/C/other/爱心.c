#include <math.h>
#include <stdio.h>
#include <string.h>
int main() {
    double x, y;
    char txt[100];
    strcpy(txt, "love");
    for (y = 1.5; y >= -1.1; y-=0.05) {
        for (x = -2.1; x <= 2.1; x+=0.05) {
            double equation = pow(x * x + y * y - 1, 3) - x * x * y * y * y;
            if (equation <= 0.0) {
                printf("😘");
            } else {
                printf("  ");
            }
        }
        printf("\n");
        
    }
    return 0;
}
