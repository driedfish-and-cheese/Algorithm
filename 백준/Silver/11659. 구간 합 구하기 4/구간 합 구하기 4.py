import sys
input = sys.stdin.readline

n,m = map(int,input().split())
arr = input().split()
sum = 0
prefix = [0]*(n+1)
for i in range(n):
    prefix[i+1] = prefix[i]+int(arr[i]) 
for i in range(m):
    x,y = map(int,input().split())
    print(prefix[y]-prefix[x-1])