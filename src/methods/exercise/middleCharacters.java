package methods.exercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        printMiddleChar(str);

    }

    public static void printMiddleChar (String str) {
        if (str.length() % 2 == 0) {
            int firstLetterIndex = str.length() / 2 - 1;
            int secondLetterIndex = str.length() / 2;
            System.out.println("" + str.charAt(firstLetterIndex) + str.charAt(secondLetterIndex));
        } else {
            System.out.println(str.charAt((str.length() / 2)));
        }
    }
}
