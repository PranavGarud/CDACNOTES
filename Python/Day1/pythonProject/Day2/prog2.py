#
single_quotes = 'Hi there single quotes'
double_quotes = "Hi there double quotes"
triple_quotes = '''Hi there triple quotes'''

print(type(single_quotes))
print(type(double_quotes))
print(type(triple_quotes))

escape_sequence = 'hi weather is \'good\'!\t have a good \nday!!'
print(escape_sequence)


#String Operations
str1 = "Quick brown fox"
str2 = "jumps over laxy dog"

#-----------------------------------------------

#Concatenation
result = str1+str2
print("Concatenatded strings are : ",result)
#---------------------------------------------------------
# Repetition - repeat concatenated string thrice
repititionResult = result * 3
print("Repeated strings are : ",repititionResult)
#--------------------------------------------------#
#Length Calculation
Length = len(result)
print("Length of string is : ",Length)
#--------------------------------------------------#
#Strip (Trimming Whitespace)
str1 = "     abcde"+"       "
print(str1)
print(len(str1))
stripped_string = str1.strip()
print(stripped_string)
print("Length Without Whitespace",len(stripped_string))

str1 = "     abcde"+"       "
print(str1)
str1 = str1.lstrip(" ")
print(str1)
print(len(str1))

#Example string with characters to be stripped
text = "---***Hello World***---"
#Using lstrip to remove characteres from the left
left_stripped = text.lstrip("-*")
print("Left stripped:",left_stripped)

#Using rstrip to remove characters from the right
right_stripped = text.rstrip("-*")
print("Right Stripped:",right_stripped)

#Using strip to remove from both sides
both_stipped = text.strip("-*")
print("Both sides Stripped:",both_stipped)

#-----------------------------#
#Find and Replace
result = result +"abc"+"abc"+"abc"
print(result)
position = result.find("abc")
print(position)
new_string = result.replace("abc","ABC",2)
print(new_string)

#-----------------------------------------#
#String Membership
result = "hello world"
member = "worlds" in result
print(member)

#------------------------------------------------#
#String Comparison
str1 = "hello world!"
str2 = "hello world!"
resultCompare = str1 == str2
print(resultCompare)

#-----------------------------------------------#
#Case Conversion
result = "ABCabc"
print(result.lower())
print(result.upper())
print(result.title())

#----------------------------------------------#

result = "ABCDEFGH"
# # Indexing
firstChar = result[0]
lastChar = result[-1]
secondChar = result[1]
print(firstChar)
print(lastChar)
print(secondChar)

#--------------------------------------------#
#Slicing
print(result)
substring = result[0:4]
print(substring)
substring = result[:4]
print(substring)
substring = result[4:]
print(substring)
substring = result[:]
print(substring)
substring = result[::-1]
print(substring)

#---------------------------------------------#
#Splitting
resConcatenate = "abcd"+","+"efgh"
print(resConcatenate)
print(type(resConcatenate))
resSplit = resConcatenate.split(",")
print(type(resSplit))
print(resSplit)

#---------------------------------------------#
str = "start"
str = sorted(str)
str2 = "restart"
str2 = sorted(str2)
print(str,"\n",str2)

#Joining 
fruits = ["apple", "Banana" ,"Cherry"]
result = ",".join(fruits)
print(result)