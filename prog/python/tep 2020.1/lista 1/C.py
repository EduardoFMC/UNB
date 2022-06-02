n = int(input())

lista = []

for i in range(n):
    palavra = str(input())
    if len(palavra) <= 10:
        lista.append(palavra)
    
    else:
        palavra = palavra[0] + str(len(palavra[1:-1])) + palavra[-1]
        lista.append(palavra)

for i in lista:
    print(i)
        