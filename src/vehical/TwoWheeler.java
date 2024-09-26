package vehical;

public class TwoWheeler extends Vehical {

	public TwoWheeler(int regno,String make,String model,double price)
	{
		super(regno,make,model,price);
	}
	public double calculateInsurance()
	{
		return price * 0.05;
	}
}
