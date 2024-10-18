str1 = input("Enter 1st String :")
str2 = input("Enter 2nd String :")

str1 = str1.lower()
str2 = str2.lower()

str1 = sorted(str1)
str2 = sorted(str2)

if str1 == str2:
    print("Strings are Anagrams")
else:
    print("Not an Anagram")