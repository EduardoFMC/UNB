n = int(input())
j = 0
btc = 0
for i in range(n):
    x,u = input().split()
    
    if u == "JPY":
       j += float(x)
    else:
        btc+= float(x)

print(j+btc*380000.0)