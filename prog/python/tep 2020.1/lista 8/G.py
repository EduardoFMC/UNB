n = int(input())
al = []
bl = []
ct = 0
cm = 0
for i in range(n):
    
    a,b,c = map(int,input().split())
    if (a in al or b in bl):
        a , b = b , a
        cm += c
        
    ct += c
    
    al.append(a)
    bl.append(b)
    
    
print(min(cm,ct-cm)) 