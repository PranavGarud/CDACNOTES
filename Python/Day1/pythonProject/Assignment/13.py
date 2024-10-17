# Assignment 13: Build a program that calculates the ticket price based on the age of the customer.
# Input: Prompt the user to enter their age.
# Logic:
# Use if-else statements to determine the ticket price based on age:
# Under 5 years: Free
# 5 to 12 years: Rs 5
# 13 to 60 years: Rs 10
# Over 60 years: Rs 7
# Use nested if-else statements if necessary for more granular control.
# Output: Display the ticket price based on the user's age

age = input("Enter Age of Customer : ")
age = int(age)

if age>0 and age<5:
    print("Free")
elif age>=5 and age<=12:
    print("Rs 5")
elif age>=12 and age<=60:
    print("Rs 10")
elif age>60:
    print("Rs 7")
else:
    print("Invalid Input")