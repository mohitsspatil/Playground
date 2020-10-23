#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,z;
  cin>>n;
  z=n;
  while (n>0)
  {
    sum=sum+n%10;
    n=n/10;
  }
  if (z%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}
