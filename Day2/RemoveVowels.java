import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all vowels from the string
        String result = input.replaceAll("[AEIOUaeiou]", "");

        // Print the result
        System.out.println("String after removing vowels: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
