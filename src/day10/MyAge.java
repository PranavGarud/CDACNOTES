package day10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// import java.swing.text.DateFormatter;

public class MyAge {
	 	
	
	 	public static void main(String [] args ) {
	 		 int age;
	 		 
	 		 LocalDate dt = LocalDate.now();
	 		 LocalDate bdt = LocalDate.of(1999,12,07);
	 		 //LocalDate bdt1 = LocalDate.parse(bdt,DateFormatter("dd-mm-yyyy")) ;
	 		 
	 		  System.out.println(Period.between(dt, bdt));
	 		  
	 		Stream<LocalDate> thisyear = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
	 		Predicate<LocalDate> fridays = (dtt) -> dtt.getDayOfWeek().equals(DayOfWeek.SUNDAY);
	 		Predicate<LocalDate> the13th = (dtt) -> dtt.getDayOfMonth()==1;
	 		List<LocalDate> fridaythe13th = thisyear.filter(fridays).filter(the13th).collect(Collectors.toList());
	 		System.out.println(fridaythe13th);
	 		  
	 		  
	 	}

		
		

}
