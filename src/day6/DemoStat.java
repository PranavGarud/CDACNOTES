package day6;

public class DemoStat{
	
	public static void main(String [] args)
	{
		Double [] sal = {50000.0,45000.0,35000.0,74000.0};
		Stat<Double> stat = new Stat<>();
		stat.setArray(sal);
		System.out.println("Average Salary :" + stat.calculateAverage());
	
		Integer age [] = {45,28,6,12,17,65};
		Stat<Integer> stat1 = new Stat<>();
		stat1.setArray(age);
		System.out.println("Average Age : "+stat1.calculateAverage());
	}
}
