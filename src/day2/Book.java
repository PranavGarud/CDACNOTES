package day2;

public class Book {

	private int isbn;
	private String title;
	
	public Book()
	{
		
	}
	public Book(int isbn,String title)
	{
		this.isbn = isbn;
		this.title = title;
	}
	public void setIsbn(int isbn)
	{
		this.isbn = isbn;
	}
	public void setTitle(String title)
	{
		this.title =  title;
	}
	public int getIsvn()
	{
		return isbn;
	}
	public String getTitle()
	{
		return title;
	}
	public String toString()
	{
		return "Book isbn : " +isbn +" Title : " + title;
	}
	
}
