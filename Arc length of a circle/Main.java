#include<stdio.h>                                                                
                                                                                
int main()
{
    float radius, central_angle,length;
    scanf("%f", &radius);
    scanf("%f", &central_angle);
    length = 2*3.14*radius*(central_angle/360);
    printf("%.2f", length);
    return 0;
}                                                                      
                                    