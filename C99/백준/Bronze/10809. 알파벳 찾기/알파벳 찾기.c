#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	char s[100];
	char alp[30];
	int k;
	scanf("%s", &s);
	for(int i=0;i<26;i++)
	{
		alp[i] = -1;
	}
	for (int i = 0; i < strlen(s); i++)
	{
		k = s[i] - 97;
		if (alp[k] == -1)
		{
			alp[k] = i;

		}
	}
	for (int i = 0; i < 26; i++)
	{
		printf("%d ", alp[i]);
	}

	return 0;
}