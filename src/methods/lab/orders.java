package methods.lab;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        productPrice(product, quantity);

    }

    public static void productPrice(String product, int quantity){
        double price = 0.00;
        if (product.equals("coffee")){
            price = 1.5 * quantity;
        } else if (product.equals("water")){
            price = 1.0 * quantity;
        } else if (product.equals("coke")){
            price = 1.4 * quantity;
        } else if (product.equals("snacks")) {
            price = 2.00 * quantity;
        }

        System.out.printf("%.2f", price);
    }
}
