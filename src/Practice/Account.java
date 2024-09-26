package Practice;

/*Develop a banking solution for ABC Bank

The bank offers savings, loan and current accounts

Account opening fees for the accounts are as follows:
1. Savings account - 500 rs
2. Loan account - 2000 rs
3. Current account - 1000 rs

Bank allows customer to withdraw money from their respective accounts provided

1. Only 3 transactions per day are allowed for savings account
2. Only 1 tranastion not more than 20000 per day allowed for current account
3. Once the loan is disbursed, customer can not withdraw any amount from the loan account

The banking application should allow user to
1. See balance in their account
2. Withdraw money from the account
3. See proccessing fees for their account*/
public class Account {
	public String name;
	public int userID;
	public double Balance;
	public Account(String name, int userID, double balance) {
		super();
		this.name = name;
		this.userID = userID;
		Balance = balance;
	}
	public void Procfees()
	{
		System.out.println("Account opening fees for the accounts are as follows:\r\n"
				+ "1. Savings account - 500 rs\r\n"
				+ "2. Loan account - 2000 rs\r\n"
				+ "3. Current account - 1000 rs");
	}
	@Override
	public String toString() {
		return "Name : " + name + "\nUserID : " + userID + "\nBalance : " + Balance;
	}
}