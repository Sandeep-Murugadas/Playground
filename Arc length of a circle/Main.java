#include <stdio.h>
int main()
{
  float r,a,l=0;
  scanf("%f %f",&r,&a);
  l=(a/360)*2*r*(3.14);
  printf("%.2f",l);
}