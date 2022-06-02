def A(m,n,conta):
    conta += 1
    if m == 0:
        return 2*n
    elif m >= 1 and n == 0:
        return 0
    elif m >= 1 and n == 1:
        return 2
    elif m >= 1 and n >= 2:
        return A(m-1,A(m,n-1,conta),conta)

conta =0
print(A(3,3,conta))
print(conta)

n = 4
cnt = 0
for i in range(n+1):
    cnt += 2*i
print(cnt)