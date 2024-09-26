package Practice;

import java.util.Scanner;

/*Program 3
1. Create a document class with documentid, title, content
2. Create a method createContent() - this method will take string input from 
the user until exit condition is not given (hint use while(true) and break
when "exit" is entered . Use StringBuffer to save the input
3. Create a method to print charactor count in the content
*/
public class Document {

	public int documentid;
	public String title;
	public StringBuffer content; 
	
	public Document(int doumentid,String title) {
		this.documentid = documentid;
		this.title = title;
		content = new StringBuffer();
	}
	public void createContent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter content for Document"+title+"(type 'exit' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit condition
            }
            content.append(input).append(System.lineSeparator()); // Append input to StringBuffer
        }

        scanner.close(); // Close the scanner
    }
	public void countChar()
	{
		System.out.println("Characters in Content : "+content.length());
	}
	public static void main(String args[])
	{
		Document d = new Document(121,"Student");
		d.createContent();
		d.countChar();
		
	}
}

