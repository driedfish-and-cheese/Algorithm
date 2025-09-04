#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

unsigned long long route(unsigned long long n);
int main(void)
{
	unsigned long long n;
	scanf("%llu", &n);
	unsigned long long  num = route(n);
	for (int i = num; i > 0; i--)
	{
		printf("%d", n>>(i-1)&1);
	}
	
	return 0;
}

unsigned long long route(unsigned long long n)
{
	if (n / 2 == 0)
	{
		return 1;
	}
	else
	{
		
		return (route(n/ 2)+1);
	}

}
