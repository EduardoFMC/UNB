a,b,n = map(int,input().split())

for x in range(-1000,1001):
    
    if a*x**n == b:
        print(x)
        break
else:
    print('No solution')