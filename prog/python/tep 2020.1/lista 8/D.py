n = int(input())

poss = []
cnt = 0
for i in range(n):
    a, c = input().split()
    l = (a,c)
    
    if l not in poss:
        poss.append(l)
        cnt += 1
        
print(cnt)