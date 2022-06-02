t = int(input())
 
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    b = sorted(a)
    ans = []
    for i in range(n):
        d = 0
        while a[i] != b[i]:
            a = a[:i] + a[i + 1:] + [a[i]]
            d += 1
        if d != 0:
            ans.append([i+1, n, d])
    print(len(ans))
    for i in ans:
        print(*i, sep=" ")