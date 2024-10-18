# Create a simple guessing game where the user has to guess a secret number. The game continues
# until the user guesses the correct number, at which point the loop should terminate using break.
# This should continue until the user gets 10 chances.

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