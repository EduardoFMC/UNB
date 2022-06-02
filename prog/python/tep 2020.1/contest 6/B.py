s = input()

res = 100000000000000
for i in range(len(s)-2):
    
    res = min(abs(int(s[i:i+3])-753),res)
    
print(res)