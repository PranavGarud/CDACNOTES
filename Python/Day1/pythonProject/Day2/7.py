size = int(input("Enter Length of List : "))
list1 = []
for i in range(1,size+1):
    num = int(input("Enter Number : "))
    list1.append(num)
posit = int(input("Enter number of positions to rotate right : "))
posit = list1[-1]-posit
sub_list1 = list1[0:posit]
sub_list2 = list1[posit:list1[-1]]
list1 = sub_list2+sub_list1
print(list1)
