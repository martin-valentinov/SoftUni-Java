package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int pokePowerOriginalValue = pokePower;
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        short countOfPokedTargets = 0;

        while (pokePower >= distanceBetweenTargets) {
            pokePower -= distanceBetweenTargets;
            countOfPokedTargets++;

            if (pokePower == 0.5 * pokePowerOriginalValue) {
                if (exhaustionFactor > 0) {
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(countOfPokedTargets);

    }
}
