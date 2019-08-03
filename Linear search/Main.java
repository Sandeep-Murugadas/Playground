#include<stdio.h>
int main()
{
  int n,a[20],i,e,flag=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&e);
  for(i=1;i<=n;i++)
    if(e==a[i])
    {
      flag=1;
      break;
    }
  if(flag==1)
    printf("%d",i+1);
  else
    printf("%d isn't present in the array.",e);
  //Type your code here
  return 0;
}