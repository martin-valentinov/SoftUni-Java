package arrays.exercise;

import java.util.Scanner;

public class zigzagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[numOfLines];
        int[] secondArr = new int[numOfLines];

        for (int index = 0; index < numOfLines; index++){
            String[] numbers = scanner.nextLine().split(" ");
                if (index % 2 != 0) {
                    firstArr[index] = Integer.parseInt(numbers[1]);
                    secondArr[index] = Integer.parseInt(numbers[0]);
                } else {
                    firstArr[index] = Integer.parseInt(numbers[0]);
                    secondArr[index] = Integer.parseInt(numbers[1]);
                }
        }

        for (int number1:
             firstArr) {
            System.out.print(number1 + " ");
        }

        System.out.println();

        for (int number2:
                secondArr) {
            System.out.print(number2 + " ");
        }
    }
}
