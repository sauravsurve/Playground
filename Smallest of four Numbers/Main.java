#include<stdio.h>
int main()
{
  int a[4],i,min;
  for (i=0;i<4;i++)
    scanf("%d",&a[i]);
  min=a[0];
  for (i=1;i<4;i++)
    if(a[i]<=min)
      min=a[i];
  printf("%d",min);
}