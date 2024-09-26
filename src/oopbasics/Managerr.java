package oopbasics;

public class Managerr extends SalariedEmployeee {
	protected double allowance;
	public Managerr( int empid,String name, double basic,double allowance) {
		super(empid,name,basic);
		this.allowance = allowance;
		
	}
		public double calculateGross() {
			return super.calculateGross()+allowance;
		}
		
		public double calculateTax(){
			double gross = calculateGross();
			return gross*0.8;
		}

}
