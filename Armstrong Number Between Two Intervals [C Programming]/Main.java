#include<stdio.h>
int getdigits(int n)
{
    int c=0;
    while(n>0)
    {
        n/=10;
        c++;
    }
    return c;
}
int power(int rem, int p)
{
    int res=1,i;
    for(i=1;i<=p;i++)
        res*=rem;
    return res;
}
int armstr(int n)
{
   //Your code goes here
  int temp=n,r,sum=0,nofdigits;
  nofdigits=getdigits(n);
  while(n!=0){
  
    r=n%10;
    sum+=power(r,nofdigits);
      n=n/10;
  }
  if(sum==temp)
    return 1;
  else
    return 0;
}

void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(armstr(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    print(a,b);
    return 0;
}
