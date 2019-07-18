#include <stdio.h>
int power(int b,int e)
{
  int x=1;
  for(int i =0;i<e;i++)
    x *= b;
  return x;  
}
int main()
{
  	//Your code here  
  int v,t;
  scanf("%d%d",&v,&t);
  if(t<0)
    printf("Wrong input");
  else
  {
    int d=power(v,t);
    printf("%d",d);
  }
    return 0;
}