n = int(input())

if (n > 3) and (n % 2) == 1:
    print(n*(n-1)*(n-2))

elif (n > 3) and (n % 2 == 0):
    if n % 3 == 0:
        print((n-1)*(n-2)*(n-3))
    else:   
        print(n*(n-1)*(n-3))
    
elif n == 3:
    print(6)
    
elif n == 2:
    print(2)
else:
    print(1)
    