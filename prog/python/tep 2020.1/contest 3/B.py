n = int(input())

if n < 4:
    print("No")

else:
    bolo = 0
    
    while bolo * 4 <= n:
        
        if (n - bolo * 4) % 7 == 0:
            
            print("Yes")
            break
        bolo +=1
    else:
        print("No")
        
        
            