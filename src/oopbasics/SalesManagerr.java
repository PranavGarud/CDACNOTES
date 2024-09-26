package oopbasics;

public class SalesManagerr extends Managerr {
	protected double incentives;
	
	public SalesManagerr(int empid, String name,double basic,double allowance,double incentives) {
		super(empid,name,basic,allowance);
		this.incentives = incentives;
	}
	public double calculateGross() {
		double gross = basic+allowance;
		return gross*5;
		
	}
		
	


}
