package vehical;

public class Policy {
	public static void dispInsu(Vehical v)
	{
		System.out.println("Insurance for :");
		v.displayveh();
		System.out.println("Insurance : "+v.calculateInsurance()+"\n");
		
	}
	public static void main(String args[])
	{
		Vehical v1 = new TwoWheeler(75,"Suzuki","Access",90000);
		dispInsu(v1);
		Vehical v2 = new FourWheeler(55,"Honda","Amaze",800000);
		dispInsu(v2);
		
		FourWheeler f = (FourWheeler)v2;
		f.displayveh();
	}

}
