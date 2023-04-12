package dataTypesAndVariables.lab;

import java.util.Scanner;

public class concatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String surname = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(firstName + delimiter + surname);
    }
}
