package basicSyntax.lab;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicand = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                int product = multiplicand * i;
                System.out.printf("%d X %d = %d%n", multiplicand, i, product);
            }
        } else {
            System.out.printf("%d X %d = %d", multiplicand, multiplier, multiplicand * multiplier);
        }
    }
}
