import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())
graph = [[] for _ in range(n+1)]
parent = [0]*(n+1)
parent[1]=1
for _ in range(n-1):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(node):
    for next in graph[node]:
        if(parent[next] == 0):      
            parent[next] = node
            dfs(next)
dfs(1)

for i in range(2,n+1):
    print(parent[i])