n = input()

for num in range(int(n), 1000):
    
    if str(num)[0] == str(num)[1] == str(num)[2]:
        
        print(num)
        
        quit()
 