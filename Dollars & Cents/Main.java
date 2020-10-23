#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,d,c;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  if (c>=100 && c<200){
    c=c-100;
    d=d+1;
    cout<<d<<"\n"<<c;
  }
  else if (c>=200 && c<300){
    c=c-200;
    d=d+2;
    cout<<d<<"\n"<<c;
  }
  else if (c>=300 && c<400){
    c=c-300;
    d=d+3;
    cout<<d<<"\n"<<c;
  }
  else if (c>=400 && c<500){
    c=c-400;
    d=d+4;
    cout<<d<<"\n"<<c;
  }
  else
    cout<<d<<"\n"<<c;
  
  
  
  
}