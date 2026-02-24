n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# Please write your code here.

def equal():
    for e1, e2 in zip(a,b) :
        if e1 != e2:
            return False
    return True


a.sort()
b.sort()

if equal():
    print("Yes")
else:
    print("No")