n, t = map(int, input().split())

ans = 2
l = []

for i in range(n):
    a = list(map(int, input().split()))
    l.append(a)

l = sorted(l, key = lambda l:l[0], reverse = False)

for i in range(n-1):
    dist = (l[i+1][0] - l[i+1][1]/2) - (l[i][0] + l[i][1]/2)
    
    if dist == t:
        ans += 1
    elif dist > t:
        ans += 2
print(ans)