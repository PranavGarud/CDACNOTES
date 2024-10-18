import math

def is_prime(n):
    if n <= 1:
        return False

    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False

    return True

num = int(input("Enter a number : "))
list1 = []
for i in range(1,num+1):
    if is_prime(i):
        list1.insert(0,i)

list1.sort()
print(list1)
