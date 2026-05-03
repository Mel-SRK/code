#include <stdio.h>
#include <string.h>

char s[1005];

void reverse_range(int l, int r) {
    while (l < r) {
        char t = s[l];
        s[l] = s[r];
        s[r] = t;
        l++;
        r--;
    }
}
void remove_leading_zeros(int l, int r) {
    int i = l;
    while (i < r && s[i] == '0')
        i++;
    if (i == r) {
        s[l] = '0';
        s[l + 1] = '\0';
    } else {
        int len = r - i + 1;
        for (size_t j = 0; j < len; j++) {
            s[l + j] = s[i + j];
        }
        s[l + len] = '\0';
    }
}

void remove_trailing_zeros(int l, int r) {
    if (l > r) {
        s[l] = '\0';
        return;
    }
    while (r >= l && s[r] == '0')
        r--;
    s[r + 1] = '\0';
}
int main() {
    scanf("%s", s);
    int n = strlen(s);

    if (s[n-1] == '%') {
        // 百分数：只反转数字部分
        reverse(0, n - 2);
        // 去除前导零（除非整个是0%）
        if (n > 2) { // 至少有一个数字
            int start = 0;
            while (start < n-2 && s[start] == '0') start++;
            if (start == n-2) { // 原来是 0%
                printf("0%%\n");
            } else {
                for (int i = start; i < n-1; i++) {
                    putchar(s[i]);
                }
                putchar('%');
                putchar('\n');
            }
        } else {
            printf("0%%\n");
        }
    }
    else if (strchr(s, '.')) {
        // 小数
        int dot = strchr(s, '.') - s;
        reverse(0, dot - 1);           // 整数部分反转
        reverse(dot + 1, n - 1);       // 小数部分反转

        // 处理整数部分前导零
        int int_start = 0;
        while (int_start < dot && s[int_start] == '0') int_start++;
        if (int_start == dot) { // 整数部分全是0
            s[0] = '0';
            memmove(s + 1, s + dot, n - dot + 1); // 保留 . 和小数部分
            dot = 1;
            n = strlen(s);
        } else {
            memmove(s, s + int_start, n - int_start + 1);
            dot -= int_start;
            n -= int_start;
        }

        // 处理小数部分末尾零
        int frac_end = n - 1;
        while (frac_end > dot + 1 && s[frac_end] == '0') frac_end--;
        s[frac_end + 1] = '\0';

        // 如果小数部分被删光了，至少保留一个0
        if (frac_end == dot) {
            s[dot + 1] = '0';
            s[dot + 2] = '\0';
        }

        printf("%s\n", s);
    }
    else if (strchr(s, '/')) {
        // 分数
        int slash = strchr(s, '/') - s;
        reverse(0, slash - 1);
        reverse(slash + 1, n - 1);

        // 分别去除分子和分母的前导零
        int num_start = 0;
        while (num_start < slash && s[num_start] == '0') num_start++;
        if (num_start == slash) {
            s[0] = '0';
            memmove(s + 1, s + slash, n - slash + 1);
            slash = 1;
            n = strlen(s);
        } else {
            memmove(s, s + num_start, n - num_start + 1);
            slash -= num_start;
            n -= num_start;
        }

        int den_start = slash + 1;
        int den_end = n - 1;
        while (den_start <= den_end && s[den_start] == '0') den_start++;
        if (den_start > den_end) {
            // 分母变成0了（理论上不会发生，数据保证不为0）
            // 但为了安全
        } else {
            memmove(s + slash + 1, s + den_start, n - den_start + 1);
        }

        printf("%s\n", s);
    }
    else {
        // 纯整数
        reverse(0, n - 1);
        int start = 0;
        while (start < n - 1 && s[start] == '0') start++; // 保留最后一个0
        printf("%s\n", s + start);
    }

    return 0;
}