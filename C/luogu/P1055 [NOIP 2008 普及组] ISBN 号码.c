#include<stdio.h>

int main(){
    char s[20];
    scanf("%s", s);

    int sum = 0;
    int p = 1;

    for (int i = 0; s[i]; i++) {
        if (s[i] >= '0' && s[i] <= '9') {
            sum += (s[i] - '0') * p;
            p++;
        }
        if (p > 9) break; 
    }
    int correct = sum % 11;

    char check_char;
    if (correct == 10) check_char = 'X';
    else check_char = correct + '0';

    int last = 0;
    while (s[last]) last++;
    char original = s[last - 1];

    if (original == check_char) {
        printf("Right");
    } else {
        s[last - 1] = check_char;
        printf("%s", s);
    }
    return 0;
}