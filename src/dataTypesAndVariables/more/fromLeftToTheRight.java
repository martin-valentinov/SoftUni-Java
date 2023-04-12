package dataTypesAndVariables.more;

import java.util.Arrays;
import java.util.Scanner;

public class fromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numOfLines; i++){
            String numbers = scanner.nextLine();
            long[] numbersArr = Arrays.stream(numbers.split(" ")).mapToLong(Long::parseLong).toArray();

            long firstNumber = numbersArr[0];
            long secondNumber = numbersArr[1];
            int sum = 0;
            if (firstNumber > secondNumber) {
                while (firstNumber != 0) {
                    long lastDigit = firstNumber % 10;
                    sum += lastDigit;
                    firstNumber /= 10;
                }
            } else {
                while (secondNumber != 0) {
                    long lastDigit = secondNumber % 10;
                    sum+= lastDigit;
                    secondNumber /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}
