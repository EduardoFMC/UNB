s = input()
cnt = 0
l = ['A','C','T','G']
res = []
flag = True

for i in s:
    if i in l:
        cnt += 1
    else:
        res.append(cnt)
        cnt = 0
res.append(cnt)
print(max(res))