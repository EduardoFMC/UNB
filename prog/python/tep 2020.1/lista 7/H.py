x=abs(int(input()))
i=0
while x>0 or x%2==1:
    i+=1
    x-=i
print(i)