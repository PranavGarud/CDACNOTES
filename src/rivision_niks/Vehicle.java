package rivision_niks;

public abstract class Vehicle{
	private int regNo;
	private String make;
	private String model;
	private double price;
	

		public Vehicle(int regNo,String make, String model, double price)
		{
			this.regNo =regNo;
			this.make =make;
			this.model =model;
			this.price = price;
		}
		public abstract void  calculateInsurance();
		public void displayVehical()
		{
			System.out.println("regNo: "+ regNo+ "make: "+ make+ "model: "+ model+ "price:" +price );
		}


} 