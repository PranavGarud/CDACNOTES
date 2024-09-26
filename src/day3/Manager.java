package day3;

public class Manager extends SalariedEmployee {
	protected double allowance;
	public Manager(int empid,String name, double basic,double allowance)
	{
		super(empid,name,basic);
		this.allowance = allowance;
	}
	
	@Override //Method calculateGross is modified
	
	public double calculateGross()
	{
		/*double hra = basic*0.4;
		double da = basic*0.12;
		return basic+hra+da+allowance;*/
		return super.calculateGross()+allowance;
	}
	
	public double calculateTax()
	{
		double gross = calculateGross();
		return gross*0.2;
	}
}
