package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        double snowballValueBiggest = Integer.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int n = 0; n < numberOfSnowballs; n++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > snowballValueBiggest) {
                snowballValueBiggest = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballTimeBiggest, snowballValueBiggest, snowballQualityBiggest);
    }
}
