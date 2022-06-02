n, s = map(int, input().split(' '))

lista = []
if (2*n <= s):
    print("YES")
    
    for i in range(n):
        padrao = s//n
        
        lista.append(padrao)
    
    lista[0] = s - sum(lista[1:])
    print(*lista, end = ' '+"\n")
    print(1)
else:
    print("NO")