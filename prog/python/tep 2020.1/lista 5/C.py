from fractions import Fraction

y, w = map(int, input().split())

b=['1/1','5/6','2/3','1/2','1/3','1/6']
s = max(y, w)
print(b[s-1])