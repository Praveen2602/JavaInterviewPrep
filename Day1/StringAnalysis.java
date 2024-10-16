import java.util.Scanner;

public class StringAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;

        // Convert the input string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if character is a consonant (a letter that is not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
            // Check if character is a space
            else if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of spaces: " + spaceCount);
    }
}
