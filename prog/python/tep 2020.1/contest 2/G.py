n, m = input().split(" ")

n = int(n)
m = int(m)
a =0

while(n < m):

    if(m%2==0): 

        m=m/2

    else:

        m+=1

    a += 1

print(int(a+n-m))
