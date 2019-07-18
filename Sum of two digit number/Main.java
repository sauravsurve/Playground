#include<stdio.h>
int main()
{
  //Type your code here
  int num,f,l;
  scanf("%d",&num);
  f=num%10;
  l=num/10;
  int s=f+l;
  printf("%d",s);
  return 0;
}