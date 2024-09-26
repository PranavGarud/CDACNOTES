package day1;

public class Calculator {
	public static void main(String args[])
	{
		Math m = new Math();
		System.out.println(m.Add(5,6));
		System.out.println(m.Add(4,4.6f));
		System.out.println(m.Add(7,6,8) );
		System.out.println(m.Add(6.7f,36.78f));
	}
}

/* Write a program to find 2nd largest number in array if there is no second largest then print there is no 2nd largest number in given array */