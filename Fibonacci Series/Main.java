#include<iostream>
using namespace std;
int fib(int n){
  if ((n==1) || (n==0))
    return 1;
  else
    return (fib(n-1) + fib(n-2));
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
 
  cout<< "The term " <<n<< " in the fibonacci series is "<<fib(n-2);
}