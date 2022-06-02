s = input()

lista = [0]*26

for i in s:
    lista[ord(i)-ord('a')] += 1

impar=[]
for i in range(len(lista)):
    if lista[i] % 2:
        impar.append(i)


for i in range(len(impar)//2):
    meio=-(i+1)

    lista[impar[i]] += 1
    lista[impar[meio]] -= 1

listaNew=[]

for i in range(len(lista)):
    if lista[i] % 2:
        listaNew.append(chr(i+ord('a')))
        lista[i] -= 1

p=[]
for i in range(26):
    while lista[i] > 0:
        p.append(chr(i+ord('a')))
        lista[i] -= 2

print(''.join(p)+''.join(listaNew)+''.join(reversed(p)))
