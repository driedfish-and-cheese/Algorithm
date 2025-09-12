def solve(n):
    for i in range(1,n+1):
        arr=[int(x) for x in str(i)]
        d_sum = sum(arr)
        if i+d_sum == n:
            print(i)
            return
    print(0)   
        
n = int(input())
solve(n)
