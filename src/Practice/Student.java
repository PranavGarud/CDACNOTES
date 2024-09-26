package Practice;

public class Student {
	public int rollno;
	public String name;
	public int [] array;

	public Student(int rollno,String name,int []array)
	{
		this.rollno = rollno;
		this.name = name;
		this.array = array;
	}
	public double AverageMarks()
	{
		double avg=0;
		
		int i;
		for(i=0;i<array.length;i++)
		{
			avg = avg + array[i];
		}
		
		return avg/array.length;
	}
	public double percentage()
	{
		double per=0;
		
		int i;
		for(i=0;i<array.length;i++)
		{
			per = per + array[i];
		}
		
		return (per/500)*100;
	}
}
