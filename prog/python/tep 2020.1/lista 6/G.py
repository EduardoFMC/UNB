s = input()
l = [(0,0)]
x,y = 0,0
res = True
for i in s:
    cnt = 0
    if i == 'L':
        x -= 1
    if i == 'R':
        x += 1
    if i == 'U':
        y += 1
    if i == 'D':
        y -= 1
        
    if (x, y) in l:
        res = False
        break
    l.append((x, y))
    
    if (x + 1, y) in l:
        cnt += 1
    if (x - 1, y) in l:
        cnt += 1
    if (x, y+1) in l:
        cnt += 1
    if (x, y-1) in l:
        cnt += 1
    
    if cnt >= 2:
        res = False
        break

if res:
    print("OK")
else:
    print("BUG")