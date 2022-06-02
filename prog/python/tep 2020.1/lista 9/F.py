if __name__ == '__main__':
    n = int(input())
    a = list(map(int, input().split()))
    a = sorted(a)
    res = 1
 
    for i in range(n):
        if res == a[i]:
            res += 1
    
    print(res)