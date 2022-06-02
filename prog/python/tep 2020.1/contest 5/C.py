r1, c1, r2, c2 = map(int, input().split())

res = []

if r1 == c1 == r2 == c2:
    print("0 0 0")

else:
    if r1 == r2 or c1 == c2:
        ro = 1
        res.append(ro)
    else:
        ro = 2
        res.append(ro)
    
    if (r1 + c1) % 2 != (r2 + c2) % 2:
        bi = 0
        res.append(bi)
    
    elif r1 - c1 == r2 - c2 or r1 + c1 == r2 + c2:
        bi = 1
        res.append(bi)
    else:
        bi = 2
        res.append(bi)
        
    #king
    king = max(abs(r1-r2),abs(c1-c2))
    res.append(king)
    
    
# rei se move igual um rook ou bisshop
# se a posição destino forma um trinagulo é mlehor mover como bishop
# na horizontal se move em abs(c1-c2) movimentos, e na vertical bs(r1-r2)
#movimento diagonal da o mesmo valor, caso esteja ja no caminho
# se precisa dos dois movimentos, epga o maior de cada no abs

print(*res, end = ' ')
        
    
