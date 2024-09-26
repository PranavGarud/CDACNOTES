package day5;

public enum CoffeeType {
	CUPPACINO(100) ,CAFFELATTE(200),CAFEMOCHA(300);
	
	private int price;
	private CoffeeType(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}

}
