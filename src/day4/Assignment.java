package day4;

public class Assignment {

	public static void main(String []args)
	{
		String s = "Fired";
		String s1 = "Fried";
		
		StringFun sf = new StringFun();
		sf.Anagram(s,s1);
		sf.CountC(s);
		sf.UpperCase(s);
		String s3 = "abcdef";
		System.out.println("Original String : "+s3);
		System.out.println("LeftShift String : "+sf.shiftLeft(s3,1));
	}
}
