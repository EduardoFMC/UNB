def dfs(node, x, color):
    
    visitado[node] = True
    
    if node == x:
        return True
    
    for v, c in grafo[node]:
        if c == color and not visitado[v]:
            if dfs(v,x,color):
                return True
    return False
 
 
n, m = map(int, input().split())
 
grafo = [[] for i in range(n+1)]
for i in range(m):
    a, b, c = map(int, input().split())
    grafo[a].append((b, c))
    grafo[b].append((a, c))

q = int(input())
res = []
for i in range(q):
    u, v = map(int, input().split())
    
    cnt = 0
    for cor in range(1, m+1):
        visitado = [0]*(n+1)
        
        if dfs(u,v,cor):
            cnt += 1
    res.append(cnt)

for i in res:
    print(i)
    