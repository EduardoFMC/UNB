def checa(n):
    flag = True
    if n <= 0:
        flag = False
        return flag
    else:          
        for i in range(2,n):
            if n % i == 0:
                flag = False
                break
        return flag

n = int(input())

for i in range(1, 1001):
    mandar = n * i + 1
    if checa(mandar) == False:
        print(i)
        
        break