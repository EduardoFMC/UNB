t = int(input())
res = []
for i  in range(t):
    n = int(input())
    a = input()
    conta = a[1:].count('1 1 1')
    antes = '1 1 ' + a[0]
    c  = 0
    if antes == '1 1 1':
        c = 1
    res.append(c + conta)
    
for j in res:
    print(j)