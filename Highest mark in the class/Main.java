#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int marks[n];
  for (int i=0;i<n;i++){
cin>>marks[i];
  }
int largest=marks[0];
  for(int i=0;i<n;i++){
    if (marks[i]>largest)
      largest=marks[i];
  }
  cout<<largest;
} 

