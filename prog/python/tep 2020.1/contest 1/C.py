k = int(input())

sete = 7
count = 0
if (k % 2) == 0:
    print('-1')

else:
    while True:
        
        count = count + 1
        sete = (sete*10 + 7) %k
        
        if (sete) == 0:
            break
        
    print(count + 1)
    
    