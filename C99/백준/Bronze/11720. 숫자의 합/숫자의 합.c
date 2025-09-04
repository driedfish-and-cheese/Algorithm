#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


int main(void)
{
	int a[100];
	int c;
	int b = 0;
	scanf("%d", &c);
	for (int i = 0; i < c; i++)
	{
		scanf("%1d", &a[i]);
		b += a[i];
	}
	printf("%d", b);
}


	

