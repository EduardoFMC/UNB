a = input()
b = input()
c = input()

s = a+b+c

if s == s[::-1]:
    print("YES")
else:
    print("NO")