#  Create a calculator for performing addition, subtraction, division, multiplication operations
#  using match-case.
# Input :
# Ask user what operation needs to be performed.
# Ask user if next operation needs to be performed. Based on the answer repeat same steps or exit.

while True:
    num1 = int(input("Enter First Number = "))
    num2 = int(input("Enter Second Number = "))
    ope = input("Enter + For Addition \nEnter - For Subtraction \nEnter * for Multiplication \nEnter / for Division: \n")
    match ope:
        case '+':
            print("Addition = ",num1 + num2)
        case '-':
            print("Subtraction = ",num1 - num2)
        case '*':
            print("Multiplication = ",num1 * num2)
        case '/':
            print("Division = ",num1 / num2)
        case _:
            print("Invalid Input")
    flag = input("Enter yes to continue no to exit : ")
    if flag == "no":
        break