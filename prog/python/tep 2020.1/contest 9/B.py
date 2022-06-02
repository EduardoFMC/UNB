n, l = map(int, input().split())

lista = []
for i in range(1, n+1):
    lista.append(l + i -1)

som = sum(lista)

res = -1
gra = 10**10

for j in range(n):
    a = som - lista[j]
    
    if abs(som - a) < gra:
        gra = abs(som - a)
        res = som - lista[j]

print(res)