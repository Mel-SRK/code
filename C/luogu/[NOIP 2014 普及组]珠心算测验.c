#include <stdio.h>
#include <stdlib.h>
int cmp(const void *a, const void *b) { return *(int *)a - *(int *)b; }
int main() {
    int n;
    scanf("%d", &n);
    int num[n];
    for (size_t i = 0; i < n; i++) {
        scanf("%d", &num[i]);
    }
    qsort(num, n, sizeof(int), cmp);
    int sum = 0;
    for (int k = 0; k < n; k++)
    {
        int i=0,j=k-1;
        while (i<j)
        {
            if (num[k]==num[i]+num[j])
            {
                sum++;
                break;
            }else if (num[k]>num[i]+num[j])
            {
                i++;
            }else{
                j--;
            }
            
            
        }
        
    }
    
    printf("%d", sum);
    return 0;
}
