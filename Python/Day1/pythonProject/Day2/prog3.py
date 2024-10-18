#Creating a list
my_list = [5,6,1,7,9,9,7]
print(my_list)
empty_list = []
print(empty_list)
mixed_list = [1,"hello",3.14,True]
print(mixed_list)

#Accessing Elements
print(my_list)
first_element = my_list[0]
last_element = my_list[-1]
print(first_element)
print(last_element)

# Modifying Elements
my_list[0] = 10
print(my_list)

#Adding Elements
my_list.append(6) # Adds 6 at the end
print(my_list) #Output : [1, 2, 3, 4, 5, 6]
#
my_list.insert(1,15) # Inserts 15 at 1
print(my_list) #Output : [1,15,2,3,4,5]

my_list.extend(["string",8,True]) # Extends the list by adding
print(my_list)

##
removed_element = my_list.poop(1) # Removes and returns the element
print(removed_element) #Output: 2
print(my_list) # Output: [1, 4, 5]

my_list.remove(9) # Removes the first occurence of 9
print(my_list) # Output:[

#Finding index of Elements
print("Finding index of Elements")
print(my_list)
index_of_seven = my_list.index(7)
print(index_of_seven)

#Find no of occurences
occurence_count = my_list.count(7)
print(occurence_count)

# # Sorting a List
my_list = [5, 2, 9, 1]
my_list.sort()
print(my_list)

# # #Reversing a list
my_list.reverse()
print(my_list)

# # Copying a List
my_list_copy = my_list.copy()
print(my_list_copy)

# # Clearing a List
my_list.clear()
print(my_list)

# Joining Lists
list1 = [1,2,3]
list2 = [4,5]
combined_list = list1+list2
print(combined_list)

# Slicing
my_list = [1,2,3,4,5,6,7]
sub_list = my_list[1:3]
print(sub_list)

# # # Nested Lists
nested_list = [[1,2],[3,4],[5,6]]
print(nested_list)
print(nested_list[0][0])