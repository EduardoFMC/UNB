import copy

n = int(input())
l = list(map(int, input().split()))
ls = sorted(l)
la = l.copy()
cnt = 0

while l != ls:
    if cnt >= max(2*n,4):
        print(-1)
        break
    else:
        if l[0] < l[n]:
            for i in range(0,2*n,2):
                a = l[i]
                b = l[i+1]
                l[i] = b
                l[i+1] = a
            cnt +=1
        else:
            for i in range(n):
                a = l[i]
                b = l[n+i]
                l[i] = b
                l[i+n] = a
            cnt +=1
else:
    print(cnt)