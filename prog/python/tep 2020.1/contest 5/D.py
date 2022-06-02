n, m = map(int,input().split(' '))

rejeitados = []
aceito = 0

for i in range(m):
    a, b = map(int,input().split(' '))
    rejeitados.append(a)
    rejeitados.append(b)

for i in range(1, n+1):
    if i not in rejeitados:
        aceito = i
        break

print(n-1)
if n != 1:
    for i in range(1, n+1):
        if i != aceito:
            
            print(aceito, i)
