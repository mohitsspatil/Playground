#include <iostream>
using namespace std;
int main()
{
int n,ser,i=1;
  cin>>n;
  ser=6;
  do{
    cout<<ser<<" ";
    ser=ser+5*i;
    i++;
  }while(i<=n);
}