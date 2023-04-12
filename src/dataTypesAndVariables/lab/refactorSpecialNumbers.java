package dataTypesAndVariables.lab;

import java.util.Scanner;

public class refactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int ch = 1; ch <= number; ch++) {
            int currentNumber = ch;
            int sum = 0;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
            }

            boolean specialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", ch, specialNumber);

        }


    }
}
