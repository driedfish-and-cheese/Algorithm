n = int(input())
stair = []
dp = [0]*n
for _ in range(n):
    stair.append(int(input()))

def solve(n,dp):
    if n == 1:
        print(stair[0])
        return
    if n == 2:
        print(stair[0]+stair[1])
        return
    dp[0] = stair[0]
    dp[1] = stair[0]+stair[1]
    dp[2] = max((stair[0]+stair[2]),(stair[1]+stair[2]))
    for i in range(3,n):
        dp[i] = max(dp[i-3]+stair[i-1]+stair[i],dp[i-2]+stair[i])
    print(dp[n-1])
solve(n,dp)

