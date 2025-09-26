def hanoi(n,src,via,dst):
    if n ==1:
        print(src,dst)
    else:
        hanoi(n-1,src,dst,via)
        hanoi(1,src,via,dst)
        hanoi(n-1,via,src,dst)

n = int(input())
src,via,dst = 1,2,3
sum = 2**n -1
if(n>20):
    print(sum)
else:
    print(sum)
    hanoi(n,src,via,dst)

