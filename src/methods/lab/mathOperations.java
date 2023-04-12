package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(result(firstNum, symbol, secondNum)));
    }

    public static double result(double firstNum, String symbol, double secondNum){
        double result = 0.00;

        switch (symbol){
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
        }
        return result;
    }
}
