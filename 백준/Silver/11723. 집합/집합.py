import sys
input = sys.stdin.readline

n = int(input())
arr = set()
for i in range(n):
    command= input().split()
    if(command[0] == 'add'):
        arr.add(int(command[1]))
    if(command[0] == 'remove'):
        arr.discard(int(command[1]))
    if(command[0] == 'check'):
        if(int(command[1]) in arr):
            print(1)
        else:
            print(0)
    if(command[0] == 'toggle'):
        if(int(command[1]) in arr):
            arr.remove(int(command[1]))
        else:
            arr.add(int(command[1]))
    if(command[0] == 'all'):
        arr = set(range(1,21))
    if(command[0] == 'empty'):
        arr = set()
        
