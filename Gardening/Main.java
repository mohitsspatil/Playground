#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int col,row,tree;
  cin>>row>>col>>tree;
  if (tree>=col*1 && tree<=col*2){
    cout<<"It is a mango tree";
  }
  else if (tree>=col*(col-2) && tree<=col*(col-1))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  
  
  
}