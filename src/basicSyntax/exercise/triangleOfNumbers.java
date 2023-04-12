package basicSyntax.exercise;

import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
