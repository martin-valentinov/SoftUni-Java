package methods.exercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        printFactorialDivision(firstNum, secondNum);
    }

    public static double factorialResult (double num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void printFactorialDivision(double firstNum, double secondNum) {
        double result = factorialResult(firstNum) / factorialResult(secondNum);
        System.out.printf("%.2f", result);
    }
}
