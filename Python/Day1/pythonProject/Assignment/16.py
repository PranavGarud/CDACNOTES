#16
from traceback import print_tb

num1 = int(input("Enter Number :"))
sum =0
# while num1 >0:
#     sum = num1%10
#     num1 //= num1
# else:
#     print("Addition = ",sum)

for i in range(True):
    print(num1)
    sum = num1%10+ sum
    if num1==0:
        break
    num1 //=num1
    print(num1)


print(sum)