# Write a program that evaluates the strength of a user's password based on specific criteria
# Input: Prompt the user to enter a password.
# Logic: Evaluate the password based on the following criteria:
# Length of at least 8 characters.
# Contains both uppercase and lowercase letters.
# Includes at least one numeric digit.
# Includes at least one special character (e.g., !, @, #, $, etc.).
# Use nested if-else statements to check each criterion and determine the strength of the password.
# Output:
# Display one of the following messages based on the criteria met:
# "Weak" if the password meets only one criterion.
# "Moderate" if the password meets two or three criteria.
# "Strong" if the password meets all four criteria.

passwd = input("Enter Password : ")
criterion = 0;
if len(passwd) > 8:
    criterion = criterion+1;

flag1 = any(char.isupper() for char in passwd)
flag2 = any(char.islower() for char in passwd)

if flag1 and flag2:
    criterion = criterion + 1

flag1 = any(char.isdigit() for char in passwd)
if flag1:
    criterion += 1

list1 = ["!", "@", "#", "$","_","&","?"]
flag1 = any(char in list1 for char in passwd)
if flag1:
    criterion += 1

criterion = int(criterion)


if criterion <= 4:
    if criterion<=3:
        if criterion<=1:
            print("Weak Password")
        else:
            print("Moderate Password")
    else:
        print("Strong Password")




