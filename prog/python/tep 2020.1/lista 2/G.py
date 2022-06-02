n, m = map(int, input().split(' '))
pesos = list(map(int, input().split(' ')))

deletados = []
grafo = []
soma = 0

for i in range(m):
    x, y = map(int, input().split(' '))
    a = [x,y,pesos[y-1]]
    b = [y,x,pesos[x-1]]
    
    grafo.append(a)
    grafo.append(b)

    soma += min(pesos[x-1], pesos[y-1])
print(soma)
    
