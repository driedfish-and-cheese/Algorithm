import sys
import heapq
from collections import defaultdict

input = sys.stdin.readline

N = int(input())

for _ in range(N):
    x = int(input())
    h_max = []
    h_min = []
    cnt = defaultdict(int)
    def clean_max():
        while h_max and cnt[-h_max[0]] == 0:
            heapq.heappop(h_max)
    def clean_min():
        while h_min and cnt[h_min[0]] == 0:
            heapq.heappop(h_min)
    for _ in range(x):
        command,n = map(str,input().split())
        number = int(n)
        if(command == "I"):
            heapq.heappush(h_min,number)
            heapq.heappush(h_max,-number)
            cnt[number] += 1
        elif(command == "D"):
            if(number == 1):
                clean_max()
                if h_max:
                    d = -heapq.heappop(h_max)     
                    cnt[d] -= 1
               
            elif(number == -1):
                clean_min()
                if h_min:
                    v = heapq.heappop(h_min)
                    cnt[v] -= 1
    clean_min()
    clean_max()
    if not h_max or not h_min:
        print("EMPTY")
    else:
        print(-h_max[0],h_min[0])
                
