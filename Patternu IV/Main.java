#include <iostream>
using namespace std;
int main() {
    // Type your code here
  
    
  int n,i,j,a=1;
  cin>>n;
  for (i=1;i<=n;i++)
  {
    if (i%2==0)
      cout<<a+1;
    for(j=1;j<n;j++)
    {
      cout<<a;
    }
    if(i%2!=0)
    {
      cout<<a+1;
    }
    a++;
    cout<<"\n";
  }
  return 0;
  
  
}