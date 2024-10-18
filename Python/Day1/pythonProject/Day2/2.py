flag = 1
while flag == 1:
    Num1 = input("Enter Num1: ")
    Num2 = input("Enter Num2 : ")
    str1 = input("Enter Operations:")
    Num1 =float(Num1)
    Num2 = float(Num2)

    match str1:
        case "Add":
            print("Addition = ", Num1 + Num2)
        case "Sub":
            print("Subtraction = ", Num1 - Num2)
        case "Mul":
            print("Multiplication = ", Num1 * Num2)
        case "Div":
            print("Division = ", Num1 / Num2)
        case _:
            print("Invalid input")
    flag = int(input("Want to do another Operation Then Enter 1 \n To Exit Enter 0  : "))
