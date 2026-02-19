n,m = map(int,input().split())
list = [None]*(n+1)
dict = {}
for i in range(1,n+1):
    name = input()
    list[i] = name
    dict[name] = i
for i in range(m):
    x = input()
    if x.isdigit():
        print(list[int(x)])
    else:
        print(dict[x])