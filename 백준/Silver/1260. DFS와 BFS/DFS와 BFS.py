from collections import deque

n,m,v = map(int,input().split())
graph = [[]for _ in range(n+1)]
for i in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)
    
for i in range(1,n+1):
    graph[i].sort()
    
def bfs(v):
    queue = deque([v])
    visited = set()
    visited.add(v)
    result_b = []
    while queue:
        current = queue.popleft()
        result_b.append(current)
        for nv in graph[current]:
            if nv not in visited:
                visited.add(nv)
                queue.append(nv)
    return result_b

def dfs(v):
    visited_d[v] = True
    result.append(v)
    for nv in graph[v]:
        if not visited_d[nv]:
            dfs(nv)
visited_d = [False]*(n+1)
result = []
dfs(v)
print(*result)
print(*bfs(v))
