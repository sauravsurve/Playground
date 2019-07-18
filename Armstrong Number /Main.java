#include <stdio.h>
int main() {
	//Type your code
  int num,m,num_digits=0,i,sum=0,r;
  scanf("%d",&num);
  m=num;
  while(m>0)
  {
    m /= 10;
    num_digits += 1;
  }
  m=num;
  while(m>0)
  {
    r=m%10;
    int x=1;
    i=num_digits;
    while(i>0){
      x=r*x;
	i--;
  }
    sum+=x;
    m /= 10;
  }
  if(sum== num)
    printf("Armstrong Number");
    else
      printf("Not an Armstrong Number");
	return 0;
}