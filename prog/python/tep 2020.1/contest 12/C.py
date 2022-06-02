t = int(input())
for i in range(t):
    n = int(input())
    s = [int(x) for x in input()]
    g = [int(x) for x in input()]
    res = 0
    
    for i in range(n):
        if g[i] == 1:
            if s[i] == 0:
                res += 1
            elif i-1 >=0 and s[i-1] == 1:
                s[i-1] = 0
                res +=1
            elif i+1 < n and s[i+1] == 1:
                s[i+1] = 0
                res +=1
    print(res)
                