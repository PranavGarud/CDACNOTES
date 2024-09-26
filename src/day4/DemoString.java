package day4;

public class DemoString {

	public static void main(String[] args)
	{
		String s = "Java";
		System.out.println(s.hashCode());
		String s1 = "Java";
		System.out.println(s.hashCode());
		
		if(s==s1)
		{
			System.out.println("Strings are equal");
		}
		
		s = s + "11";
		System.out.println(s.hashCode());
		
		String n1 = new String("hello");
		String n2 = new String("hello");
		
		
	}
}
