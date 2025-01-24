import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Print the first n terms of the Fibonacci series
        // Take the n input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: "); // ask for user's input
        int n = scanner.nextInt();

        // Handling edge case
        if (n < 1) {
            System.out.println("Please provide a positive number");
            return;
        }

        // Defining the first two numbers in a Fibonacci series
        int prev2 = 0;
        int prev1 = 1;

        // Defining the first two numbers in a Fibonacci series
        System.out.println("The first " + n + " Fibonacci numbers are:");

        System.out.println(prev2); // Print the first number
        System.out.println(prev1); // Print the second number

        for (int i = 3; i <= n; i++) { // Start from the 3rd term
            int newFibonacci = prev1 + prev2;
            System.out.println(newFibonacci);
            prev2 = prev1; // Move the second-last value
            prev1 = newFibonacci; // Move the last value
        }

        scanner.close();
    }
}
