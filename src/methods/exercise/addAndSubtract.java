package methods.exercise;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int result = subtract(firstNum, secondNum, thirdNum);

        System.out.println(result);

    }

    public static Integer sum (int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static Integer subtract (int firstNum, int secondNum, int thirdNum) {
        return sum(firstNum, secondNum) - thirdNum;
    }
}
