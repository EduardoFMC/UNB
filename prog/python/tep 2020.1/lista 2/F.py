d, sumt = map(int, input().split(' '))

lminh = []
lmaxh = []
index = 0

for i in range(d):
    minh, maxh = map(int, input().split(' '))
    lminh.append(minh)
    lmaxh.append(maxh)

if (sumt < sum(lminh)) or (sumt > sum(lmaxh)):
    print("NO")
    quit()
else:
    print("YES")
    flag = True
    
    while (sum(lminh) != sumt) and  (index < d):
        while (sum(lminh) < sumt) and (lminh[index]< lmaxh[index]):
            lminh[index]+=1
        index += 1

print(*lminh, end = ' ')
        
    
    