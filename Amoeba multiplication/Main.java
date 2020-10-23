#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x=0,y=1,i,z;
  cin>>n;
  if (n==1)
  {
    z=0;
    cout<<z;
  }
  if (n==2)
  {
    z=1;
    cout<<z;
  }
  if (n>2)
  {
    for (i=3;i<=n;i++)
    {
      z=x+y;
      x=y;
      y=z;
    }
  }
    cout<<z;
  
}