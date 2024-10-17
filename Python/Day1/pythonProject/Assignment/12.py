#Build a calculator for +, -, * and / operations using if and else condition statements
Num1 = input("Enter Num1: ")
Num2 = input("Enter Num2 : ")
str1 = input("Enter Operations:")
Num1 =float(Num1)
Num2 = float(Num2)

if str1=="Add":
    print("Addition = ", Num1+Num2)
elif str1=="Sub":
    print("Subtraction = ", Num1-Num2)
elif str1=="Mul":
    print("Multiplication = ", Num1*Num2)
elif str1=="Div":
    print("Division = ", Num1/Num2)
else:
    print("Invalid input")
