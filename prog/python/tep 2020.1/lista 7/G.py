import re

n = int(input())
times = dict()
for i in range(n):
    times[input()] = [0,0,0]

numt = n*(n-1)//2
for j in range(numt):
    text = input()
    t1,t2,num1,num2 = re.split(' |-|:',text)
    num1,num2 = int(num1), int(num2)
    
    if num1 > num2:
        times[t1][0] += 3
    elif num1 < num2:
        times[t2][0] += 3
    else:
        times[t1][0] += 1
        times[t2][0] += 1
    
    times[t1][1] += num1 - num2
    times[t2][1] += num2 - num1
    times[t1][2] += num1
    times[t2][2] += num2

print('\n'.join(sorted(b for a, b in sorted((b, a) for a, b in times.items())[n // 2: ])))