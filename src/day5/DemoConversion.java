package day5;

public class DemoConversion {
	
	public static void main(String[] args)
	{
		int i = 10;
		
		Integer j = Integer.valueOf(i);//primitive to wrapper
		
		int k = j.intValue();//wrapper to primitive
		/*
		 * In to Java 5 Auto boxing and un-boxing was introduced
		 * so conversion take place implicitly
		 */
		int x = 20;
		
		Integer y = x; //auto - boxing
		
		int z = y; //auto unboxing 
		
		//String conversion
		int a = Integer.parseInt("10");//String to primitive
		Integer b = Integer.valueOf("20");//String to wrapper
		
		System.out.println("int a = "+a+"\nInteger b = "+b);
	}
}
