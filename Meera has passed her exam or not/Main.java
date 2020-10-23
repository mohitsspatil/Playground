#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,m,flag;
  cin>>n;
  int rn[n];
  for(int i=0;i<n;i++){
    cin>>rn[i];
  }
  cin>>m;
  for (int j=0;j<n;j++)
  {
    if (rn[j]==m)
    {
    flag=1;
  }    
  }
    if (flag==1)
    cout<<"She passed her exam";
    else cout<<"She failed";
    
      
  
   
}