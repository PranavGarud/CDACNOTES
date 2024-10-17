#18
count = 0
while True:
    num1 = int(input("Guess the number : "))
    if num1 == 6 :
        print("Win the Game")
        break
    count += 1
    if count == 5 :
        print("Out of Chances")
        break
    print("Bad Luck")