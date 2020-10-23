#include <iostream>
using namespace std;
int sumofdigit(int a)
{
if (a/10==0)
  return a;
  else
    a=a%10+ sumofdigit(a/10);
  return a<10 ? a : sumofdigit(a);
  
}

int main()
{
int a;
  cin>>a;
  cout<<sumofdigit(a);
}
    