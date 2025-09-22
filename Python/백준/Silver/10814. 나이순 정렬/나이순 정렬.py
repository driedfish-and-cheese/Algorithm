n = int(input())
pairs = [(int(a),b) for a,b in (input().split() for _ in range(n))]
pairs.sort(key = lambda x:(x[0]))
for i in range(n):
    print(*pairs[i])
