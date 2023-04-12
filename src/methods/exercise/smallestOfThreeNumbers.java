package methods.exercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeNumbers(number1, number2, number3);
    }

    public static void printSmallestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            System.out.println(secondNumber);
        } else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber) {
            System.out.println(thirdNumber);
        }
    }
}
