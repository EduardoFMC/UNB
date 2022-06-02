from collections import defaultdict

class Graph:
 
    def __init__(self):
 
        self.graph = defaultdict(list)
 
    def addEdge(self, u, v):
        self.graph[u].append(v)
        
visited = [] 
fila = []    

def bfs(visited, graph, node):
  visited.append(node)
  fila.append(node)

  while fila:
    s = fila.pop(0) 
    print (s, end = " ") 

    for neighbour in graph[s]:
      if neighbour not in visited:
        visited.append(neighbour)
        fila.append(neighbour)

n, s = input().split()

n = int(n)
s = int(s)

track_a = input().split()
track_b = input().split()

grafo = Graph()

i = 0
while True:
    
    if i == len(track_a) - 1:
        break
    
    for i in track_a:
        if 
    
    if track_b[i] == "1" and track_b[i+1] == "1":
        grafo.addEdge(str(i + 1), str(i))
        
    i += 1

bfs(visited, grafo, str(s - 1))
    


        



