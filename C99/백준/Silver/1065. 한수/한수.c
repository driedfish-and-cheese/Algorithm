#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


int main(void)
{
	int n;
	int c = 0;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		if (i <100 || 2*((i % 100)/10) == i/100 + (i%10))
		{
			c++;
		}
	}
	printf("%d", c);
}


	

