package day5;

public class MathVersion3 {

	public static void divide(String a, String b) throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException
	{
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		
		int res = i/j;
		System.out.println(res);
	}
	public static void main(String[]args) {
		try {
		divide(args[0],args[1]);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("After Exception Version 3");
	}
}
