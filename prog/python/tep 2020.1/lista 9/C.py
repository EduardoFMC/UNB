n,d=map(int,input().split())
l=list(map(int,input().split()))
cnt = 0
for i in range(len(l)):
    for j in range(len(l)):
        if i != j:
            x=l[i]
            y=l[j]
            if abs(x-y) <= d:
                cnt+=1
print(cnt)