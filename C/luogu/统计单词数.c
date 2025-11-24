#include <ctype.h>
#include <stdio.h>
#include <string.h>
int main() {
    char word[11];
    char doc[1000010];
    scanf("%s", word);
    getchar();
    fgets(doc, sizeof(doc), stdin);
    int w_len = strlen(word), d_len = strlen(doc);
    int n = 0, first=0;
    for (size_t i = 0; i < w_len; i++) {
        word[i] = tolower(word[i]);
    }
    for (size_t i = 0; i < d_len; i++) {
        if (isalpha(doc[i]) && (i == 0 || doc[i - 1] == ' ')) {
            int match = 1;
            for (size_t j = 0; j < w_len; j++) {
                if (i + j >= d_len || tolower(doc[i + j]) != word[j]) {
                    match = 0;
                    break;
                }
            }
            if (match&&(i+w_len==d_len||doc[i+w_len]==' ')) {
                n++;
                if (n == 1) {
                    first = i;
                }
            }
        }
    }

    if (n == 0) {
        printf("-1\n");
    } else {
        printf("%d %d\n", n, first);
    }
    return 0;
}