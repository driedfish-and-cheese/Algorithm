def solve(x):
    if ((x%4==0 and x%100 !=0) or x%400==0):
        print(1)
    else:
        print(0)
        
n = int(input())
solve(n)