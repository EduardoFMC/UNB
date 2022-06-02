n = int(input())
lista = input().split()

for i in range(len(lista)):
    lista[i] = int(lista[i])

lista.sort()
j = 1
ans = 0

for i in lista:
    ans = ans + abs(j-i)
    j = j+1
    
print(ans)
