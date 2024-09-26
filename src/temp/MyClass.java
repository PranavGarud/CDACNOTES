package temp;
import java.util.Scanner;
public class MyClass {
	
	public static void main(String args[]) {
		
		int i,n;
		System.out.println("Enter the size of array");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    n = myObj.nextInt();
	    System.out.println(n);
	   int arr[] = new int[n];
	    for(i =0;i<n;i++) {
	    	System.out.print("Enter elements of array : ");
	    	arr[i] = myObj.nextInt();
	    	
	    }

	int j,temp;
	for(i=0;i<n;i++)
	{
	for(j=i;j<n;j++)
	{
		if(arr[i]<arr[j])
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
	 for(int k :arr)
	    {
	    	System.out.print(k+" ");
	    }
	if(n==1)
	{
		System.out.println("No 2nd largest Element");
	}
	int res[][] = new int[n][n];
/*	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if()
		}
	}
	else
	{
		System.out.print("2nd largest Element = "+arr[1]);
	}*/
	}}
