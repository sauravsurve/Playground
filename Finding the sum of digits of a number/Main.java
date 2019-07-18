#include <stdio.h>
int main() {
	//Type your code
  int num,m,r,sum=0;
  scanf("%d",&num);
  m=num;
  while(m>0)
  {
    r=m%10;
    sum += r;
    m /= 10;
  }
  printf("%d",sum);
  return 0;
}