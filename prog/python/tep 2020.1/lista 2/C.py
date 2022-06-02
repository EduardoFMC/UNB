n = int(input())
lista = []
count =0
for i in range(n):
    p, v, t = (map(int, input().split(' ')))
    lista.append(p)
    lista.append(v)
    lista.append(t)
    if lista.count(1) >= 2:
        count +=1
    lista = []

print(count)
        