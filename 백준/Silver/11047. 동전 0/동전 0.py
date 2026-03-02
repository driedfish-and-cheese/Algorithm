import sys
input = sys.stdin.readline

n,m = map(int,input().split())
arr = [0]*n
for i in range(n):
    arr[i] = int(input())
cnt=0
for i in range(n-1,-1,-1):
    cnt += m//arr[i]
    m = m-(m//arr[i])*arr[i]
print(cnt)
