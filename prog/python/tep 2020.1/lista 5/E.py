s = input()
seq1 = input()
seq2 = input()

frente = False
tras = False

if seq1 in s:
    a = s[s.find(seq1)+len(seq1):]
    if (seq2 in a):
        frente = True
s1 = s[::-1]

# reversed
if seq1 in s1:
    a = s1[s1.find(seq1)+len(seq1):]
    if (seq2 in a):
        tras = True

if frente and tras:
    print("both")
elif frente:
    print("forward")
elif tras:
    print("backward")
else:
    print("fantasy")