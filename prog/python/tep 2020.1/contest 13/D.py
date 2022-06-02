n = int(input())
s = set()
for i in range(n):
    s.add(''.join(set(input())))

cnt = 0
s = list(s)
for i in range(len(s)):
    for j in range(len(s)):
        if j != i: # so diferentes apenas
            a = set(s[i])
            b = set(s[j])
            if len(a.intersection(b)) > 0:
                cnt += 1
                break
if cnt > 0:
    print(len(s)-cnt + 1)
else:
    print(len(s)-cnt)

