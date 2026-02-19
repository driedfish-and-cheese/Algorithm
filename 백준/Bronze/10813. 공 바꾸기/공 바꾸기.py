n,m = map(int,input().split())
basket = [0]*(n)
for i in range(n):
    basket[i] = i+1
for i in range(m):
    x,y = map(int,input().split())
    x -= 1
    y -= 1
    basket[x],basket[y] = basket[y],basket[x]
print(*basket)
    