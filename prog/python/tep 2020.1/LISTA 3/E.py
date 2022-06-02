t = int(input())

for i in range(t):
    n, k = map(int, input().split(' '))
      
    if n %2 == 0:
        
        n = n + 2*k
    
    else:
         for j in range(2, n+1):   
            if n % j==0:
                n = n + 2*(k-1)+j
                break
            
    print(n)