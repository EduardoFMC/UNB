def primes(n):
    sieve = [True] * n
    for i in range(3,int(n**0.5)+1,2):
        if sieve[i]:
            sieve[i*i::2*i]=[False]*((n-i*i-1)//(2*i)+1)
    return [2] + [i for i in range(3,n,2) if sieve[i]]

n, k = map(int,input().split())
cnt = 0
l = primes(n+1)

for i in range(len(l)-1):
    if (l[i] + l[i+1]+1) in l:
        cnt += 1

if cnt == k or k == 0:
    print("YES")
else:
    print("NO")