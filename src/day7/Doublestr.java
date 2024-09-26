package day7;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Doublestr {

	public static void main(String[] args) {
		double [] arr = {12.5,56.6,43.5,43.6,97.8,89.8,56.8,76.8,675.8,123.5,543.5,32.4,665.7};
		DoubleStream dstream = Arrays.stream(arr);
	    dstream = dstream.distinct().sorted();
	    
	   
	    dstream.limit(10).forEach(System.out::println);
	    
	    dstream = Arrays.stream(arr);
	    dstream = dstream.distinct().sorted();
	    List<Double> inc=dstream.map((n) -> n = n +n*0.1).boxed().collect(Collectors.toList());
		System.out.println(inc);
		System.out.println("--------------------------------------------------");
		dstream = Arrays.stream(arr);
		dstream = dstream.distinct().sorted();
	    List<Double> filt=dstream.filter((n) -> n > 50).boxed().collect(Collectors.toList());
		System.out.println("filtered " + filt);
		
		System.out.println("----------------------------------------");
		dstream = Arrays.stream(arr);
	    double sum = dstream.sum();
		System.out.println("sum " + sum);
		
		
		System.out.println("---------------------------------------");
		dstream = Arrays.stream(arr);
	    OptionalDouble max=dstream.max();
		if(max.isPresent()) {
			System.out.println("maximum : " + max.getAsDouble());
			
		}
		
		System.out.println("------------------------------------------------");
		dstream = Arrays.stream(arr);
	    OptionalDouble min = dstream.min();
		if(min.isPresent()) {
			System.out.println("minimum of values : " + min.getAsDouble());
		}
		System.out.println("-----------------------------");
		dstream = Arrays.stream(arr);
	    OptionalDouble avg = dstream.average();
		if(avg.isPresent()) {
			System.out.println("average : " + avg.getAsDouble());
		}
		
	}
}
