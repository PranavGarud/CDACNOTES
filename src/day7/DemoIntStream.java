package day7;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {

	public static void main(String[] args) {
		/*
		 * A stream is closed after performing a terminal operation
		 * To obtain a stream call Arrays.stream(arr obj)
		 */
		int [] arr = {12,4,53,634,76,34,624,463,34,764,23,66};
		
		IntStream istream = Arrays.stream(arr);
		
		istream = istream.distinct().sorted();
		
		System.out.println(istream);
		istream.forEach(System.out::println);
		
		istream = Arrays.stream(arr);
		List<Integer> list = istream.boxed().collect(Collectors.toList());
		System.out.println(list);
		
		istream = Arrays.stream(arr);
		List<Integer> doubleeval = istream.map((n) -> n*2).boxed().collect(Collectors.toList());
		System.out.println(doubleeval);
		
		istream = Arrays.stream(arr);
		List<Integer> evennos = istream.filter((n) -> n%2==0).boxed().collect(Collectors.toList());
		System.out.println(evennos);
		

		istream = Arrays.stream(arr);
		long totalitems = istream.count();
		System.out.println(totalitems);
		
		istream = Arrays.stream(arr);
		OptionalInt min = istream.min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		
		istream = Arrays.stream(arr);
		OptionalInt max = istream.max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		
		istream = Arrays.stream(arr);
		OptionalDouble ave = istream.average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
	}
}
