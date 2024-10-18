# #Write a program to calculate the sum of the digits of a given positive integer.
# Input: Prompt the user to enter a positive integer.
# Logic: Use a for loop to iterate through each digit of the number and calculate the sum.
# Output: Display the sum of the digits


#num1 = int(input("Enter Number :"))
#sum =0
# while num1 >0:
#     sum = num1%10
#     num1 //= num1
# else:
#     print("Addition = ",sum)

# for i in range(n+1):
#     print(num1)
#     sum = num1%10+ sum
#     if num1==0:
#         break
#     num1 //=num1
#     print(num1)
#
#
# print(sum)
sum = 0
num = input()
for i in num:
    sum += int(i)

print(sum)