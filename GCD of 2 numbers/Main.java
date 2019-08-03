// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b,i,gcd=1;
  scanf("%d\n%d",&a,&b);
  if(a<=b)
  {
    for(i=2;i<=a;i++)
    {
      if((a%i == 0)&&(b%i == 0))
        gcd=i;
    }
  }
  else
    if(b<=a)
  {
    for(i=2;i<=b;i++)
    {
      if((a%i == 0)&&(b%i == 0))
        gcd=i;
    }
  }
  printf("%d",gcd);
  // Enter your code here 
  
   return 0;
}