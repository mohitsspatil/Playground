#include <iostream>
using namespace std;
int main()
{
int n1,n=3,i,j;
  cin>>n1;
  for(i=1;i<=n+1;i++)
  {
    for(j=1;j<=i;j++)
    
      cout<<n1;
    
    n1++;
    cout<<"\n";
    }
     n1--;
  for(i=n+1;i>=1;i--)
  {
    for(j=1;j<=i;j++)
      cout<<n1;
    n1--;
    cout<<"\n";
  }
}