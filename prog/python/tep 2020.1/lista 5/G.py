n = int(input())
quali = input().split()
m = int(input())

None
l = [None]*n
cnt = 0
for i in range(m):
    a, b, c = list(map(int, input().split()))
    
    if l[b-1] == None:
        l[b-1] = c
    else:
        l[b-1] = min(l[b-1], int(c))

if (l.count(None) > 1):
    print(-1)

else:
    for j in l:
        if j != None:
            cnt += j
    print(cnt)