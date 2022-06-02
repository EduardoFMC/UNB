import math
a,b,x,y = map(int, input().split())

g = math.gcd(x,y)
x = x//g
y = y//g

multi = min(a//x, b//y)
print(multi*x, multi*y)