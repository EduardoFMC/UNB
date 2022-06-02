n, m, k = list(map(int, input().split()))

listar = []

for i in range(m):
    u,v,l = map(int, input().split())
    a = [u,v,l]
    b = [v,u,l]
    listar.append(a)
    listar.append(b)

if k == 0 or k == n:
    print(-1)
    
else:
    usar = []
    listak = list(map(int, input().split()))
    
    for i in listak:
        for j in listar:
            if j[0] == i or j[1] == i:
                usar.append(j[2])
    if len(usar) != 0:
        print(min(usar))
    else:
        print(-1)
    
        


    