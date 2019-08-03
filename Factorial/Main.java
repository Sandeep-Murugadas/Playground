#include<stdio.h>
int main()
{
  long int n,f=1;
  scanf("%ld",&n);
  while(n!=0)
  {
    f*=n;
    n--;
  }
  printf("%ld",f);
	//your code here
}