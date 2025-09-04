#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int nonselfnumber(int i);
int main(void)
{
	int a[10001];
	int cs;
	for (int i = 0; i < 10001; i++)
	{
		cs = nonselfnumber(i);
		if (cs < 10000)
		{
			a[cs] = 1;
		}
	}
	for (int j = 0; j < 10000; j++)
	{
		if (a[j] != 1)
		{
			printf("%d\n",j );
		}
	}
	
}

int nonselfnumber(int i)
{
	int k;
	k=i + i/10000 + (i%10000)/ 1000 + (i % 1000) / 100 + (i % 100) / 10 + (i % 10);
    return k;
	
}

