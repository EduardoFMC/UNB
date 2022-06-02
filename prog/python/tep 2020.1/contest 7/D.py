def dfs(grafo, ver):
    while grafo[ver] != ver:
        grafo[ver] = grafo[grafo[ver]]
        ver = grafo[ver]
 
    return ver

n,m = map(int, input().split())

grafo = list(range(n+1))

count_lista = [0]*(n+1)

for i in range(m):
    grupo = input().split()
    for i in range(len(grupo)):
        grupo[i] = int(grupo[i])
        
    grupo = grupo[1:]
    
    if len(grupo) > 0:
        presenca = dfs(grafo, grupo[0])
            
        for ver in grupo[1:]:
            grafo[dfs(grafo, ver)] = presenca
    
for i in range(1, n+1):
    count_lista[dfs(grafo, i)] += 1

print (' '.join(map(str, [count_lista[dfs(grafo, i)] for i in range(1,n+1)])))  