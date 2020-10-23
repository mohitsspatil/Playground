n=int(input())
arr=[];
while(n!=0):
  i=n%10
  arr.append(i)
  n=n//10
sorted_arr=sorted(arr)
for j in range(0,len(sorted_arr)):
  print(sorted_arr[j],end=" ")