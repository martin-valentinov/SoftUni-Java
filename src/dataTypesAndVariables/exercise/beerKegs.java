package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        String biggestKeg = null;
        double biggestVolume = Double.MIN_VALUE;

        for (int i = 0; i < numberOfLines; i++) {
            String nameOfKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestVolume) {
                biggestKeg = nameOfKeg;
                biggestVolume = volume;
            }
        }
        System.out.println(biggestKeg);
        }
    }

