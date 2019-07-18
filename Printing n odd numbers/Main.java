#include <stdio.h>
int main() {
	//Type your code
  int n,i,s=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d\n",s);
    s += 2;
  }
  
	return 0;
}