package day5;

public enum Coffee {
	SMALL(1),MEDIUM(2),LARGE(3);
	
	private int price;
	/*private String name;*/
	private Coffee(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}

}
