package day3;

public class ContractEmployee extends Employee {

	
	protected double rate;
	protected double hours;
	
	public ContractEmployee()
	{
		
	}
	
	public ContractEmployee(int empid,String name,double rate,double hours)
	{
		super(empid,name);
		this.rate = rate;
		this.hours = hours;
	}
	public double calculateGross()
	{
		return rate*hours;
	}
}
