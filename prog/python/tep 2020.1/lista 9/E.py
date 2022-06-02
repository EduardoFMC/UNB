n=int(input())
lx=set()
for i in range(n):
    x,d=map(int,input().split())
    if (x+d,-d) in lx:
        print("YES")
        exit()
        
    lx.add((x,d))
print("NO")