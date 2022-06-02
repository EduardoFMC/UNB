t = int(input())

for i in range(t):
    
    n = int(input())
    principe = []
    
    for i in range(n):
        principe.append(False)
    
    indexPrin = - 1
    
    for j in range(n):
        
        lista = list(map(int, input().split(' ')))
        lista = lista[1:]
    
        for w in lista:
            if principe[w-1] == False:
                principe[w-1] = True
                break
            
        else:
            indexPrin = j
                
        
    
    if indexPrin == -1:
       print("OPTIMAL\n")
    
    else:
        
        print("IMPROVE")
        print(str((indexPrin + 1)) + " " + str(principe.index(False)+1))
    