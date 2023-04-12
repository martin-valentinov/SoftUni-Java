package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int total = 0;
        for (int i = 0; i < numberOfLines; i++) {
            int quantityOfWater = Integer.parseInt(scanner.nextLine());

            if (total + quantityOfWater > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                total += quantityOfWater;
            }
        }
        System.out.println(total);
    }
}
