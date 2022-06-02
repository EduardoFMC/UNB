n = int(input())

num = list(map(int, input().split(' ')))

print( max(max(num), (sum(num)-1 )//(n-1)+1) )


