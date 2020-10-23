#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as,f,s,a;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  f=fa-(0.01*fd*fa)+fs;
  s=sa-(0.01*sd*sa)+ss;
  a=aa-(0.01*ad*aa)+as;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if (f<=s && f<=a)
    cout<<"He will prefer Flipkart"<<"\n";
  else if (s<=f && s<=a)
    cout<<"He will prefer Snapdeal";
    else
      cout<<"He will prefer Amazon";
}