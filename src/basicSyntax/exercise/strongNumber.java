package basicSyntax.exercise;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int factorialSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for (int i = lastDigit; i > 0; i--) {
                factorial *= i;
            }
            factorialSum += factorial;
            number /= 10;
        }

        if (factorialSum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
