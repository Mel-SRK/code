#include <stdio.h>
#include <string.h>
int main() {
    char input[100];
    printf("输入一段字符：");
    scanf("%99s", input);
    int c;
    while((c = getchar())!= '\n'&&c!=EOF)
    printf("你要删除的字母:");
    char d = getchar();
    int i, j;
    int len = strlen(input);
    //使用一般方法
    // for (i = 0; i < len; i++) {
    //     /* code */
    //     if (input[i] == d) {
    //         for (j = i; j < len-1; j++) {
    //             /* code */
    //             input[j] = input[j + 1];
    //         }
    //         input[len-1]='\0';
    //         len--;
    //         i--;
    //     }
    // }
    //使用双指针
    j = 0;
    for ( i = 0; input[i]!='\0'; i++)
    {
        /* code */
        if (input[i]!=d)
        {
            /* code */
            input[j]=input[i];
            j++;
        }
        
    }
    input[j]='\0';
    printf("%s\n",input);
    return 0;
}