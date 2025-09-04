#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main(void)
{
	int n;
	int k;
	int y = 0;
	scanf("%d", &n);
	getchar();
	char str[100];
	for (int i = 0; i < n; i++)
	{
		gets(str);
		k = strlen(str);
		for (int i = 0; i < k ; i++)
		{
			if (str[i] >= 'A' && str[i] <='Z')
			{
				str[i]=str[i] + 32;
			}
			if (str[i] != str[k-1 - i])
			{
				y++;
				
				break;
			}
		}
		if (y > 0)
		{
			printf("No\n");
		}
		else
		{
			printf("Yes\n");
		}
		y = 0;
		
	}



	return 0;
}