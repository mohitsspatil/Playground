#include <iostream>
using namespace std;
int pattern(int n)
{
   //Your code goes here
  int i,j;
  for (i=1;i<=n;i++){
  	for(j=1;j<=n;j++){
    if(j==1 || j==n||i==1||i==n)
      cout<<"1";
      else
        cout<<" ";
    }
    cout<<"\n";
  }
}
int main()
{
    int n;
    cin>>n;
    pattern(n);
}
