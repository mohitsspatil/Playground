#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,x,y,z;
  cin>>row>>col>>x;
  y=(row*col)-row;
  z=row*col;
  if (x>=1 && x<=row)
    cout<<"Yes";
  else if (x>y && x<=z)
    cout<<"Yes";
  else if (x==1 | (x==1+row) | (x==1+2*row) | (x==1+3*row) | (x==1+4*row))
    cout <<"Yes";
  else
    cout<<"No";

}