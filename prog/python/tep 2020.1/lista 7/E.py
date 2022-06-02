n, x = map(int, input().split())
m = []
l, r = -1,1001
for i in range(n):
    a = sorted(list(map(int, input().split())))
    l = max(l,a[0])
    r = min(r,a[1])
m.append(l)
m.append(r)
if m[0]>m[1]:
    print(-1)
elif x in m or (x<m[1] and x>m[0]):
    print(0)
else:
    print(min(abs(m[1]-x),abs(m[0]-x)))