n,m = map(int,input().split())

atual = 1
resto = m

while resto != 0:
    diferenca = min(atual, resto)
    resto -= diferenca
    atual += 1
 
if atual > 1:
    resto = n - atual
else:
    resto = n
    
print(max(0,n-m*2),resto)