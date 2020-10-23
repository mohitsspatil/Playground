#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int x,i;
  cin>>x;
  do{
    x=x/10;
    i++;
  }
  while(x>0);
  cout<<i;
  
}