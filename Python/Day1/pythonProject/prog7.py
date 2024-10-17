# break with for loop
from logging.config import stopListening

for num in range(1,10):
    if num == 5:
        break
    if num == 3:
        continue
    print(num)

# While loop break and continue
number = 0
while number < 10:
    number += 1 # Increment the number by 1
    #Skip even numbers
    if number % 2 ==0:
        continue #Skip the rest of the loop for this iteration
    #stop the loop if number is 7
    if number == 7:
        print("Number 7 encountered. Stopped the loop.")
        break   #Exit the loop
    #Print the current number
    print(f"Current Number : {number}")


