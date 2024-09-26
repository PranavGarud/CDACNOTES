package temp;

import java.util.Scanner;

public class secondLargestNumber {
	public  int secondLargestNumber(int length,int arr[]){
		int largest = Integer.MIN_VALUE;
		int secondlargest  = Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		for(int j=0;j<arr.length;j++) {
			if(secondlargest<arr[j] && largest>arr[j]) {
				secondlargest = arr[j];
			}
		}
		}
		
		return secondlargest;
		
		
	}
	public static void main(String args[]) {
		System.out.print("Enter the length of array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		secondLargestNumber k = new secondLargestNumber();
		
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {
			System.out.print("Enter "+i+"th"+" elements in array : ");
			arr[i]= s.nextInt();
		}
		
		int res = k.secondLargestNumber(n,arr);
		if(res==Integer.MIN_VALUE) {
			System.out.print("There is no second largest number in given array");
		}
		else {
			System.out.print("Second largest number in given array is "+res);
		}
		
	}

}
