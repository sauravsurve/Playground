#include <stdio.h>
int main() {
	//Type your code
  int num,first_digit,last_digit;
  scanf("%d",&num);
  last_digit=num%10;
  while(num>10)
  {
    num /= 10;
  }
  first_digit=num;
  int sum=first_digit+last_digit;
  printf("%d",sum);
	return 0;
}