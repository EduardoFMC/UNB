l = []

try:
    while (1):
        l.append(input())
        
except:
    pass
    
tamM = max(len(linha) for linha in l)

compensador = 1
print('*' * (tamM + 2))

for i in l:
    x = (tamM - len(i))
    dif = (tamM - len(i))//2
    
    if x % 2 == 0:
        print('*' + ' '*dif + i + ' '*dif + '*')
    else:
        compensador = 1 - compensador
        print('*' + (dif + compensador)*' ' + i + (dif + (1-compensador))*' ' + '*')


print('*' * (tamM + 2))
