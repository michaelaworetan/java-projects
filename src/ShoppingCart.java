import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
//        Create a shopping cart program that:
//        Prompts the user to enter the price of 5 items they wish to buy
//        Calculates the total cost, Applies a discount, Prints the final amount the user needs to pay

        Scanner scanner = new Scanner(System.in);  // get the user's input

        // Initialize a variable to store the total cost
        double totalCost = 0;

        // for loop to get the price of the 5 items
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            double itemPrice = scanner.nextDouble();
            // check if the provided input is a positive integer
            if (itemPrice <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }
            totalCost += itemPrice;
        }

        scanner.close();

        // Determine the discount based on the total cost
        double discount = 0;
        if (totalCost > 200) {
            discount = 0.2; // 10% discount if total exceeds 100
        } else if (totalCost > 100) {
            discount = 0.10; // 10% discount if total exceeds 100
        }

        // Calculate the discount and final amount after discount
        double discountAmount = totalCost * discount;
        double finalAmount = totalCost - discountAmount;

        System.out.println("Total cost of items: $" + totalCost);
        System.out.println("Discount applied: -$" + discountAmount);
        System.out.println("Final amount to pay after deduction: $" + finalAmount);
        System.out.println("Thank you for shopping!!");

    }
}
