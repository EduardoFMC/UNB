n , m = map(int, input().split())
l = []
for i in range(m):
    a = list(map(int, input().split()))
    l.append(a)

l = sorted(l, key=lambda l:l[1], reverse = True)
cnt = 0
ans = 0
maxi = n
for i in range(len(l)):
    if cnt == maxi:
        break
    if l[i][0] >= n:
        cnt += n
        ans += l[i][1]*n
    else:
        n = n - l[i][0]
        cnt += l[i][0]
        ans += l[i][0]*l[i][1]

print(ans)