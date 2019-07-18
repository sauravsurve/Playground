#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
	float a,b,h;
  scanf("%f%f",&a,&b);
  h=pow(pow(a,2)+pow(b,2),0.5);
  printf("%.2f",h);
  return 0;
}