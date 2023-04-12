package exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class bakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> stocks = new LinkedHashMap<>();
        int quantityOfSoldGoods = 0;

        while (!command.equals("Complete")) {
            String typeOfCommand = command.split(" ")[0];
            int quantity = Integer.parseInt(command.split(" ")[1]);
            String food = command.split(" ")[2];

            if (typeOfCommand.equals("Receive")) {
                if (!stocks.containsKey(food)) {
                    stocks.put(food, quantity);
                    command = scanner.nextLine();
                    continue;
                }

                int currentQuantity = stocks.get(food);

                if (quantity > 0) {
                    stocks.put(food, currentQuantity + quantity);
                } else {
                    continue;
                }

            } else if (typeOfCommand.equals("Sell")) {
                if (!stocks.containsKey(food)) {
                    System.out.printf("You do not have any %s.%n", food);
                    command = scanner.nextLine();
                    continue;
                }
                if (quantity > stocks.get(food)) {
                    System.out.printf("There aren't enough %s. You sold the last %d of them.%n", food,
                            stocks.get(food));
                    quantityOfSoldGoods += stocks.get(food);
                    stocks.remove(food);
                } else {
                    System.out.printf("You sold %d %s.%n", quantity, food);
                    quantityOfSoldGoods += quantity;
                    int newQuantity = stocks.get(food) - quantity;
                    stocks.put(food, newQuantity);

                    if (stocks.get(food) == 0) {
                        stocks.remove(food);
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : stocks.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        System.out.printf("All sold: %d goods", quantityOfSoldGoods);

    }
}
