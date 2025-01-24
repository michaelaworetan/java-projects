import java.util.Scanner;

public class BillSplitter {
    // Allow the user to specify the ratio they want to split the bill (based on the number of
    // people splitting) then adds a tip
    public static double splitBill(int totalAmount, int noOfPeople) {
        double tipRate;

        // Determine the tip rate based on the total amount
        if (totalAmount < 50) {
            tipRate = 0.10; // 10% tip
        } else if (totalAmount < 100) {
            tipRate = 0.15; // 15% tip
        } else {
            tipRate = 0.20; // 20% tip
        }

        // Apply the tip to the total amount
        double totalWithTip = totalAmount * (1 + tipRate);

        // Calculate the split amount per person
        return totalWithTip / noOfPeople;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the number of people
        System.out.print("Enter the number of people dining: ");
        int peopleDining = scanner.nextInt();

        // Get input for the total bill amount
        System.out.print("Enter the total bill amount: ");
        int totalBillAmount = scanner.nextInt();

        // Calculate and display the amount each person should pay
        double perPersonAmount = splitBill(totalBillAmount, peopleDining);
        System.out.println("Each person should pay: $" + perPersonAmount);
        scanner.close();
    }
}
