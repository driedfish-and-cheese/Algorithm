
zero = [0]*41
one = [0]*41
zero[0]=1
one[0]=0
zero[1]=0
one[1]=1

for n in range(2,41):
    zero[n] = zero[n-1]+zero[n-2]
    one[n] = one[n-1]+one[n-2]

    
N = int(input())
for _ in range(N):
    M = int(input())
    print(zero[M],one[M])
