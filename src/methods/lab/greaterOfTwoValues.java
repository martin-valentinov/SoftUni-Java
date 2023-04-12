package methods.lab;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine().toLowerCase();

        switch (dataType){
            case "int":
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            int greaterInt = maxValue(firstNum, secondNum);
            System.out.println(greaterInt);
            break;
            case "char":
            char firstCh = scanner.nextLine().charAt(0);
            char secondCh = scanner.nextLine().charAt(0);
            char greaterChar = maxValue(firstCh, secondCh);
            System.out.println(greaterChar);
            break;
            case "string":
            String firstStr = scanner.nextLine();
            String secondStr = scanner.nextLine();
            String greaterStr = maxValue(firstStr, secondStr);
            System.out.println(greaterStr);
            break;
        }
    }

    public static int maxValue(int firstNum, int secondNum){
        if (firstNum > secondNum) {
            return  firstNum;
        } else {
            return secondNum;
        }
    }

    public static char maxValue(char firstCh, char secondCh){
        if (firstCh > secondCh){
            return firstCh;
        } else {
            return secondCh;
        }
    }

    public static String maxValue(String firstStr, String secondStr){
        if (firstStr.compareTo(secondStr) > 0) {
            return firstStr;
        } else {
            return secondStr;
        }
    }
}
