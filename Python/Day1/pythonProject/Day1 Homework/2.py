#Build a calculator for +, -, * and / operations using if and else condition statements
while True:
    num1 = int(input("Enter First Number = "))
    num2 = int(input("Enter Second Number = "))
    ope = input("Enter + For Addition \nEnter - For Subtraction \nEnter * for Multiplication \nEnter / for Division: \n")
    if ope == '+':
        print("Addition = ",num1 + num2)
    elif ope == '-':
        print("Subtraction = ",num1 + num2)
    elif ope == '*':
        print("Multiplication = ",num1 * num2)
    elif ope == '/':
        print("Division = ",num1 / num2)
    else:
        print("Invalid Input")
    flag = input("Enter yes to continue no to exit : ")
    if flag == "no":
        break