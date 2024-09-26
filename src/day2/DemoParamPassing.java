package day2;
import day1.Math;
import day1.Date;
public class DemoParamPassing {
	
	public static void main(String args[])
	{
		int i = 10;
		int j =  20;
		System.out.println("Before Swapping i : "+i +" j : "+j);
		Math.swap(i,j);
		
		
		Date d1 = new Date(12,"Aug");
		Date d2 = new Date(10,"Aug");
		System.out.println("Before Swapping d1 : "+d1+" d2 : "+d2);
		Math.swap(d1,d2);
		
		int arr[] = new int [2];
		arr[0] = i;
		arr[1] = j;
		Math.swap(arr);
		i = arr[0];
		j = arr[1];
		System.out.println("After Swapping i : "+i +" j : "+j);
		int c[] = {4};
		int d[] = {9};
		System.out.println("Before Swapping c : "+c[0] +" d : "+d[0]);
		Math.swap(c,d);
		System.out.println("After Swapping c : "+c[0] +" d : "+d[0]);
		
	}

}
