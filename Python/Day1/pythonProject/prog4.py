#Console Interface
#input output from console and print statement formatting
iNum1 = input("Enter your First Number :")
iNum2 = input("Enter Your Second Number:")

#format value to 2 decimal places
print(iNum1,iNum2)
x = 2.33334544565
print(f"Number value : {x:.2f}")

print(iNum1+iNum2)
print(int(iNum1)+int(iNum2))

firstname= input("Enter First Name :")
lastname = input("Enter Last Name : ")
print(firstname +  lastname)
print(firstname,lastname)

#Format Priting
print('hi my first name is : {} my last name is : {}'.format(firstname,lastname))
print('hi my name is {lname} I am {fname} years old'.format(fname = firstname, lname= lastname))

print(f'hi my name is {firstname} {lastname}')

#using 'sep' Keyword

print("Hello", "world", sep=" ")
print("Hello", "world",sep="-")
print("Hello", "world",sep=", ")

#using 'end' keyword
print("Hello, world",end=" ")
print("How are you")
#
print("Line 1 :",end="\n\t")
print("Line2")
