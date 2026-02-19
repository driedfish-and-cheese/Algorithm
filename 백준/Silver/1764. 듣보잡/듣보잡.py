import sys
input = sys.stdin.readline

n,m = map(int,input().split())
notSee = [input().strip() for _ in range(n)] 
notHear = [input().strip() for _ in range(m)]
notSee.sort(),notHear.sort()
notBoth = sorted(set(notSee)&set(notHear))
print(len(notBoth))
for i in range(len(notBoth)):
    print(notBoth[i])