#include <stdio.h>
#include <string.h>

char s[500];
char last[500];
char num[26];
char temp[150];
int main() {
    for (size_t i = 0; i < 4; i++) {
        fgets(temp, sizeof(temp), stdin);
        strcat(s, temp);
    }
    int n = 0;
    for (size_t i = 0; i < strlen(s); i++) {
        if (s[i] >= 'A' && s[i <= 'Z']) {
            last[n] = s[i];
            n++;
        }
    }
    for (size_t i = 0; i < strlen(last); i++) {
        for (size_t j = 0; j < 26; j++) {
            if (last[i] - 65 == j) {
                num[j]++;
            }
        }
    }
    int max = 0;
    for (size_t i = 0; i < 26; i++) {
        if (num[i] > max) {
            max = num[i];
        }
    }
    for (size_t i = max; i > 0; i--) {
        for (size_t j = 0; j < 26; j++) {
            if (num[j] >= i) {
                printf("*");
            } else {
                printf(" ");
            }
            if (j < 25)
                printf(" ");
        }
        printf("\n");
    }
    for (size_t i = 0; i < 26; i++) {
        printf("%c", 65 + i);
        if (i < 25)
            printf(" ");
    }
}