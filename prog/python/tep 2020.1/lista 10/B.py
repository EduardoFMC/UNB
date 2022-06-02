a, b = map(int, input().split())
res = 1

for i in range(20):
    if res >= b:
        print(i)
        break
    else:
        res += a - 1