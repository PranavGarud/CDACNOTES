package day4;

public interface Print {
	default void print()
	{
		System.out.println("Printing data - old");
	}
}
