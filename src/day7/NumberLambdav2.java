package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLambdav2 {

	public static boolean operateOnNumber(NumberFilter filter, int n) {
		return filter.test(n);
	}
	public static ArrayList<Integer> operateOnNumber(NumberFilter filter , List<Integer> lst){
		ArrayList<Integer> filtered = new ArrayList<>();
		for(Integer n :lst)
		{
			if(filter.test(n))
			{
				filtered.add(n);
			}
		}
		return filtered;
	}
	
	public static void main(String[] args)
	{
		boolean ismultiple = operateOnNumber((n) -> n%5==0, 100);
		System.out.println(ismultiple);
		Integer[] arr = {123,56,100,324,45,56};
		
		List<Integer> mylist = Arrays.asList(arr);
		
		List<Integer> mulitplesoffive = operateOnNumber((n) -> n%5==0,mylist);
		System.out.println(mulitplesoffive);
		List<Integer> primes = operateOnNumber((n) ->
		{
			for(int i =2;i<n;i++ )
			{
				if(n%i==0)
					return false;
				
			}
		
		return true;
		},mylist);
		System.out.println(primes);
	}
}
