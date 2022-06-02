n = int(input())
mod = 1000000007
for i in range(n):
    a = int(input())
    ans = 1
    for j in range(2*a,2,-1):
        ans = (ans*j) % mod

    print(ans%mod)    