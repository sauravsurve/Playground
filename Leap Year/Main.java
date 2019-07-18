#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  if((num%400==0) && (num%100==0))
    printf("LEAP YEAR");
  else if(num%4==0 && num%100!=0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  return 0;
}