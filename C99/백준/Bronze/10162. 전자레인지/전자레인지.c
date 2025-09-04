#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int a[3] = { 300,60,10 };
	int t;
	int cnt[3] = { 0 };
	scanf("%d", &t);
	if (t % 10 == 0)
	{
		for (int i = 0; i < 3; i++)
		{
			while (t >= a[i])
			{
				cnt[i] = t / a[i];
				t %= a[i];
			}
		}
		for (int i = 0; i < 3; i++)
		{
			printf("%d ", cnt[i]);
		}
	}
	else
	{
		printf("-1");
	}

	return 0;
}