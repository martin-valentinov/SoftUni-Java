package dataTypesAndVariables.lab;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int sumOfDigits = 0;
            int currentNumber = i;
            while (currentNumber != 0) {
                sumOfDigits += currentNumber % 10;
                currentNumber /= 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
            }
            }
        }

