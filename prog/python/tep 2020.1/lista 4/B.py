n = int(input())

T,A = map(int, input().split(' '))

H = list(map(int, input().split(' ')))

for i in range(n):
    
    H[i] = abs(A - (T- (H[i] * 0.006)))

index = H.index(min(H))
print(index+1)
    