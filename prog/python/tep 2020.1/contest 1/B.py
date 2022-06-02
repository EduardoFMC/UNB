import math

N, D = input().split(' ')
N = int(N)
D = int(D)

lista =[]

for num in range(N):
    X, Y = input().split(' ')
    X = float(X)
    Y = float(Y)
    lista.append(math.sqrt(X*X + Y*Y))

count = 0

for q in lista:
    if q <= D:
        count = count + 1

print(count)
    