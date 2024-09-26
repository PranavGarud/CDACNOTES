package vehical;

public abstract class Vehical {
	protected int regno;
	protected String make;
	protected String model;
	protected double price;
	
	public Vehical(int regno,String make,String model,double price)
	{
		this.regno = regno;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	public abstract double calculateInsurance();
	
	public void displayveh()
	{
		System.out.println("Reg no : "+regno+"\nManufacture : "+make+"\nModel : "+model+"\nPrice : "+price);
	}
}
