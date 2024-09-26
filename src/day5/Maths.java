package day5;

public class Maths {

	public static void main(String[] args) {
		int i =1;
		int j = 0;
		try {
		int res = i/j;
		System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Divisor can not be zero");
			e.printStackTrace();
		}
		System.out.println("After exception");
	}
}
