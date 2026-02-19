import sys
import heapq

input = sys.stdin.readline

h = []
n = int(input())
for _ in range(n):
    m = int(input())
    if(m != 0):
        heapq.heappush(h,m)
    else:
        if(len(h)==0):
            print(0)
        else:
            print(heapq.heappop(h))   
        
