t = int(input())
res = []

for i in range(t):
    cnt = 0
    l = []
    a,b,k = map(int,input().split())
    boys = (list(map(int,input().split())))
    girls = (list(map(int,input().split())))
    
    if k == 1:
        res.append(0)
    else:
        bl = [0]*(a+1)
        gl = [0]*(b+1)
        
        for i in range(k):
            bl[boys[i]] += 1
            gl[girls[i]] += 1
        for i in range(k):
            cnt += k - (bl[boys[i]]) - (gl[girls[i]]) +1
        res.append(cnt)
            
for i in res:
    print(i//2)
            

        