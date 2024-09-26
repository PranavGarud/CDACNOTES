package oopbasics;

public class SalariedEmployeee extends Empployeee {
		protected double basic;
		
		
	public SalariedEmployeee (int empid , String name , double basic) {
		super(empid,name);
		this.basic = basic;
	}


	@Override
	public double calculateGross() {
		
		double hra = basic*0.4;
		double allow = basic*2;
	
		 
		// TODO Auto-generated method stub
		return basic+hra+allow;
	}
	public double calculateNet() {
		double gross = calculateGross();
		double tax = calculateTax();
		return gross-tax;
	}
	public double calculateTax() {
		double gross = calculateGross();
		return gross*0.3;
	}
	
		
	
	

}
