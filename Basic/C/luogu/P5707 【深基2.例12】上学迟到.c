#include <stdio.h>

int main() {
    int s, v;
    scanf("%d %d", &s, &v);

    int walk = (s + v - 1) / v;
    int NeedTime = walk + 10;

    int total = 8 * 60 - NeedTime;

    if (total < 0)
        total += 24 * 60;

    int HH = total / 60;
    int MM = total % 60;

    printf("%02d:%02d\n", HH, MM);
    return 0;
}
