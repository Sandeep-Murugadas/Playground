#include <stdio.h>
int main() {
  int n,r=0;
  scanf("%d",&n);
  while(n>9)
  {
    r=n%10;
    n/=10;
  }
  printf("%d",r);
	//Type your code
	return 0;
}