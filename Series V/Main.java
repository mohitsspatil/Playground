#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,ser;
  cin>>n;
  ser=11*11;
  for (i=1;i<=n;i++)
  {
    cout<<ser<<" ";
    ser=(11+4*i)*(11+4*i);
 }
}