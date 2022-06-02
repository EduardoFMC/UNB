testes = int(input())

for i in range(testes):
    
    pessoas, correntes = map(int, input().split())
    
    pesos = list(map(int, input().split()))
    soma = sum(pesos)
    
    if pessoas > correntes:
        print(-1)
    
    if pessoas == 2:
        print(-1)
    
    if pessoas == correntes:
        print(soma * 2)
    
    