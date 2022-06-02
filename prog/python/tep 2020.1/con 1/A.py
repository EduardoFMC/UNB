t = int(input())
lista = []
for i in range(t):
    n = int(input())
    s = input()
    copy = ''
    
    for i in range(n):
        if s[i] == 'R':
            copy +='R'
        
        if s[i] == 'L':
            copy +='L'
            
        if s[i] == 'U':
            copy +='D'
        
        if s[i] == 'D':
            copy +='U'
    lista.append(copy)
    copy = ''
    
for j in lista:
    print(j)
        
            