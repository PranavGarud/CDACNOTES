# Assignment 14: Create a program that determines whether a given year is a leap year.
# Input: Prompt the user to enter a year (integer).
# Logic: A year is a leap year if: It is divisible by 4, and It is not divisible by 100 unless it is also divisible by 400. Use nested if-else statements to implement this logic.
# Output: Display whether the year is a leap year or not

year = input("Enter Year : ")
year = int(year)

if year % 4 ==0:
    if year %100 != 0:
        print("It is a Leap Year")
    elif year%400 == 0:
        print("It is a Leap Year")
    else:
        print("Not a Leap Year")
else:
    print("Not a Leap Year")