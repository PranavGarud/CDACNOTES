package vehical;

public class FourWheeler extends Vehical{

	
	public FourWheeler(int regno,String make,String model,double price)
	{
		super(regno,make,model,price);
	}
	public double calculateInsurance()
	{
		return price * 0.1;
	}
	public void disp()
	{
		System.out.println("In Four");
	}
}
