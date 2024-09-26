package day2;

import day1.Date;
public class DemoContainment {

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		System.out.println(e1.toString());
		
		
		Employee e2 = new Employee(200,"aaa",new Date(12,"Jan",2002));
		System.out.println(e1.toString());
	}
}
