#include <iostream>
using namespace std;
int main()
{
int n,i=1,ser;
  cin>>n;
  ser=11*11;
  do 
  {
     cout<<ser<<" ";
    ser=(11+4*i)*(11+4*i);
    i++;
  }while(i<=n);
}
    