from collections import deque
cnt = 0
def bfs(graph,n):
    global cnt
    visited = [False]*(n+1)
    q = deque([1])
    visited[1] = True
    while q:
        v = q.popleft()
        for nv in graph[v]:
            if not visited[nv]:
                visited[nv] = True
                q.append(nv)
                cnt += 1
    return cnt
    


n = int(input())
m = int(input())
graph = [[] for _ in range(n+1)]
for i in range(m):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
bfs(graph,n)
print(cnt)
    