package day3;

public class SalesManager extends Manager {
	protected int incentive;
	
	public SalesManager(int empid,String name,double basic,double allowance, int incentive)
	{
		super(empid,name,basic,allowance);
		this.incentive = incentive;
	}
	
	public double calculateGross()
	{
		return super.calculateGross()+incentive;
	}
	
	public void showIncentive()
	{
		System.out.println("Incentive of the year : "+incentive);
	}
	
}
