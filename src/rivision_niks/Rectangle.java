package rivision_niks;

public class Rectangle extends Shape{
 
		protected int length;
		protected int breadth;
			public Rectangle(  String name , int length, int breadth)
			{
				super(name);
				this.length = length;
				this.breadth = breadth;
				
			}
			public double calculateArea()
			{
				return length*breadth;
			}
			
}
