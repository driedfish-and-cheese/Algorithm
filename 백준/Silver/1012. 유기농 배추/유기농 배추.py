import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline
DIRS = [(1,0),(-1,0),(0,1),(0,-1)]

n = int(input())

def dfs(i,j,N,M,grid,visited):
    visited[i][j] = True
    for di,dj in DIRS:
        ni,nj = i+di,j+dj
        if 0 <= ni < N and 0<= nj < M:
            if grid[ni][nj] == 1 and not visited[ni][nj]:
                dfs(ni,nj,N,M,grid,visited)
    
def solve(N,M,grid):
    visited = [[False]*M for _ in range(N)]
    count = 0
    for i in range(N):
        for j in range(M):
            if grid[i][j] == 1 and not visited[i][j]:
                dfs(i,j,N,M,grid,visited)
                count +=1
    return count

for _ in range(n):
    M,N,K = map(int,input().split())
    field = [[0]*M for _ in range(N)]
    for _ in range(K):
        x,y = map(int,input().split())
        field[y][x] = 1
    print(solve(N,M,field))
    