package Practice;

public class Class {

	public static void main(String[] args) {

		int [] marks = {75,85,69,72,69};
		Student S = new Student(1,"Sahil",marks);
		System.out.println("Average = "+S.AverageMarks());
		System.out.println("Percentage = "+S.percentage());
	}
}
