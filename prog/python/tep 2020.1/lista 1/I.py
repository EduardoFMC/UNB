a = input()
b = input()
c = input()

numx= c.count('X')+b.count('X')+a.count('X') 
numo= c.count('0')+b.count('0')+a.count('0')

possibilidades =[a,b,c, a[0]+b[1]+c[2], a[2]+b[1]+c[0]] + list(map(''.join, zip(a,b,c)))

pri, seg = False, False

if 'XXX' in possibilidades: pri = True
if '000' in possibilidades: seg = True

if ((numx - numo not in [0,1])) or (seg and numx != numo) or (pri and numx != numo + 1):
    print("illegal")

elif pri:
    print("the first player won")
elif seg:
    print("the second player won")
    
elif numx + numo == 9:
    print("draw")

elif numx - numo == 0:
    print("first")

else:
    print("second")





