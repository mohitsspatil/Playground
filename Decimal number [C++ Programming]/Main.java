#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    //Your code goes here
  int base=1,oct_val=0,rem;
  while(n!=0){
  rem=n%8;
    oct_val=oct_val+rem*base;
    n=n/8;
    base=base*10;
  }
return oct_val;
}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
