#include <iostream>
using namespace std;
int main()
{
  int i,n;
  float ser=0.5;
  cin>>n;
  if (n==1)
    cout<<ser;
  else
  {
for (i=1;i<=n;i++)
  {
   cout<<ser<<" ";
    ser=ser*3;
    
}
}
}
