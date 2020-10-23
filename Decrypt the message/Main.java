#include <iostream>
using namespace std;
int main()
{
  int e,t,i=1,x=0,et;
  cin>>e>>t;
  et=e+t;
  for (i;i<et;i++){
    if (et%i==0)
    {
      x=x+i;
    }
  }
  if (x==et)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}