package day2;

public class DemoArray {
	public static void main(String[] args) {
		int arr [] = {45,89,37,687,932,45,39,4,75};
		int i;
		for(i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		Book [] books = new Book[2];
		books[0] = new Book();
		books[0].setIsbn(120000);
		books[0].setTitle("Head First Java");
		books[1] = new Book();
		books[1].setIsbn(545892147);
		books[1].setTitle("Complete reference java");
		
		for(i=0;i<books.length;i++) {
			System.out.println(books[i].toString());
		}
		
		Book[] bk = {new Book(2546432,"aag"),
					new Book(4749844,"geggd")};
		
		
		
		for(Book k : bk )
		{
			System.out.println(k.toString());
		}
	}

}
