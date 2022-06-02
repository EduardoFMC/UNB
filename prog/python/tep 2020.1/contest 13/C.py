n = int(input())
comb = n*(n+1)/2
res = []

if n > 2:
      
    c = int(comb/2)
    while c > n:
        res.append(int(n))
        c -= n
        n -= 1
    
    res.append(int(c))
    res = sorted(res)
    res = [str(x) for x in res]
    
    if comb %2 ==0:
        print(0)
        print(len(res),' '.join(res))
    else:
        print(1)
        print(len(res),' '.join(res))
else:
    print(1,1,1)
    