#include<iostream>
using namespace std;
int pow(int a, int n){
if (n!=0)
return (a*pow(a,n-1));
  else
    return 1;
}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\n"<<"Enter the value of n";
  cin>>n;
  cout<<"\n"<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}