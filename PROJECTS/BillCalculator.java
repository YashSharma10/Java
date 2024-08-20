import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BillCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bill calculator!");

        // Prompt user for number of items
        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();

        double totalBill = 0;

        // Loop through each item and ask user for details
        for (int i = 1; i <= itemCount; i++) {
            System.out.println("Enter details for item #" + i + ":");

            System.out.print("Item name: ");
            String itemName = scanner.next();

            System.out.print("Item price: $");
            double itemPrice = scanner.nextDouble();

            System.out.print("Item quantity: ");
            int itemQuantity = scanner.nextInt();

            // Calculate cost for current item
            double itemCost = itemPrice * itemQuantity;
            totalBill += itemCost;

            System.out.println("Cost for " + itemQuantity + " " + itemName + " is: $" + itemCost);
        }

        // Display the total bill
        System.out.println("Total bill: $" + totalBill);

        // Write total bill to a file
        try {
            FileWriter writer = new FileWriter("bill.txt");
            writer.write("Total bill: $" + totalBill);
            writer.close();
            System.out.println("Total bill written to file: bill.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }
}