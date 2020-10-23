#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,drop=1,rise=2,m;
  cin>>n;
  int a[n];
  for (int i=0;i<n;i++){
    cin>>a[i];
  }
  m=a[0];
  cout<<"1"<<"\n";
  for(int i=1;i<n;i++){
    if(a[i]<m)
    {
      m=a[i];
        cout<<drop<<"\n";
    }
    else
    {
      m=a[i];
      cout<<rise<<"\n";
      rise=rise+2;
}
  }
}