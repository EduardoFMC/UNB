t, m = map(int, input().split())

alocado = [0]*m
ind = 1

for i in range(t):
    op = input().split()
    
    ## alloc
    if op[0] == 'alloc':
        pos = 0
        for j in range(m):
            if alocado[j]==0:
                pos += 1
                if pos == int(op[1]):
                    alocado[j-int(op[1])+1:j+1] = [ind]*int(op[1])
                    print(ind)
                    ind += 1
                    break
            else:
                pos = 0
        else:
            print("NULL")
    ##
            
    if op[0] == 'erase':
        pos = 0
        if int(op[1]) not in alocado or int(op[1])==0:
            print('ILLEGAL_ERASE_ARGUMENT')
        else:
            for j in range(m):
                if int(op[1]) > 0 and alocado[j] == int(op[1]):
                    alocado[j] = 0
    if op[0] == "defragment":
        cnt = 0
        cnt = alocado.count(0)
        alocado = [j for j in alocado if j != 0]
        for j in range(cnt):
            alocado.append(0)
            
                
                    
        