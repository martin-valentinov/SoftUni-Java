package basicSyntax.exercise;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.00;

        while (true) {
            double insertedCoin = 0.00;
            String coin = scanner.nextLine();
            if (coin.equals("Start")) {
                break;
            } else {
                insertedCoin = Double.parseDouble(coin);
            }

            if (insertedCoin == 0.1 || insertedCoin == 0.2 || insertedCoin == 0.5 ||
            insertedCoin == 1.00 || insertedCoin == 2.00) {
                sum += insertedCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", insertedCoin);
            }
        }

        while (true) {
            String purchasedProduct = scanner.nextLine();
            double price = 0.00;

            if (purchasedProduct.equals("End")) {
                System.out.printf("Change: %.2f", sum);
                break;
            }

            switch (purchasedProduct) {
                case "Nuts":
                    price = 2.00;
                    break;
                case "Water":
                    price = 0.70;
                    break;
                case "Crisps":
                    price = 1.50;
                    break;
                case "Soda":
                    price = 0.80;
                    break;
                case "Coke":
                    price = 1.00;
                    break;
                default:
                    System.out.println("Invalid product");
                    continue;
            }

            if (price > sum) {
                System.out.println("Sorry, not enough money");
            } else {
                sum -= price;
                System.out.printf("Purchased %s%n", purchasedProduct);
            }
        }

    }
}
