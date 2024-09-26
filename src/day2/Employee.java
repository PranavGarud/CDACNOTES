package day2;

import day1.Date;
public class Employee {
	private int empid;
	private String name;
	private Date joiningdate;
	
	public Employee()
	{
		empid = 100;
		name = "aaa";
		joiningdate = new Date(1,"Jan",2024);
	}
	public Employee(int empid, String name, Date joiningdate)
	{
		this.empid = empid;
		this.name = name;
		this.joiningdate = joiningdate;
	}
	public String toString()
	{
		return "Employee id :"+empid+" Name : "+ name + "Joining Date : " + joiningdate;
	}
}
