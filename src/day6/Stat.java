package day6;

public class Stat<T extends Number> {//Bounded Types
	T [] arr;
	
	public void setArray(T [] arr)
	{
		this.arr = arr;
	}
	
	public double calculateAverage()
	{
		double sum = 0.0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i].doubleValue();
		}
		return sum/arr.length;
	}
	
}
