import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        // Count Words in String: Count the number of words in an input string.
        Scanner scanner = new Scanner(System.in); // Get Input
        System.out.println("Enter a sentence: ");  // Prompt user for input
        String input = scanner.nextLine();

        // Split the string into words escaping the whitespaces(using regular expression)
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("The number of words is " + wordCount);

        scanner.close();
    }
}