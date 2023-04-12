package methods.lab;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                printAdd(firstNum, secondNum);
                break;
            case "multiply":
                printMultiply(firstNum, secondNum);
                break;
            case "subtract":
                printSubtract(firstNum, secondNum);
                break;
            case "divide":
                printDivide(firstNum, secondNum);
                break;
        }
    }

    public static void printAdd(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiply(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printSubtract(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void printDivide(int firstNum, int secondNum){
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
