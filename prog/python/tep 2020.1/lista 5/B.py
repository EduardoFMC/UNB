n = int(input())
count = 0

lista = []

for i in range(n):
    lista.append(int(input())) 

inde = lista.index(max(lista))
lista[inde] = lista[inde]//2

print(sum(lista))