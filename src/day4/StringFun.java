package day4;

public class StringFun {

	
	public void CountC(String s)
	{
		int i,up,lo,sp;
		up = 0;
		lo = 0;
		sp = 0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lo++; 
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				up++;
			}
			else
			{
				sp++;
			}
		}
		System.out.println("UpperCase : "+up+"\nLowerCase : "+lo+"\nSpecial : "+sp);
	}
	public void UpperCase(String s)
	{
		int i,d;
		d = 0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				d++;
			}
		}
		if(d==s.length()&&s.length()!=0)
		{
			System.out.println("String is upper case");
		}
		else
		{
			System.out.println("String is not upper case");
		}
	}
	public String shiftLeft(String str, int shift) {
        if (str == null || str.length() == 0) {
            return str;  
        }

        int length = str.length();
        shift = shift % length;  

        if (shift == 0) {
            return str;  
        }

       
        String leftPart = str.substring(0, shift);
        String rightPart = str.substring(shift);
        return rightPart + leftPart;
    }
	public void Anagram(String str1,String str2)
	{
		int i,j,count;
		count = 0;
		
		String s1 = str1.toUpperCase();
		String s2 = str2.toUpperCase();
		if(s1.length()==s2.length())
		{
			for(i=0;i<s2.length();i++)
			{
				for(j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						count++;
					}
				}
			}
		}
		if(count==str1.length())
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is Not Anagram");
		}
			
	}
}
