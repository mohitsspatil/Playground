#include<stdio.h>
int bin_to_dec(int n)
{
    //Your code goes here
  int num=n;
  int dec_val=0;
  int base=1;
   int temp=num;
  while(temp){
  int last_dig=temp%10;
    temp=temp/10;
    dec_val=dec_val+last_dig*base;
    base=base*2;
  }
  return dec_val;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}