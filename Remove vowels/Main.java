#include<stdio.h>
int main()
{
  int i;
  char str[100];
  //scanf("%s[^\n]",&str);
  gets(str);
  for(i=0;str[i]!='\0';i++)
  {
    //printf("%c",str[i]);
    if((str[i]=='a')||(str[i]=='e')||(str[i]=='i')||(str[i]=='o')||(str[i]=='u')||
      (str[i]=='A')||(str[i]=='E')||(str[i]=='I')||(str[i]=='O')||(str[i]=='U'))
      continue;
    else
      printf("%c",str[i]);
  }
  //Type your code here
  
  return 0;
}