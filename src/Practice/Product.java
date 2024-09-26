package Practice;
/*Program 2:
1 Create a Product class with prodid, name, price
2. Create Store class with methods : 1. Display product list, 2. Search Product
[To search a product first create Product array, and if id is found in
the array return index at which it is found]*/
public class Product {

	public int prodid;
	public String name;
	public double price;
	
	public Product(int prodid,String name,double price)
	{
		this.prodid = prodid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product ID = " + prodid + "\nName = " + name + "\nPrice = " + price ;
	}
	
	
	
}
