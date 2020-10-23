#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int n,ser;
  cin>>n;
  for (int i=1;i<=n;i++)
  {
    ser=i*i;
    if (ser%2==0)
      cout<<ser-2<<" ";
    else cout<<ser-1<<" ";
  }
}