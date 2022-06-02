n = int(input())

l = list(map(int, input().split()))
l = sorted(l)

if (max(l) < sum(l[:-1])):
    print("Yes")

else:
    print("No")