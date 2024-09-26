package day1;

public class Math {
	public int Add(int a,int d)
	{
		return a+d;
	}
	public float Add(int a,float b)
	{
		return a+b;
	}
	public int Add(int a,int b,int c)
	{
		return a+b+c;
	}
	public float Add(float a,float b)
	{
		return a+b;
	}
	public static void swap(int i,int j)
	{
		int temp;
		temp = i;
		i = j;
		j = temp;
		System.out.println("After Swapping i : " + i +" j : "+j);		
	}
	public static void  swap(Date d1,Date d2)
	{
		Date temp = null;
		temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("After Swapping d1 : "+d1+" d2 : "+d2);
	}
	public static void swap(int arr[])
	{
		int temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	public static void swap(int[] i,int[] j)
	{
		int temp = i[0];
		i[0] = j[0];
		j[0] = temp;
	}
}

