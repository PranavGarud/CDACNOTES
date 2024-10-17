#Objective : Calculate saving of a person
#- Input:
#           -Prompt the user to either their monthly income (as a float)
#           -Prompt the user to their monthly expenses(as a float), which include rent, groceries,utilities and other expenses
#- Calculation:
#           -Calculate the total savings by subtracting the total expences from the income
#           -Calculate the percentage of income saved and the percentage of income spent
#-Output:
#           -Display the total saving
#           -Display the percentage of income saved and spent, formatted to two decimal point

mon_income = input("Enter Montly Income:")
mon_exp = input("Enter Monthly Expences:")

mon_income = float(mon_income)
mon_exp = float(mon_exp)

savings = mon_income-mon_exp
per_savings = (savings/mon_income)*100
per_spent   = (mon_exp/mon_income)*100

print("Total Savings : ",savings )
print("% of income saved : ",round((per_savings),2))
print("% of income spent : ",round((per_spent),2))