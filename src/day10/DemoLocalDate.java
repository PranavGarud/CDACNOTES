package day10;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.security.auth.callback.LanguageCallback;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class DemoLocalDate {

	public static void main(String[] args) {
		java.time.LocalDate today = java.time.LocalDate.now();
		System.out.println(today);
		
		LocalDate christmas = LocalDate.of(2024,12,25);
		Period timetochristmas = today.until(christmas);
		System.out.println("Time to Christmas : " + timetochristmas.getYears()+" years , "+timetochristmas.getMonths()+" months"+timetochristmas.getDays()+" days");
		LocalDate nextweek = today.plusWeeks(1);
		System.out.println(nextweek);
		
		LocalDate nextmonth = today.plus(1,ChronoUnit.MONTHS);
		System.out.println(nextmonth);
		
		if(today.isBefore(christmas))
			System.out.println("Still have time");
		
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		
		Stream<LocalDate> thisyear = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
		Predicate<LocalDate> fridays = (dt) -> dt.getDayOfWeek().equals(DayOfWeek.FRIDAY);
		Predicate<LocalDate> the13th = (dt) -> dt.getDayOfMonth()==13;
		List<LocalDate> fridaythe13th = thisyear.filter(fridays).filter(the13th).collect(Collectors.toList());
		System.out.println(fridaythe13th);
		
		System.out.println(today);
		LocalTime time = LocalTime.now();
		System.out.println(time.plusHours(2)+" "+ time.plusMinutes(25)+" "+ time.plusSeconds(10)+" "+ time.plusNanos(30));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(20));
		System.out.println(time.plusNanos(75));
		LocalDateTime dtt = LocalDateTime.now();
		ZonedDateTime newyork = ZonedDateTime.of(dtt,ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		Instant nyccurrent = newyork.toInstant();
		ZonedDateTime India = nyccurrent.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(India);
		
		LocalDateTime Indialocal = India.toLocalDateTime();
		LocalDateTime nyclocal = newyork.toLocalDateTime();
		
		Duration interval =  Duration.between(Indialocal, nyclocal);
		System.out.println(interval);
		
		
	}
}
