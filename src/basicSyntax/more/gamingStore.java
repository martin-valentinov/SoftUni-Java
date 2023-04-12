package basicSyntax.more;

import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double totalSpent = 0.00;
        while (!command.equalsIgnoreCase("Game Time")) {
            String gameName = null;
            double price = 0.00;

            switch (command) {
                case ("OutFall 4"):
                    price = 39.99;
                    gameName = "OutFall 4";
                    break;
                case ("CS: OG"):
                    price = 15.99;
                    gameName = "CS: OG";
                    break;
                case ("Zplinter Zell"):
                    price = 19.99;
                    gameName = "Zplinter Zell";
                    break;
                case ("Honored 2"):
                    price = 59.99;
                    gameName = "Honored 2";
                    break;
                case ("RoverWatch"):
                    price = 29.99;
                    gameName = "RoverWatch";
                    break;
                case ("RoverWatch Origins Edition"):
                    price = 39.99;
                    gameName = "RoverWatch Origins Edition";
                    break;
                default:
                    System.out.println("Not Found");
                    command = scanner.nextLine();
                    continue;
            }

            if (currentBalance < price) {
                System.out.println("Too Expensive");
            } else {
                currentBalance -= price;
                totalSpent += price;
                System.out.printf("Bought %s%n", gameName);
            }

            command = scanner.nextLine();
            }
        if (currentBalance == 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        }


    }
}
