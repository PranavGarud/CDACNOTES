package Practice;

public class Store {

	public static void disp_prod_list(Product [] P)
	{
		int i;
		System.out.println("Product List: \n");
		for(i=0;i<P.length;i++)
		{
			System.out.println(P[i].toString()+"\n");
		}
	}
	public static int Serc_Prodt(Product[] P, int pid)
	{
		int i;
		for(i=0;i<P.length;i++)
		{
			if(P[i].prodid == pid)
			{
				return i;
			}
		}
		return -1;
	}
	@SuppressWarnings("null")
	public static void main(String [] args)
	{
		Product P1 = new Product(12,"Laptop",65000);
		Product P2 = new Product(13,"SmartTv",50000);
		Product P3 = new Product(15,"Mobile",2000);
		Product P4 = new Product(18,"SmartWatch",10000);
		
		Product [] P = new Product[4] ;
		P[0] = P1;
		P[1] = P2;
		P[2] = P3;
		P[3] = P4;
		
		disp_prod_list(P);
		int index =  Serc_Prodt(P,15);
		System.out.println("Index : "+index+"\nProduct :"+P[index].toString());
	}
}
