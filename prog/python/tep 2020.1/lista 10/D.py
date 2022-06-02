f=input()
m=input()
s=input()

ppt={'rock': 'scissors', 'paper': 'rock', 'scissors': 'paper'}

if ppt[f] == m and ppt[f] == s: print("F")
elif ppt[m] == f and ppt[m] == s: print("M")
elif ppt[s] == f and ppt[s] == m: print("S")
else: print("?")