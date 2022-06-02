s = input()

d = dict()
for i in range(len(s)):
    for j in range(len(s)):
        sub = s[i:j+1]
        if sub in d:
            d[sub] += 1
        else:
            d[sub] = 1

res = []
for key in d:
    if d[key] > 1:
        res.append(len(key))
if not res: print(0)
else: print(max(res))