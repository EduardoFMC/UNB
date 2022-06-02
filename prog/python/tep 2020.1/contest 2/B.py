D, N = input().split(" ")

D = int(D)
N = int(N)
ans = 1

for i in range(D):
    ans *= 100
    if N == 100:
        
        res = ans * (N+1)
    else:
        res = ans*N

if D != 0:
    print(res)
else:
    if N == 100:
        print(100+1)
    else:
        print(N)
    