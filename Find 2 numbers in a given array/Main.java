#include<stdio.h>
int main()
{
  int n,m[20],i,j,a,b,f1=0,f2=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&m[i]);
  scanf("%d%d",&a,&b);
  for(i=0;i<n;i++)
    if(m[i]==a)
    {
      f1=1;
      break;
    }
  for(j=0;j<n;j++)
    if(m[j]==b)
    {
      f2=1;
      break;
    }
  if(f1==1)
    printf("Element 1 index = %d\n",i);
  else
    printf("Element 1 index = -1\n");
    if(f2==1)
    printf("Element 2 index = %d\n",j);
  else
    printf("Element 2 index = -1\n");
  	//type your code here
}