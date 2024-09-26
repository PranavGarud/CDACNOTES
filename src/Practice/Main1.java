package Practice;

import java.util.Scanner;

public class Main1 {
    private StringBuffer content;

    public Main1() {
        content = new StringBuffer();
    }

    public void createContent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter content (type 'exit' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit condition
            }
            content.append(input).append(System.lineSeparator()); // Append input to StringBuffer
        }

        scanner.close(); // Close the scanner
    }

    public void displayContent() {
        System.out.println("Content Entered:");
        System.out.println(content.toString());
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        main.createContent(); // Call method to create content
        main.displayContent(); // Display the content entered
    }
}
