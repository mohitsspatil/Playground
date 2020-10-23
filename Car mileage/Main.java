#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage,max;
  int lit,d;
  cin>>mileage>>lit>>d;
  max=mileage*lit;
  if (max>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  
  
}