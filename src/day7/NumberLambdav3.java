package day7;

public class NumberLambdav3 {
	public static boolean operateOnNumber(NumberFilter filter,int n) {
		boolean filtered = filter.test(n);
		return filtered;
	}
	public static boolean isPrime(int n)
	{
		for(int i =2; i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static <T>T oprateOnData(Function<T> filter,T s)
	{
		return filter.apply(s);
	}
	public static String revString(String s)
	{
		String nstr = "";
		char ch;
		for (int i=0; i<s.length(); i++)
	      {
	        ch= s.charAt(i);
	        nstr= ch+nstr; 
	      }
		return nstr;
	}
	public static void main (String[] args)
	{
		boolean result = operateOnNumber(NumberLambdav3 :: isPrime, 11);
				System.out.println(result);
			
		String s = oprateOnData(NumberLambdav3 :: revString ,"Abcdefg" );
				System.out.println(s);
	}

}
