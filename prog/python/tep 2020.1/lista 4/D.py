n,m = map(int, input().split(' '))

s = list(map(int, input().split(' ')))
count =0
s = sorted(s)
for i in range(m):
    if s[i] <= 0:
        count += s[i]

print(abs(count))