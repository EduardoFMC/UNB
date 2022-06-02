n, m, x, y = map(int, input().split(' '))


listx = (input().split(' '))
for i in range(len(listx)):
    listx[i] = int(listx[i])
    
listy = (input().split(' '))
for i in range(len(listy)):
    listy[i] = int(listy[i])

listx.append(x)
listy.append(y)

if max(listx) >= min(listy):
    print("War")
else:
    print("No War")