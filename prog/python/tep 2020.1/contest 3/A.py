n, k = input().split()

n = int(n)
k = int(k)

res = n % k
 
if res == 0:
    print(0)
else:
    print(1)