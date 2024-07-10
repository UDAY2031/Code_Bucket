#include <stdio.h>
#include <string.h>

#define N strlen(g)

char t[28], cs[28], g[] = "10001000000100001";
int a, i, j;

void xor() {
    for (i = 1; i < N; i++)
        cs[i] = (cs[i] == g[i]) ? '0' : '1';
}

void crc() {
    for (j = 0; j < N; j++)
        cs[j] = t[j];
    do {
        if (cs[0] == '1')
            xor();
        for (i = 0; i < N - 1; i++)
            cs[i] = cs[i + 1];
        cs[i] = t[j++];
    } while (j <= a + N - 1);
}

int main() {
    printf("\nEnter data: ");
    scanf("%s", t);
    printf("\n----------------------------------------");
    printf("\nGenerating polynomial: %s", g);
    a = strlen(t);
    for (j = a; j < a + N - 1; j++)
        t[j] = '0';
    printf("\n----------------------------------------");
    printf("\nModified data is: %s", t);
    printf("\n----------------------------------------");
    crc();
    printf("\nCRC checksum is: %s", cs);
    for (j = a; j < a + N - 1; j++)
        t[j] = cs[j - a];
    printf("\n----------------------------------------");
    printf("\nFinal codeword transmitted is: %s", t);
    printf("\n----------------------------------------");
    printf("\nTest error detection 0(yes) 1(no)? : ");
    scanf("%d", &j);
    if (j == 0) {
        do {
            printf("\nEnter the position where error is to be inserted: ");
            scanf("%d", &j);
        } while (j == 0 || j > a + N - 1);
        t[j - 1] = (t[j - 1] == '0') ? '1' : '0';
        printf("\n----------------------------------------");
        printf("\nErroneous data: %s\n", t);
    }
    crc();
    for (j = 0; (j < N - 1) && (cs[j] != '1'); j++);
    if (j < N - 1) {
        printf("\nCRC checksum is: %s", cs);
        printf("\nError detected\n\n");
    } else {
        printf("\nCRC checksum is: %s", cs);
        printf("\nNo error detected\n\n");
    }
    printf("\n----------------------------------------\n");
    return 0;
}
