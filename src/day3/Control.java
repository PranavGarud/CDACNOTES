package day3;

import java.util.Scanner;
public class Control {
	
	public static void main(String args[])
{
		Remote remote = new Remote();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Initial Curtain Status : " + remote.getCurtainStatus());
		
		while(true) {
			System.out.println("Press 1 key to operate the curtain and 0 to exit the Curtain");
			int a = scanner.nextInt();
			if (a==1)
		{
				remote.operateCurtain();
				
				System.out.println("Curtain Status : "+remote.getCurtainStatus());
		}
			else if(a==0)
				{
					break;
				}
			else
			{
				System.out.println("Invalid input");
			}
				}
			scanner.getClass();
}/*
	public static void main(String[] args)
	{
		Curtain curtain = new Curtain(false);
		Remote remote = new Remote(curtain);
		remote.operate();
		remote.operate();
	}*/


}
