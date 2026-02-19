from collections import deque

def bfs(start,target):
    queue = deque()
    queue.append((start,0))
    
    visited = set()
    visited.add(start)
    
    while queue:
        current,dist = queue.popleft()
        if current == target:
            return dist
        
        for next in (current+1,current-1,current*2):
            if 0<= next and next<=100000 and next not in visited:
                visited.add(next)
                queue.append((next,dist+1))
                
start,target = map(int,input().split())
print(bfs(start,target))
    
