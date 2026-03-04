from itertools import combinations_with_replacement

n,m = map(int,input().split())

arr = list(range(1,n+1))

for i in combinations_with_replacement(arr,m):
    print(*i)
       