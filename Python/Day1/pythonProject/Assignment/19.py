# Develop a program that simulates an ATM withdrawal process.
# Input: Prompt the user to enter their account balance and the amount they wish to withdraw.
# Logic:
# Check if the withdrawal amount is greater than the account balance. If so, display an error message.
# If the withdrawal amount is valid, subtract it from the balance.
# Ensure the withdrawal amount is a multiple of 10 (as ATMs typically dispense money in multiples of 10).
# Output:
# Display the remaining balance if the withdrawal is successful.
# If not, display an appropriate error message (e.g., "Insufficient balance" or "Amount must be a multiple of 10").
# Check if user wishes to withdraw more money, else exit

acc_bal = int(input("Enter The Account Balance: "))
while True:
    w_Amount = int(input("Enter Withdraw Amount: "))
    if w_Amount %10 != 0:
        print("Amount  Not Multiple of 10")
    elif w_Amount > acc_bal:
        print("Insufficient Funds")
    else:
        acc_bal -= w_Amount
        print("Display Balance: ", acc_bal)
    num = input("To Exit Enter Exit : " )
    if num=="Exit":
        break



