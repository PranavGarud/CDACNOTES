package day3;

public class DemoInterface {
	
	public static void main(String[]args)
	{
		TaxPayer payer1 = new SalariedEmployee(555,"ef",75000);
		TaxPayer payer2 = new Manager(754,"ege",78552,75462);
		TaxPayer payer3 = new Consultant(75,8500);
		
		Payroll payroll = new Payroll();
		payroll.displayTax(payer1);
		payroll.displayTax(payer2);
		payroll.displayTax(payer3);
	}
}
