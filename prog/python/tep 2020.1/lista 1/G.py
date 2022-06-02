import collections

n = int(input())

sol_1 = list(map(int, input().split(' ')))
sol_1 = sol_1[1:]
    
sol_2 = list(map(int, input().split(' ')))
sol_2 = sol_2[1:]

deque_1 = collections.deque(sol_1)
deque_2 = collections.deque(sol_2)

cont = 0

while True:
    
    c1 = deque_1.popleft()
    c2 = deque_2.popleft()
    
    if c2 > c1:
        deque_2.append(c1)
        deque_2.append(c2)
    else:
        deque_1.append(c2)
        deque_1.append(c1)
        
    cont += 1
    
    if (len(deque_1) == 0):
        print("%d 2" %cont)
        break
    elif (len(deque_2) == 0):
        print("%d 1" %cont)
        break
       
    if cont == 10000:
        print(-1)
        break


