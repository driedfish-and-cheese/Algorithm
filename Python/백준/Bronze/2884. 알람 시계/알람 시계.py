def solve(h,m):
    if m>=45:
        m = m-45
    elif m<45:
        if h==0:
            h=23
            m = 60-(45-m)
        else:
            h = h-1
            m = 60-(45-m)
    print(h,m)
h,m = map(int,input().split())
solve(h,m)

