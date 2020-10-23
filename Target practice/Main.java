#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,t=1,sum=0;
  cin>>n;
  do{
    cin>>a;
    sum=sum+a;
    if (sum>=n) {
      cout<<"The number of turns is "<<t;
    }
      t++;
  }while (sum<n);
  
      
   
}