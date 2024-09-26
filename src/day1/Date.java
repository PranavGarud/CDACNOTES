package day1;

public class Date {
	
	private int day;
	private String month;
	private int year;
	
	public Date()
	{
		/*day = 1;
		month = "Jan";
		year = 2000;*/
		this(1,"Jan",2000);
	}
	public Date(int day,String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(int day,String month)
	{
		this.day = day;
		this.month = month;
		this.year = 2000;
	}
	
	public String tostring()
	{
		return day + "/" + month +"/" + year;
	}

}
