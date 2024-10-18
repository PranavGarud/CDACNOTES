

str1 = input("Enter Name,age,city,country :")
list1 = str1.split(",")
list1[1] = int(list1[1])
tuple1 = (list1[0],list1[1],(list1[2],list1[3]))
print(tuple1)
name,age,addr = tuple1
print("Name : ",name," Age : ",age," Address City : ",addr[0]," Country : ",addr[1])