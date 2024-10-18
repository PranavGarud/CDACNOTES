num = input("Enter Values in ',' Format : ")
list1 = num.split(",")
for i in range(0,len(list1)):
    list1[i] = int(list1[i])

tuple1 = tuple(sorted(list1))
res = 0
for i in range(0,len(tuple1)):
    res = res+tuple1[i]

print("Sum = ",res)

print("Average = ",res/len(tuple1))

res = tuple1[1]
for i in range(0,len(tuple1)):
    if res < tuple1[i]:
        res = tuple1[i]
print("Maximum = ",res)

res = tuple1[1]
for i in range(0,len(tuple1)):
    if res > tuple1[i]:
        res = tuple1[i]

print("Minimun = ",res)

print("Length = ",len(tuple1))