s = str(input())

vogais = ["A", "O", "Y", "E", "U", "I", "a", "o", "y", "e", "u", "i"]
lista = []

for x in s:
    if x in vogais:
        s.replace(x , "")
    else:
        x = "." + x.lower()
        lista.append(x)
        

print("".join(lista))
    
