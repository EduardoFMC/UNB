t = int(input())
for i in range(t):
    n,m,k = map(int,input().split())
    comp = n*(n-1)/2
    
    if(comp < m or n-1> m):
        print("NO")
    
    elif(n == 1 and k <= 1):
        print("NO")
    
    elif(n == 2 and k <= 2):
        print("NO")
    
    elif(n >= 3 and (m < comp and k <= 3 or n-1 > m or m >= comp and k <= 2)):
        print("NO")
    
    else:
        print("YES")
