#while loop for < condition
iNum = 2
while iNum <= 10:
    print(iNum)
    iNum += 1
else:
    print("Number in rage 2 - 10 printed")

#while loop - Boolean
iCount = 1
while(True):
    print(iCount)
    iCount+=1
    if(iCount == 10):
        break
else:
    print("Number in rage 1 - 9 printed")

#Looping using range()
print("Looping using range(1,10)")
for iNum in range(1,10):
    print(iNum)
#Looping using range()
print("Looping using range(10)")
for iNum in range(10):
    print(iNum)

#Looping on Strings
strName = "CDAC"
for strChar in strName:
    print(strChar)
else:
    print("OUt of the Loop")

# Nested for Loops
for i in range(3,48):
    for j in range(1,4):
        print(f"i={i}, j={j}")