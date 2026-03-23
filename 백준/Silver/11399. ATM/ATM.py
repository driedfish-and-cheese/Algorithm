n = int(input())
arr = list(map(int,input().split()))
arr = sorted(arr)
sum = 0
ans = 0
for i in range(n):
    sum = sum + arr[i]
    ans += sum
print(ans)