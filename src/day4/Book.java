package day4;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Book implements Print,PrintWrite,Cloneable{

	 int srno;
	 int isbn;
	 String title;
	 ArrayList<String> authors;
	
	public Book()
	{
		
	}
	public Book(int srno,int isbn,String title,ArrayList<String> authors)
	{
		this.srno = srno;
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
	}
	
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [srno=" + srno + ", isbn=" + isbn + ", title=" + title + ", authors=" + authors + "]";
	}
	public void print()
	{
		PrintWrite.super.print();
	}
	/*public static void main(String[] args)
	{
		Book b  = new Book(754,754,"heog");
		b.print();
	}*/
	@Override
	public int hashCode() {
		return Objects.hash(authors, isbn, srno, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authors, other.authors) && isbn == other.isbn && srno == other.srno
				&& Objects.equals(title, other.title);
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		}
	/*public boolean equals(Object o)
	{
		Book b = (Book)o;
		if(this.srno==b.srno && this.isbn==b.isbn && this.title.equals(b.title))
		  return true;
		else
			return false;
	}
	public int hashcode()
	{
		int prime = 17;
		return this.isbn* this.srno* this.title.hashCode4()*prime;
	}*/
	public ArrayList<String> getAuthors1() {
		// TODO Auto-generated method stub
		return authors;
	}
}
