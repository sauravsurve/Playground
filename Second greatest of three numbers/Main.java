#include <stdio.h>

int main()
{ 
    // type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if(a>=b)
  {
    if(b>=c && a>=c)
      printf("%d",b);
    else if(b<=c && a>=c)
      printf("%d",c);
    else
      printf("%d",a);
  }
  else 
  {
    if(a>=c && b>=c)
      printf("%d",a);
    else if(a<=c && c<=b)
      printf("%d",c);
    else
      printf("%d",b);
  }
  return 0;
}