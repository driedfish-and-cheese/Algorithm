def solve(n):
    path = []
    res = []
    cnt = 0
    def dfs(rem):
        if(rem == 0):
            res.append(path.copy())
            return
        for step in (1,2,3):
            if(rem-step >=0 ):
                path.append(step)
                dfs(rem-step)
                path.pop()
            
    dfs(n)
    return res

n = int(input())   
for i in range(n):
    m = int(input())         
    print(len(solve(m)))
    
