#include <iostream>
using namespace std;

int main()
{
  int n,m,req;
  cin>>m>>n>>req;

  
    int ans=1;
    while(n!=0){
      ans=ans*m;
      --n;
    }
    if (ans>=req)
      cout<<"Doctor, you can proceed with your experiment.";
    else
      cout<<"Sorry Doctor! You need more bacteria.";
  }