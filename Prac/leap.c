#include <stdio.h>

int main()
{
    int count = 0;
    int year = 2022;

    while (count < 15) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            printf("%d\n", year);
            count++;
        }
        year++;
    }
    return 0;
}
