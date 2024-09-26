package day7;

public class NumberLambda {
	
	public static void main(String[] args) {
				NumberFilter ispositive = (n) -> n>0;
	
				boolean result = ispositive.test(-15);
				System.out.println(result);
				
				NumberFilter isprime = (n) ->
				{
					for(int i = 2 ; i<n;i++)
					{
						if(n%i==0)
						return false;
					}
					return true;
				};
				result = isprime.test(19);
				System.out.println(result);
	}
}
