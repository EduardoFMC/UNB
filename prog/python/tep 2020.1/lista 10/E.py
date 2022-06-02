import sys

sys.stdin=open("input.txt","r")
sys.stdout=open("output.txt","w")

n=int(input())
for i in range(3):
    a,b = map(int,input().split())
    if a == n:
        n=b
    elif b==n:
        n = a
print(n)
        