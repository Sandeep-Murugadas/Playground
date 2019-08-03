#include<stdio.h>

int main()
{
  char a[50];
  int i,w=1;
  gets(a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
      w++;
  }
  printf("%d",w);
  //Type your code here
  
}