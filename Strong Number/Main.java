#include <stdio.h>
int main() {
	int num,fact_sum,temp,r;
  scanf("%d",&num);
  temp=num;
  while(temp>0)
  {
    r=temp % 10;
    int fact=1;
    for (int i=1;i<=r;i++)
    {
      fact *= i;
    }
   fact_sum += fact;
   temp /=10;
  }
  
  if(fact_sum==num)
    printf("Yes");
  else
    printf("No");
	return 0;
}