import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        // Create a program that uses a loop to calculate the power of a number raised to
        // another number, both entered by the user. Display the result.
        Scanner scanner = new Scanner(System.in); // Get input
        System.out.println("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter the power number: ");
        int power = scanner.nextInt();

        int result = 1; // Initialize result to 1

        // Calculate base raised to the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= base; // Multiply result by base
        }

        System.out.println(base + " raised to the power of " + power + " is " + result);

        scanner.close();
    }
}
