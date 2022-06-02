t = int(input())

for i in range(t):
    n = int(input())
    
    lista = list(map(int, input().split(' ')))
    pos = n - 1
    
    while(pos > 0 and lista[pos - 1] >= lista[pos]):
        
        pos -= 1
        
    while(pos > 0 and lista[pos - 1] <= lista[pos]):
        pos -= 1
        
    print(pos)