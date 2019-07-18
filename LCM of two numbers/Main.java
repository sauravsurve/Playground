#include<iostream>
using namespace std;
int main()
{ int a ,b;
 cin>>a>>b;
 if(b%a==0)
 { cout<<b;}
 else if(a%b==0)
   cout<<a;
 else
   cout<<a*b;
 
  //Type your code here
  return 0;
}