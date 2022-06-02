S = str(input())
S = list(S)

l_count = 0
if (S[0] != "A") or ('C' not in S[2:-1]) or ("C" in S[:1] or "C" in S[-1]):
    print("WA")
else:
    for i in S:
        if i.isupper():
            l_count += 1
    
    if l_count != 2:
        print("WA")
    else:
        print("AC")

