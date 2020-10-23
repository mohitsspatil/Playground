#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int items;
  float time;
  cin>>items>>time;
  switch (items){
    case 1:
      cout<<time;
      break;
    case 2:
      cout<<1.5*time;
      break;
    case 3:
      cout<<2*time;
      break;
    default:
      cout<<"Number of items is more";
      break;
  }
  
  
}