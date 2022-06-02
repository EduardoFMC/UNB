m=['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September',
'October', 'November', 'December']

s=input()
k=int(input())
print(m[(k+ m.index(s))%12])