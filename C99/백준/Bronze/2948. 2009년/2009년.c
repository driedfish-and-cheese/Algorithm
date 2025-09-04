#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int year[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };
	int m;
	int d;
	int sum=0;
	scanf("%d %d", &d,&m);
	for (int i = 0; i < m-1; i++)
	{
		sum += year[i];
	}
	sum += d;
	switch (sum % 7)
	{
		case 4:
			printf("Sunday\n");
			break;
		case 5:
			printf("Monday\n");
			break;
		case 6:
			printf("Tuesday\n");
			break;
		case 0:
			printf("Wednesday\n");
			break;
		case 1:
			printf("Thursday\n");
			break;
		case 2:
			printf("Friday\n");
			break;
		case 3:
			printf("Saturday\n");
			break;

	}

	return 0;

}