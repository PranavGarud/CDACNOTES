# Write a program to generate and display the multiplication table of a given number up to 10.
# Input: Prompt the user to enter a number.
# Logic: Use a for loop to calculate and display the multiplication table for the number.
# Output: Display the multiplication table.

num = int(input("Enter Number for Table : "))
for i in range(1,11):
    print(f"{num} X {i} = {num*i} ")