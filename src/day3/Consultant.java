package day3;

public class Consultant implements TaxPayer,Printable {

	private int hrs;
	private int rate;
	
	public Consultant(int hrs,int rate)
	{
		this.hrs = hrs;
		this.rate = rate;
	}
	
	public int calculateInvoice()
	{
		return hrs*rate;
	}
	
	public double calculateTax()
	{
		return calculateInvoice() * 0.1;
	}
	public void print()
	{
		System.out.println("Printing Consultant Data ");
		System.out.println("Worked for : "+hrs+"Per hour remuneration : "+rate);
	}
}
