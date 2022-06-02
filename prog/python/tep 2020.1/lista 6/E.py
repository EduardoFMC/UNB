import math

a = int(input())
res =[]

for base in range(2, a):
    
    k = a
    ans = 0
    while (k > 0) :
     
        re = k % base
        ans = ans + re 
        k = int(k / base)
        
    res.append(ans)

div = math.gcd(sum(res), a-2)
print(str(sum(res)//div) +'/'+ str((a-2)//div))