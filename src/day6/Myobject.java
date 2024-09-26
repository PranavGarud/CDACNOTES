package day6;

public class Myobject <T>{
	T obj;
	
	public Myobject(T obj)
	{
		this.obj = obj;
	}
	public String getName()
	{
		return obj.getClass().getName();
	}
	public static void main(String[] args) {
		Myobject<Integer> iobj = new Myobject<Integer>(945);
		System.out.println(iobj.getName());
		Myobject<String> sobj = new Myobject<String>("hello");
		System.out.println(sobj.getName());
		
	}
}
