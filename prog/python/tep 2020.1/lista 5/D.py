
count = 0
cntp = 0

try:
    while(1):
        l = (input())
        
        if l[0] == '+':
            cntp += 1
        elif l[0] == '-':
            cntp -= 1
        else:
            s = l.split(":",1)[1]
            m = len(s)
            count += cntp*m

except:
    pass

print(count)

