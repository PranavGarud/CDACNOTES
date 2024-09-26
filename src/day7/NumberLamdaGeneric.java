package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLamdaGeneric {

	public static <T>T operateOnNumber(Function<T> filter,T n) {
		return filter.apply(n);
	}
	/*public static <T> List<T> operateOnNumber(Function<T> func, List<T> lst)
	{
		List<T> mapped = new ArrayList<>();
		for(T item : lst)
		{
			mapped.add(func.apply(item));
		}
		return mapped;
	}*/
	public static void main(String[] args)
	{
		int squareValue = operateOnNumber((n) -> n*n,8);  
		System.out.println(squareValue);
		
		String uppercase = operateOnNumber((n) -> n.toUpperCase(),"143 my Girl");
		System.out.println(uppercase);
		
		/*Integer[] arr = {50,55,555,5555,5,65,75,28,64,84};
		List<Integer> mylist = Arrays.asList(arr);
		
		List<Integer> cubes = operateOnNumber((n) -> n*n*n,mylist);
				
		System.out.println(cubes);
		
		String [] greetings = {"hi","hello","good morning","chai buoi lang"};
		List<String> lst = Arrays.asList(greetings);
		
		List<String> toUpper = operateOnNumber((n) -> n.toUpperCase(),greetings);
		}*/
 	}
	
	
	
}
