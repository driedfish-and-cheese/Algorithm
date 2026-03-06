from itertools import combinations_with_replacement

n,m = map(int,input().split())
arr = list(map(int,input().split()))
arr = sorted(set(arr))
for i in combinations_with_replacement(arr,m):
    print(*i)
