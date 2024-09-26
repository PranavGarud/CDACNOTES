package day5;

import java.util.Scanner;

public class CoffeShop {
	
	public static void main(String[] args)
	{
		Coffee []coffess = Coffee.values();
		for(Coffee c : coffess)
		{
			System.out.println(c);
		}
		
		System.out.println("Select a coffee type");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		Coffee cof = Coffee.valueOf(choice.toUpperCase());
		System.out.println(cof.getPrice());
		
		int bill,quant;
		
		System.out.println("Enter Quantity : ");
		quant = sc.nextInt();
		
		System.out.println("Bill : "+quant*cof.getPrice());
		
		/*Coffee c = Coffee.MEDIUM;
		System.out.println("Price for Selected coffee : "+c.getPrice());*/
	}

}
