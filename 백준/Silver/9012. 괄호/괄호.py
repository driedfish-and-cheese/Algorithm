n = int(input())
stack_1 = []
stack_2 = []

for _ in range(n):
    ps = input()
    for i in range(len(ps)):
        if(ps[i] == '('):
            stack_1.append(ps[i])
            #print("stack_1.append: ",stack_1)
        if(ps[i] == ')' and stack_1):
            stack_1.pop()
            #print("stack_1.pop: ",stack_1)
        elif(len(stack_1) == 0):
            stack_2.append(ps)
            #print("stack_2: ",stack_2)
    if(len(stack_1)==0 and len(stack_2)==0):
        print("YES")
    else:
        print("NO")
    stack_1 = []
    stack_2 = []
        
        
        
    
