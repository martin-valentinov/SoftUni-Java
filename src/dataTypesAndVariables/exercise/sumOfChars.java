package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int n = 0; n < numOfLines; n++) {
            char letter = scanner.nextLine().charAt(0);
            sum += (int) letter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
