#Create a tuple
tuple_int_example = (1,2,3)
tuple_str_example = ("a","b","c")
my_tuple = (1,2.2,3,'abc',True)
empty_tuple = ()
single_element_tuple = (5,)
print(tuple_int_example)
print(tuple_str_example)
print(my_tuple)
print(empty_tuple)
print(single_element_tuple)
print(my_tuple[0],my_tuple[-1])
# # # Tuple Unpacking
my_tuple = (10, 20, 30)
item1, item2, item3 = my_tuple
print(item1)
print(item2)
print(item3)

# # # Concatenation
tuple1 = (1, 2, 3)
tuple2 = (4, 5, 6)
combined_tuple = tuple1 + tuple2
print(combined_tuple)

# # # Finding length
my_tuple = (1, 2, 3, 4)
length = len(my_tuple)
print(length)

# # # Checking Membershiop
my_tuple = (1, 2, 3)
is_present = 2 in my_tuple
print(is_present)
is_present = 5 in my_tuple
print(is_present)

# #Connting Occurrences
my_tuple = (1,2,3,2,4)
count_of_twos = my_tuple.count(5)
print(count_of_twos)

# # # Finding Index
my_tuple = (1,2,3,4)
index_of_three = my_tuple.index(3)
print(index_of_three)

# # #Repetition
my_tuple = (1,2,3)
repeated_tuple = my_tuple*3
print(repeated_tuple)
print(my_tuple)

# # #Sorting a tuple
my_tuple = (2,5,7,3,4,1)
my_list = sorted(my_tuple)
print(my_list)

# # #Converting List to Tuple and Vice Versa
my_tuple = tuple(my_list) #Output : (1,2,3)
print(my_tuple)
my_new_list = list(my_tuple)
print(my_new_list)

# # # Slicing
my_tuple = (2,5,7,3,4,1)
slice_tuple = my_tuple[1:-1]
print(slice_tuple)
slice_tuple = my_tuple[::2]
print(slice_tuple)
slice_tuple = my_tuple[::-1]
print(slice_tuple)

# # # Nested Tuples
nested_tuple = ((1,2),(3,4),(5,6))
first_tuple = nested_tuple[0]
print(first_tuple)

# # # Immutability
# my_tuple = (1,2,3)
# my_tuple[0] = 10