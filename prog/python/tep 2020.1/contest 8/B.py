n,m, c = map(int, input().split())
b = list(map(int, input().split()))

cnt = 0
for i in range(n):
    pro = []
    a = list(map(int, input().split()))

    for num1, num2 in zip(a, b):
        pro.append(num1 * num2)
    if sum(pro) + c> 0:
        
        cnt += 1
