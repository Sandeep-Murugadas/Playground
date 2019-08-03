#include<stdio.h>
int main()
{
  int a,b,gcd,min,lcm,i;
  scanf("%d %d",&a,&b);
  //min = (a<=b)?a:b;
  if(a<=b)
    min=a;
  else
    min=b;
  for(i=1;i<=min;i++)
  {
    if((a%i == 0)&&(b%i == 0))
    {
      gcd = i;
    }
  }
  lcm = (a*b)/gcd;
  printf("%d",lcm);
  //Type your code here
  return 0;
}