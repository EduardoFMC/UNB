n, k = map(int,input().split())

l = list(map(int,input().split()))

taml = len(l)
res = 0
contr = 0

for i in range(1,1001):
    apro = 0
    
    for j in range(0, taml):
        
        apro += int(l[j] == i +j*k)
        
    if apro > res:
        res = apro
        contr = i
        
print(taml-res)

ans = contr

for j in range(0, taml):
    
    if l[j] > ans:
        print('-', j+1, l[j] -ans)
        
    if l[j] < ans:
        print('+', j+1, -l[j] + ans)
        
    ans += k
