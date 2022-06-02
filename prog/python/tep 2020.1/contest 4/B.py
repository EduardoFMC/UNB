import numpy as np

h, w = map(int, input().split(' '))

lista = []
lista_l = []
lista_c = []

for i in range(h):
    lista.append(list(input()))

for i in lista:
    if not(''.join(i) == ('.' * w)):
        lista_l.append(i)
        
        
lista_l = np.array(lista_l).T.tolist()

flag = True
for i in lista_l:
    m = len(lista_l[0])
    if not(''.join(i) == ('.' * m)) :
        lista_c.append(i)


if len(lista_l) == 0:
    flag = False
    
if flag:
    lista_c = np.array(lista_c).T.tolist()
    for i in lista_c:
        print(''.join(i))
else:
    print()

    
