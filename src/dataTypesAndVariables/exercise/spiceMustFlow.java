package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalDaysWorked = 0;
        int totalExtracted = 0;

        while (startingYield >= 100) {
           totalDaysWorked ++;
           totalExtracted += startingYield - 26;
           startingYield -= 10;
        }

        if (totalExtracted >= 26) {
            totalExtracted -= 26;
        }


        System.out.println(totalDaysWorked);
        System.out.println(totalExtracted);
    }
}
