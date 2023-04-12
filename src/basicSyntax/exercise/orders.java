package basicSyntax.exercise;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;
        for (int i = 1; i <= countOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            //((daysInMonth * capsulesCount) * pricePerCapsule)

            double price = (days * capsuleCount) * pricePerCapsule;
            totalPrice += price;

            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
