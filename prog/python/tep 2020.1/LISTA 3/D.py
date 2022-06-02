n = int(input())

count = 0

l = list(map(int,input().split()))
k = l.count(0)

for i in range(len(l)):
    if l[i] < -1:
        count += abs(l[i]) -1
        l[i] = l[i] + abs(l[i]) -1
        
    
    elif l[i] > 1:
        count += l[i] - 1
        l[i] = l[i] - (l[i] - 1)
    else:
        continue

if k > 0:
    print(count+k)
    
else:
    if l.count(-1)%2 == 0:
        print(count)
    else:
        print(count+2)
        
