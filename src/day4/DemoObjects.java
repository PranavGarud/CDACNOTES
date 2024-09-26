package day4;
import java.util.ArrayList;
public class DemoObjects {
	public static void main(String [] args) throws CloneNotSupportedException
	{
		ArrayList<String> authors = new ArrayList<>();
		authors.add("aaa");
		authors.add("bbb");
		
		Book b1 = new Book(75,444,"HI",authors);
		/*Book b2 = new Book(75,444,"HI",authors);
		
		if(b1.equals(b2))
		{
			System.out.println("Same books");
		}
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());*/
		
		System.out.println("Shallow copy vs Deep copy");
		
		ArrayList<String> copy = new ArrayList<>();
		for(String author : authors)
		{
			copy.add(author);
		}
		copy.add("Hi");
		Book b3 = b1;//Shallow copy
		Book b4 = new Book(b1.srno, b1.isbn,b1.title,copy);
		Book b5 = (Book) b1.clone();
		
		System.out.println("Original :"+b1);
		b1.isbn = 1234;
		b1.authors.add("ccc");
		
		System.out.println("Shallow copy : "+b3);
		System.out.println("Deep copy    : "+b4);
		System.out.println("By Cloning   : "+b5);
		}
}
