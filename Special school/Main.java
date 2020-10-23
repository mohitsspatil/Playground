#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string s1,s2,s3;
  cin>>s1>>s2;
  reverse(s1.begin(),s1.end());
  s3=s1;
  if(s3==s2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
}