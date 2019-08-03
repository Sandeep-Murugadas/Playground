#include<stdio.h>
int main()
{
  int d;
  float r = 0, area = 0;
  scanf("%d",&d);
  r = (float)d/2;
  area = (3.14)*r*r;
  printf("%.2f",area);
  //Type your code here
  return 0;
}