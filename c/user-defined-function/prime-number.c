#include <stdio.h>

int count_factor(int n);    // function declaration/prototype

int main(void)
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (count_factor(n) == 2)               // function call
        printf("Prime Number!\n");
    else
        printf("Not a Prime Number!\n");

    return 0;
}

int count_factor(int n) // function definition
{
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
            count++;
    }
    return count;
}