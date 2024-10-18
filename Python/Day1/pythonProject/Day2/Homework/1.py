#  Write code to print a pyramid of stars in ascending order. Accept number of rows from user.
# Sample output:

num = int(input("Enter Number of Rows : "))

for i in range (0,num):
    for j in range(i,num):
        print("",end= " ")
    for k in range(0,i+1):
        print("*",end="")
    for l in range(0,i):
        print("*",end="")
    print()
