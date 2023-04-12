package basicSyntax.exercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String dayType = scanner.nextLine();
        double price = 0.00;

        if (dayType.equals("Friday")) {
            if (peopleType.equals("Students")) {
                price = 8.45;
            } else if (peopleType.equals("Business")) {
                price = 10.90;
            } else if (peopleType.equals("Regular")) {
                price = 15.00;
            }
        } else if (dayType.equals("Saturday")) {
            if (peopleType.equals("Students")) {
                price = 9.80;
            } else if (peopleType.equals("Business")) {
                price = 15.60;
            } else if (peopleType.equals("Regular")) {
                price = 20.00;
            }
        } else if (dayType.equals("Sunday")) {
            if (peopleType.equals("Students")) {
                price = 10.46;
            } else if (peopleType.equals("Business")) {
                price = 16.00;
            } else if (peopleType.equals("Regular")) {
                price = 22.50;
            }
        }

        double totalPrice = peopleCount * price;

        if (peopleType.equals("Students") && peopleCount >= 30) {
            totalPrice -= 0.15 * totalPrice;
        } else if (peopleType.equals("Business") && peopleCount >=100) {
            totalPrice = (peopleCount - 10) * price;
        } else if (peopleType.equals("Regular") && peopleCount >= 10 && peopleCount <= 20) {
            totalPrice -= 0.05 * totalPrice;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}

