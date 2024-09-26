package assignment3_article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car_dealer {
	
	public static List<Car> intializeCar()
	{
		List<Car> car = new ArrayList<>();
		TreeSet<String> color1 = new TreeSet<>();
		color1.add("Red");
		color1.add("Black");
		color1.add("White");
		Car car1 = new Car(1241,"Mahindra","Thar",2015,15000,color1);
		
		TreeSet<String> color2 = new TreeSet<>();
		color2.add("Black");
		color2.add("White");
		color2.add("Orange");
		Car car2 = new Car(4582,"Tata","Tiago",2012,100000,color2);
		
		TreeSet<String> color3 = new TreeSet<>();
		color3.add("Grey");
		color3.add("Black");
		color3.add("White");
		Car car3 = new Car(7784,"Tata","Altroz",2020,12000,color3);
		
		TreeSet<String> color4 = new TreeSet<>();
		color4.add("Black");
		color4.add("White");
		Car car4 = new Car(4545,"Mercedes","G-Wagan",2023,100000,color4);
		
		TreeSet<String> color5 = new TreeSet<>();
		color5.add("Black");
		Car car5 = new Car(555,"LandRover","Defender",2024,150000,color5);
		
		TreeSet<String> color6 = new TreeSet<>();
		color6.add("Blue");
		color6.add("Black");
		color6.add("Red");
		Car car6 = new Car(7548,"Mahindra","Thar",2022,12000,color6);
		
		TreeSet<String> color7 = new TreeSet<>();
		color7.add("Grey");
		color7.add("White");
		Car car7 = new Car(7961,"Tata","Altroz",2019,10000,color7);
		
		car.add(car1);
		car.add(car2);
		car.add(car3);
		car.add(car4);
		car.add(car5);
		car.add(car6);
		car.add(car7);
		
		return car;
	}
	public static void main(String[] args)
	{
		List<Car> car = intializeCar();
		
		System.out.println("Printing Black - Thar");
		
		
		car.stream()
		.filter((c) -> c.getcolor()
				.contains("Black") && c.getmodel()
				.contains("Thar"))
				.forEach((k)->System.out.println(k));
		System.out.println("Grouping by Model : ");
		car.stream().collect(Collectors.groupingBy(Car::getmodel)).forEach((k,v) -> System.out.println(k +" : "+v));
		
		System.out.println("Number of Car Per Model : ");
		car.stream().collect(Collectors.groupingBy(Car::getmodel,Collectors.counting()))
									   .forEach((k,v) -> System.out.println(k+" : "+v));
		
		System.out.println("Sort the cars by make in the ascending order of prices");
		Map<String, List<Car>> carsGroupedByMake = car.stream()
	            .collect(Collectors.groupingBy(
	                Car::getmake, 
	                Collectors.collectingAndThen(
	                    Collectors.toList(), 
	                    list -> list.stream()
	                                .sorted(Comparator.comparing(Car::getprices)) 
	                                .collect(Collectors.toList()) 
	                )
	            ));

	        
	        carsGroupedByMake.forEach((make, carList) -> {
	            System.out.println(make + ":");
	            carList.forEach(System.out::println);
	        });
		/*Comparator<Car> byMake = Comparator.comparing(Car::getprices);
		car.stream().sorted(byMake).collect(Collectors.toList()).forEach(System.out::println);*/
		
		System.out.println("Make a list of old stock - cars in stock manufactured before 2020");
		car.stream().filter((n) -> n.getMan_year() < 2020).forEach((k)->System.out.println(k));
		
		System.out.println("Least expensive car in the stock : ");
		OptionalDouble min = car.stream().mapToDouble(Car :: getprices).min();
		System.out.println(min);
		
		System.out.println("Most expensive car in the stock : ");
		OptionalDouble max = car.stream().mapToDouble(Car :: getprices).max();
		System.out.println(max);
	}

}
