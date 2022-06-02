n,m = map(int, input().split())
p = []
flag = False
minr = n
maxr = 0
minc = m
maxc = 0
for i in range(n):
    s = (input())
    if ''.join(s) != '.'*len(s):
        flag = True
    if flag:
        p.append(s)
salva = 0
for i in reversed(range(len(p))):
    if ''.join(p[i]) != '.'*len(p[i]):
        salva = i+1
        break
p = p[:salva]

for i in range(len(p)):
    for j in range(m):
        if p[i][j] == "*":
            minr = min(minr, i)
            maxr = max(maxr, i)
            minc = min(minc, j)
            maxc = max(maxc, j)
for i in range(minr, maxr + 1):
    print(p[i][minc:maxc + 1])