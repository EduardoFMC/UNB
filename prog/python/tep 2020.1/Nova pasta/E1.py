t = int(input())

for i in range(t):
    n = int(input())
    a = list(map(int,input().split()))
    l = [a[0]]
    for i in range(1,n):
        if a[i] <= l[0]:
            l.insert(0,a[i])
        else:
            l.append(a[i])
    print(*l, end = ' \n')
