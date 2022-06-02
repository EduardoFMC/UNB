n, P1, P2, P3, T1, T2 = map(int, input().split())

ans = 0
controle = []
for i in range(n):
    
    l, r = map(int, input().split())
    
    ans += (r-l)*P1
    
    controle.append(r)
    if i > 0:
        mi = l - controle[i-1]
        
        if mi <= T1:
            ans += mi*P1
            
        elif mi <= T1+T2:
            ans += P1*T1+(mi-T1)*P2
        else:
            ans += P1*T1+T2*P2+(mi-(T2+T1))*P3

print(ans)            
            
        