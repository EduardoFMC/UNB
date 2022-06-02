n = int(input())
l = list(map(int, input().split()))
cnt = 0
e = 0
somar = sum(l)
for i in range(n-1):
    e += l[i]
    if somar - e == e:
        cnt +=1

print(cnt)