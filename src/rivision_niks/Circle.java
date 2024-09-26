package rivision_niks;

public class Circle extends Shape {
	protected int radius;
	
	public Circle(String name,int radius)
	{
		super(name);
		this.radius = radius;
	}
		public double calculateArea()
		{
			return 3.14*radius*radius;
		}

}
