def xorOfArray(arr, n):
    xor_arr = 0

    for i in range(n):
 
        xor_arr = xor_arr ^ arr[i]
 
    return xor_arr

t = int(input())
res = []
for i in range(t):
    lista = []
    a,b = map(int, input().split())

    for j in range(a):
        lista.append(j)
    
    
    if (xorOfArray(lista, len(lista)) == b):
        res.append(a)
    elif (xorOfArray(lista, len(lista)) ^ b) == a:
        res.append(a+2)
    else:
        res.append(a+1)
        
for i in res:
    print(i)