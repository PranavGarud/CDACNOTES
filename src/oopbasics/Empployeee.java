package oopbasics;

public abstract class Empployeee {
	
	protected int empid;
	protected String name;
	
		public Empployeee(int empid,String name) {
			this.empid = empid;
			this.name = name;
		}
		
		public abstract double calculateGross();

		@Override
		public String toString() {
			return "Empployeee [empid=" + empid + ", name=" + name + "]";
		}
		
		

}
