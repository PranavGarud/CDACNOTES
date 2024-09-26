package Bankassignment_1;

public class LoanAcc extends Account{
	public LoanAcc(String name,int accno,double balance) {
		super(name,accno,balance);
		}
	public void WithDraw(double acount) {
		System.out.println("Amount can not be withdarw");
	}
	public void print() {
		System.out.println("User Name: "+name+"\nAccount No: "+accno+"\nBalance: "+balance);

}}
