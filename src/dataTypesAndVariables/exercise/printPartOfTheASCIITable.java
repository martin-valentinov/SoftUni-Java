package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class printPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());

        for (int n = firstSymbol; n <= lastSymbol; n++) {
            System.out.print((char) n + " ");
        }
    }
}
