import sys
input = sys.stdin.readline

n,m=map(int,input().split())
A = list(map(int,input().split()))

lo,hi = 0,max(A)
ans = 0
while lo <= hi:
    mid = (lo + hi) //2
    total =0 
    for i in A:
        if i > mid:
            total += i-mid
    if total >= m:
        ans = mid
        lo = mid +1
    else:
        hi = mid-1
        
print(ans)
