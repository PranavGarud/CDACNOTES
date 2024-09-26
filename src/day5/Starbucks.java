package day5;

import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args)
	{
		System.out.println("Menu");
		CoffeeType []coff = CoffeeType.values();
		for(CoffeeType c : coff)
		{
			System.out.println(c +" : "+c.getPrice() );	
		}
		System.out.println("Select Coffe : ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		CoffeeType coffee = CoffeeType.valueOf(choice.toUpperCase());
		Coffee[] quan = Coffee.values();
		String choic
		;
		System.out.println("Enter Quantity : ");
		for(Coffee q : quan )
		{
			System.out.println(q);
		}
			choic = sc.next();
			Coffee cof = Coffee.valueOf(choic.toUpperCase());
		switch(cof.name()) {
		case("SMALL"):
				System.out.println("Bill : "+1*coffee.getPrice());
				break;
		case("MEDIUM"):
				System.out.println("Bill : "+1.5*coffee.getPrice());
				break;
		case("LARGE") :
				System.out.println("Bill : "+2*coffee.getPrice());
				break;
		default:
				System.out.println("Invalid ");
			
		}
			
	}
}
