#include <stdio.h>

int main() {
    char i, j;
    printf("First:");
    scanf("%c", &i);
    getchar();
    switch (i) {
    case 'm':
        printf("monday");
        break;
    case 'w':
        printf("wednesday");
        break;
    case 'f':
        printf("friday");
        break;
    case 't':
        printf("Second:");
        scanf("%c",&j);
        if (j == 'u')
        {
            /* code */
            printf("tuesday");
            break;
        }else if (j == 'h')
        {
            /* code */
            printf("thursday");
        }
        printf("ERROR");
        break;
    case 's':
        printf("saturday/sunday");
        break;
    default:
        printf("ERROR");
        break;
    }
}