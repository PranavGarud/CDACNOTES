# Assignment 1: Objective: Create a program that converts inches to feet, meters and centimeters and continue until the user wishes to
# Input:
# Prompt the user to enter a value (float) and the unit of measurement (e.g. inches).
# Prompt the user to select the target unit for conversion
# Prompt the user to press ‘Yes’ or ‘No’ to repeat
# Calculation:
# Convert the input value to the target unit using appropriate conversion factors.
# Use typecasting where necessary to handle different types of input.
# Use a while loop to repeat
# Use break statement to stop calculations one user enters ‘No’
# Output:
# Display the converted value along with its unit.
# Continue until the user presses No.
# Conversion Options:
# Inches to feet, meters, and centimeters.

while True:
    num = float(input("Enter Value in inches to Convert :"))
    operation = input("Convert to feet, meters or centimeters\n Enter measurement ")

    match operation:
        case "feet":
            res = num/12
            print(f"{num} inches = {res} feets ")
        case "centimeters":
            res = num * 2.54
            print(f"{num} inches = {res} centimeters ")
        case "meter":
            res = num * 0.0254
            print(f"{num} inches = {res} meters ")
        case "_":
            print("Invalid Input Enter valid Measurements")

    flag = input("Enter Yes to Continue and No to exit")
    if flag == "No":
        break