n = int(input())

l = set(map(int,input().split()))
l = sorted(l)

if len(l) > 1:
    print(l[1])
else:
    print("NO")