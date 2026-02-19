import sys
import heapq

input = sys.stdin.readline

h_minus = []
h_plus = []
n = int(input())
for _ in range(n):
    m = int(input())
    if(m < 0):
        heapq.heappush(h_minus,-m)
    elif(m>0):
        heapq.heappush(h_plus,m)
    else:
        if(len(h_plus)==0 and len(h_minus)==0):
            print(0)
        elif(len(h_plus)==0):
            print(-heapq.heappop(h_minus))
        elif(len(h_minus)==0):
            print(heapq.heappop(h_plus))
        else:
            if(abs(-h_minus[0])<=h_plus[0]):
                print(-heapq.heappop(h_minus))
            else:
                print(heapq.heappop(h_plus))
        
