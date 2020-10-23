#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r;
  c=r;
  int m[r][c];
  int sum1=0,sum2=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cin>>m[i][j];
}
  for(int i=0;i<r;i++)
  {
  sum1=sum1+m[i][i];
  }
  for (int i=0;i<r;i++)
  {
  sum2=sum2+m[i][r-1-i];
  }

if(sum1==sum2)
  cout<<"Yes";
else cout<<"No";
}
  