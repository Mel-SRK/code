#include <stdio.h>
#include <string.h>

char txt[1005];

int main() {
    int q;
    scanf("%d", &q);
    scanf("%s", txt);

    for (int i = 0; i < q; i++) {
        int op;
        scanf("%d", &op);

        if (op == 1) {
            char s[105];
            scanf("%s", s);
            strcat(txt, s);
            printf("%s\n", txt);

        } else if (op == 2) {
            int a, b;
            scanf("%d%d", &a, &b);
            memmove(txt, txt + a, b);
            txt[b] = '\0';
            printf("%s\n", txt);

        } else if (op == 3) {
            int pos;
            char s[105];
            scanf("%d%s", &pos, s);
            int len = strlen(txt);
            int slen = strlen(s);

            memmove(txt + pos + slen, txt + pos, len - pos + 1);
            memcpy(txt + pos, s, slen);
            printf("%s\n", txt);

        } else if (op == 4) {
            char s[105];
            scanf("%s", s);
            char *p = strstr(txt, s);
            if (p == NULL) {
                printf("-1\n");
            } else {
                printf("%d\n", (int)(p - txt));
            }
        }
    }
    return 0;
}