package textProcessing.exercise;

import java.util.Scanner;

public class multiplyBigNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber.equals("0") || secondNumber == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder result = new StringBuilder();

        int carry = 0;

        for (int i = firstNumber.length() - 1; i >= 0; i--){
            int numToMultiply = firstNumber.charAt(i) - '0';
            int num = numToMultiply * secondNumber + carry;

            carry = num / 10;

            result.append(num % 10);

        }

        if (carry != 0) {
            result.append(carry);
        }

        StringBuilder reversedStr = result.reverse();

        System.out.println(reversedStr.toString());
    }
}
