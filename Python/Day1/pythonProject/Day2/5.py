from contextlib import nullcontext


list1 = []
while True:

     str1=int(input("Enter Choices: "))
     match str1:
         case 1:
             str = input("Enter Task : ")
             list1.insert(0,str)
         case 2:
             str = input("Enter Task to Remove : ")
             list1.remove(str)
         case 3:
             list1.sort()
             print(list1)
         case 4:
             break
         case _:
             print("Invalid Input")
