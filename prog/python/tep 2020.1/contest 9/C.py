n, m = map(int, input().split())

grafo = [0]*n
star = {1,m}
bus = {1,2}
ring = {2}
for i in range(m):
    x , y = map(int, input().split())
    grafo[x-1] += 1
    grafo[y-1] += 1

setado = set(grafo)

if setado == bus:
    print("bus topology")
elif setado == ring:
    print("ring topology")

elif setado == star:
    print("star topology")

else:
    print("unknown topology")