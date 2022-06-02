import math

n, d = map(int, input().split())

ans = math.ceil(n/(d*2+1))
print(ans)