package day5;

public class StringMethods {

	public static void convertToUpperCase(String s) throws EmptyStringException
	{
		if(s.equals(""))
		{
			throw new EmptyStringException("String is Mad");
		}
		else
		{
			System.out.println("Upper case String : "+ s.toUpperCase());
		}
	}
	public static void main(String [] args)
	{
		try {
			StringMethods.convertToUpperCase("");
			
		} catch (EmptyStringException e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
