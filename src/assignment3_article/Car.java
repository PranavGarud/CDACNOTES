package assignment3_article;

import java.util.TreeSet;


public class Car {

	private int regno;
	private String make;
	private String model;
	private int man_year;
	private double prices;
	TreeSet<String> colors;
	
	public int getRegno()
	{
		return regno;
	}
	public String getmake()
	{
		return make;
	}
	public String getmodel()
	{
		return model;
	}
	public int getMan_year()
	{
		return man_year;
	}
	public double getprices()
	{
		return prices;
	}
	public TreeSet<String> getcolor()
	{
		return colors;
	}
	
	public Car(int regno,String make,String model,int man_year,double prices,TreeSet<String> colors)
	{
		this.regno = regno;
		this.make = make;
		this.model = model;
		this.man_year = man_year;
		this.prices = prices;
		this.colors = colors;
	}
	@Override
	public String toString() {
		return "Car [regno=" + regno + ", make=" + make + ", model=" + model + ", man_year=" + man_year + ", prices="
				+ prices + ", colors=" + colors + "]";
	}
	
	
}
