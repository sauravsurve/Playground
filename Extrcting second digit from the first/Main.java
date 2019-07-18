#include <stdio.h>
int main() {
	//Type your code
  int num,m,r;
  scanf("%d",&num);
  m=num;
  while(m>100)
  {
    m /= 10;
  }
  int x=m%10;
  printf("%d",x);
	return 0;
}