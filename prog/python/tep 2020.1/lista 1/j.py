from pythonds.graphs import PriorityQueue, Graph, Vertex

def dijkstra(aGraph,start):
    pq = PriorityQueue()
    start.setDistance(0)
    pq.buildHeap([(v.getDistance(),v) for v in aGraph])
    while not pq.isEmpty():
        currentVert = pq.delMin()
        for nextVert in currentVert.getConnections():
            newDist = currentVert.getDistance() \
                    + currentVert.getWeight(nextVert)
            if newDist < nextVert.getDistance():
                nextVert.setDistance( newDist )
                nextVert.setPred(currentVert)
                pq.decreaseKey(nextVert,newDist)

n, m = map(int, input().split())
 
G = [[] for i in range(n+1)]
 
for i in range(m):
    u, v, w = map(int, input().split())   
    G[u].append((v, 2*w))
    G[v].append((u, 2*w))


    