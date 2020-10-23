#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,res;
  cin>>n>>m;
  if (n<m)
    res=n;
  if(m<n)
    res=m;
  if (res%2==0)
    cout<<"Mani Iyer";
    else 
      cout<<"Arun Gupta";
}