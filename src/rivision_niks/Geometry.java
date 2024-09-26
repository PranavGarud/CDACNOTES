package rivision_niks;

public class Geometry {
	public void displayArea(Shape s)
	{
		s.displayName();
		System.out.println("Area of : "+s.calculateArea());
	}

	public static void main(String []args)
	{
		Geometry g =  new Geometry(); 
		Shape r = new Rectangle("Rectangle",75,14);
		g.displayArea(r);
		Shape c = new Circle("Circle",12);
		g.displayArea(c);
		r.displayName();
		System.out.println("Area of : "+r.calculateArea());
		
	}
}
