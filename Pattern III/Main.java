#include <iostream>
using namespace std;
int main()
{
  int n,i,j,a;
  cin>>n;
  a=1;
  for(i=1;i<=n;i++)
  {
    for (j=1;j<=i;j++)
    {
      if (j<i)
        cout<<a<<"*";
      else
        cout<<a;
    }
    cout<<"\n";
    a++;
  }
  a--;
  for (i=n;i>=1;i--)
  {
    for (j=1;j<=i;j++)
    {
      if(j<i)
        cout<<a<<"*";
      else
        cout<<a;
    }
    cout<<"\n";
    a--;
  }
}
