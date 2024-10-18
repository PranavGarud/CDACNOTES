str1 = input("Enter String")

str1 = str1.lower()
str1 = str1.strip(" ")

if str1 == str1[::-1]:
    print("String is Palidrome")
else:
    print("Not a Palidrome")