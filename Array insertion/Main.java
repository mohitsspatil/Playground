#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,pos,num;
  int a[20];
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  for (int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>pos;

  
  if(pos>=n)
    cout<<"Invalid Input";
  
  else
  {
      cout<<"Enter the value to insert"<<"\n";
  cin>>num;
    cout<<"Array after insertion is"<<"\n";
for(int i=0;i<pos-1;i++)
{
  cout<<a[i]<<"\n";
}
    cout<<num<<"\n";
    for(int i=pos-1;i<n;i++)
    {
      cout<<a[i]<<"\n";
    }
  }
}
