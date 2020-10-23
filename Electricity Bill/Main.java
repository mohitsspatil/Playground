#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units,r;
  cin>>units;
  if (units<=200) {
    r=units*0.5;
    cout<<"Rs."<<r;
  }
    else if (units>=200 && units<=400){
      r=0.65*units+100;
      cout<<"Rs."<<r;
    }
  else if (units>=400 && units<=600){
    r=0.8*units+200;
    cout<<"Rs."<<r;
  }
  else{
    r=1.25*units+425;
    cout<<"Rs."<<r;
  }
}