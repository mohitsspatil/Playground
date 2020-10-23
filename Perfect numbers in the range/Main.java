#include <iostream>
using namespace std;
int main()
{
  int x,y,i,sum;
  cin>>x>>y;
  for (x;x<=y;x++){
    i=1;
    sum=0; 
    while (i<x){
      if (x%i==0)
        sum=sum+i;
      i++;
    }
      if (sum==x)
        cout<<x<<" ";
      
    }
  }
