#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,r1,r2;
  scanf("%f %f %f",&a,&b,&c);
  float check=pow(b,2)-4*a*c;
  if(check>=0)
  {
    r1=-(b+sqrt(pow(b,2)-4*a*c))/(2*a);
    r2=(-(b)+(sqrt(pow(b,2)-4*a*c)))/(2*a);
    printf("root1 = %.2f  ",r2);
  printf("root2 = %.2f",r1);

  }
  else
  {
    r1=(-(b)/(2*a));
    float i1;
    i1=(sqrt(-(pow(b,2)-4*a*c))/(2*a));
    printf("root1 = %.2f + %.2fi  ",r1,i1);
    printf("root2 = %.2f - %.2fi",r1,i1);
  }
 return 0;
  
}