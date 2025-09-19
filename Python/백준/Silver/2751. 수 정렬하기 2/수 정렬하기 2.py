import sys

n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(n)]
s= sorted(arr)
print(*s,sep="\n")