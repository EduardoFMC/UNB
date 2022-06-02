x,y,z=map(int,input().split())
 
a=x+(y-z)
b=y+(z-x)
c=z+(x-y)
flag=0

if a%2==0 and b%2==0 and c%2==0:
    flag+=1

if a>=0 and b>=0 and c>=0:
    flag+=1

if flag != 2:
    print("Impossible")
else:
    floorA=a//2
    floorB=b//2
    floorC=c//2
    
    print(floorA,floorB,floorC)