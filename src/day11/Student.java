package day11;

public class Student {

	private int rollno;
	private String name;
	
	public Student()
	{
		rollno = 1;
		name = "aaa";
	}
	public Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public void simpleMethod()
	{
		System.out.println("This is a siple methos");
	}
	public static void staticMethod()
	{
		System.out.println("This is a static method");
	}
	private void privateMethod()
	{
		System.out.println("This is a private method");
	}
	@CreatedBy(name = "Nikhil" , priority = 2)
	public void paraterMethod(int a)
	{
		System.out.println("Paraterized Method");
	}
}
