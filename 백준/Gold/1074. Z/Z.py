# import sys
# input = sys.stdin.readline

# def solve(arr,size,x,y,start = 0):
#     if size == 1 :
#         arr[x][y] = start
#         return start + 1
#     half = size//2
#     start = solve(arr,half,x,y,start)
#     start = solve(arr,half,x,y+half,start)
#     start = solve(arr,half,x+half,y,start)
#     start = solve(arr,half,x+half,y+half,start)
#     return start
        
        

# N,r,c = map(int,input().split())
# arr = [[0]*(2**N) for _ in range(2**N)]
# size = 2**N
# solve(arr,size,0,0,0)
# print(arr[r][c])

N,r,c = map(int,input().split())
ans = 0
for i in range(N-1,-1,-1):
    br = (r>>i)&1
    bc = (c>>i)&1
    ans += (2*br+bc)*(4**i)
    
print(ans)
    
    