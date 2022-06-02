import collections
l = []

xs = []
ys = []
for i in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    
    seg1,seg2 = (x1, y1),(x2, y2)
    l.extend([seg1, seg2])
    xs.extend([x1,x2])
    ys.extend([y1,y2])

xmax = max(xs)
xmin = min(xs)
ymax = max(ys)
ymin = min(ys)

pares = [(xmin,ymin),(xmin,ymax),(xmax,ymin),(xmax,ymax)]

poss1 = [(xmin,ymin),(xmin,ymax)]
poss2 = [(xmin,ymax),(xmax,ymax)]
poss3 = [(xmax,ymax),(xmax,ymin)]
poss4 = [(xmax,ymin),(xmin,ymin)]
occ = collections.Counter(l)     

if len(occ) != 4:
    print("NO")
    
elif xmax == xmin or ymax == ymin:
    print("NO")

else:
    count = 0
    f1,f2,f3,f4 = 0,0,0,0
    for x in range(0,len(l), 2):
        junc = [l[x],l[x+1]]
        if junc == poss1 or junc == (poss1)[::-1]:
            f1+=1
            count += 1
        elif junc == poss2 or junc == (poss2)[::-1]:
            f2+=1
            count += 1
        elif junc == poss3 or junc == (poss3)[::-1]:
            f3+=1
            count += 1
        elif junc == poss4 or junc == (poss4)[::-1]:
            f4+=1
            count += 1
    
    if count == 4 and (f1 ==1 and f2 ==1 and f3 ==1 and f4 ==1):
        print("Yes")
    else:
        print("No")
    
    