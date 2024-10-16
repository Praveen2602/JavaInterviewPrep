import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // Read the first character

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Print the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
        // Close the scanner
        scanner.close();
    }
}
