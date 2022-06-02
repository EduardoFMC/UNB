n, m = map(int, input().split(' '))

l = list(map(int, input().split(' ')))

count = 0
casa = 1

for i in l:
    if i >= casa:
        count += i - casa
    else:
         count += n + i - casa
    casa = i
        
print(count)  
    
    