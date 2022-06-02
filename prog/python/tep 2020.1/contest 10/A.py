a,b,c = map(int, input().split())
x = c-(a-b)

if x <= 0:
    print(0)
else:
    print(x)