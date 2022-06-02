n = int(input())

dici = {}
res = []
for i in range(n):
    s = input()

    if s not in dici:
        dici[s] = 0
        res.append("OK")
    else:
        dici[s] += 1
        res.append(s+str(dici[s]))

for j in res:
    print(j)