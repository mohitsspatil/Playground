#include<iostream>
#include <cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int i,j=0;
  int*number,*odd,*even;
  number=(int *)malloc (n*sizeof(int));
  odd=(int *)malloc (n*sizeof(int));
  even=(int *)malloc (n*sizeof(int));
  for (i=0;i<n;i++)
  {
   cin>>*(number+i);
    }
  for (i=0;i<n;i++)
  {
    if (*(number+i)%2!=0)
      *odd=*odd+1;
    else 
      *even=*even+1;
  }
  cout<<(*odd)<<"\n"<<(*even);
  return 0;
}