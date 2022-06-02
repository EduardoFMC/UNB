t = int(input())
mod = 10 ** 9 + 7
for i in range(t):
    n = int(input())
    r1 = list(map(int,input().split()))
    r2 = list(map(int,input().split()))
    mat = dict(zip(r1,r2))
    
    cnt = 0
    while len(mat) != 0:
        cnt +=1
        d = mat.popitem()
        a,b = d[0],d[1]
        
        while a != b:
            b = mat.pop(b)
    print((2**cnt)%mod)