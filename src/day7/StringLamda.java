package day7;

public class StringLamda {

	public static void main(String[] args)
	{
		StringFilter toUpperCase = (s) -> s.toUpperCase();
		
		String result = toUpperCase.test("this is lamda");
		System.out.println(result);
		
		StringFilter toReverse = (s) -> 
		{
			String nstr = "";
			char ch;
			for (int i=0; i<s.length(); i++)
		      {
		        ch= s.charAt(i);
		        nstr= ch+nstr; 
		      }
			return nstr;
		};
		
		String reverse = toReverse.test(result);
		System.out.println(reverse);
	}
	
}
