s = input()
s = list(s)

x = 0

for i in s:
    if i =="+":
        x+= 1
    else:
        x-= 1
        
print(x)