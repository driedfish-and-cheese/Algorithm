#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
	int h;
	int m;
	scanf("%d %d", &h ,&m);
	if (h == 0)
	{
		if (m >= 45)
		{
			printf("%d %d", h, m - 45);
		}
		else if (m < 45)
		{
			printf("%d %d", 23 , 60 - (45 - m));
		}
	}
	else if (h > 0)
	{
		if (m >= 45)
		{
			printf("%d %d", h, m - 45);
		}
		else if (m < 45)
		{
			printf("%d %d", h - 1, 60 - (45 - m));
		}
	}
	
	return 0;
}