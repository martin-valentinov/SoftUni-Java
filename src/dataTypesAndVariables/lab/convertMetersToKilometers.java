package dataTypesAndVariables.lab;
import java.util.Scanner;

public class convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short metres = Short.parseShort(scanner.nextLine());
        double kilometres = metres / 1000.0;

        System.out.printf("%.2f", kilometres);
    }
}
