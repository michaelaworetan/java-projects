import java.util.Scanner;

public class FactorialCalculator {
    // Function to find factorial
    public static int factorial(int n) {
        // handling negative value error
        if (n < 0) {
            System.out.println("Provide positive numbers.");
            return -1; // Return a  value to indicate an error
        }

        int result = 1;

        // Loop from n down to 1
        for (int i = n; i > 0; i--) {
            result *= i;  // store each product in the result variable
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int factorialResult = factorial(number);

        if (factorialResult != -1) {
            System.out.println("Factorial of " + number + " is " + factorialResult);
        }

        scanner.close();
    }
}
