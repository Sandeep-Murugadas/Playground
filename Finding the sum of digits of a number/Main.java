#include <stdio.h>
int main() {
  int n,sum=0,r=0;
  scanf("%d",&n);
  while(n!=0)
  {
    r=n%10;
    sum+=r;
    n/=10;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}