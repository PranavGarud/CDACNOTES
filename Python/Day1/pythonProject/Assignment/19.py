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



