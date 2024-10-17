#Factorial of a number: using for loop, while loop

num1 = input("Enter a Number : ")
num1 = int(num1)
count = 1
factorialRes = 1
while count <= num1:
      factorialRes = factorialRes*count
      count = count+1
else:
    print(f"Factorial of {num1} is {factorialRes}")

count =1
factorialRes = 1
for count in range(count,num1+1):
    factorialRes = factorialRes*count
else:
    print(f"Factorial of {num1} is {factorialRes}")