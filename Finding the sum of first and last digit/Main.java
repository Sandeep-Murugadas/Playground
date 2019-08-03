#include <stdio.h>
int main() {
  int n,f=0,l=0,sum=0,r=0;
  scanf("%d",&n);
  l=n%10;
  while(n>9)
  {
    n/=10;
    f=n;
  }
  sum=f+l;
  printf("%d",sum);
	//Type your code
	return 0;
}