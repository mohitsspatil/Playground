#include<iostream>
using namespace std;
int queue(int n, int m, int a[])
{
  int sum=0;
  for(int i=0;i<n;i++)
    sum=sum+a[i];
  
  if(n=1&&m==2)
    return 1;
  else 
    return ((sum/m)+1);
}
int main()
{
  //Type your code here.
  int n,m;
  int a[n];
  cin>>n>>m;
  for (int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<queue(n,m,a);
}