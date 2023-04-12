package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int n1 = 0; n1 < number; n1++) {
            for (int n2 = 0; n2 < number; n2++) {
                for (int n3 = 0; n3 < number; n3++) {
                    char firstChar = (char) ('a' + n1);
                    char secondChar = (char) ('a' + n2);
                    char thirdChar = (char) ('a' + n3);
                    System.out.printf("%c%c%c\n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
