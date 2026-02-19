n,m = map(int,input().split())
INF = 10**9
dist = [[INF]*(n+1) for _ in range(n+1)]
for i in range(n+1):
    dist[i][i]=0
for i in range(m):
    x,y = map(int,input().split())
    dist[x][y]=1
    dist[y][x]=1
for k in range(1,n+1):
    for i in range(1,n+1):
        for j in range(1,n+1):
            dist[i][j] = min(dist[i][j],dist[i][k]+dist[k][j])
            
best_node = 0
best_sum = INF

for i in range(1,n+1):
    s = 0
    flag = True
    for j in range(1,n+1):
        if dist[i][j] >= INF:
            flag = False
            break
        s += dist[i][j]
    if flag and s < best_sum:
        best_sum = s
        best_node = i
print(best_node)