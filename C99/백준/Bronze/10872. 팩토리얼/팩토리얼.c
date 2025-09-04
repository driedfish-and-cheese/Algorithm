#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int fac(int n);

int main(void)
{
	int n;
	scanf("%d", &n);
	printf("%d", fac(n));

	return 0;
}

int fac(int n)
{
	if (n <= 1)
	{
		return 1;
	}
	else
	{
		return (n*fac(n-1));
	}
	
}