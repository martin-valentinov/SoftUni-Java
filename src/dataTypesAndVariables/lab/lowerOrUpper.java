package dataTypesAndVariables.lab;

import java.util.Scanner;

public class lowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (letter >= 65 && letter <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
