#include<iostream>
using namespace std;
int gcd(int x, int y)
{
if (x<y)
{
  for (int i=x;i>=1;i--){
    if (y%i==0 && x%i==0)
      return i;
  }
}
  if (y<x){
    for (int i=y;i>=1;i--){
      if (x%i==0 && y%i==0)
        return i;
    }
  }
}


int main()
{
  //Type your code here.
  int x,y;
  cin>>x>>y;
  cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<gcd(x,y);
  
}
