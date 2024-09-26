package day3;
public class SalariedEmployee extends Employee implements TaxPayer{

	protected double basic;
	
	public SalariedEmployee(int empid,String name, double basic)
	{
		super(empid,name);
		this.basic = basic;
	}
	
	public double calculateGross()
	{
		double hra = basic*0.4;
		double da = basic*0.12;
		return basic+hra+da;
	}
	public final double calculateNet()
	{
		double gross = calculateGross();
		double tax = calculateTax();
		return gross - tax;
	}
	public double calculateTax()
	{
		double gross = calculateGross();
		return gross*0.2;
	}

}
