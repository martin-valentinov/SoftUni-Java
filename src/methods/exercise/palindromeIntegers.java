package methods.exercise;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String reversedStr = reversedWord(command);

            if (command.equals(reversedStr)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            command = scanner.nextLine();

        }
    }

    public static String reversedWord (String word) {
        String newWord = "";
        char[] symbols = word.toCharArray();

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += symbols[i];
        }
        return newWord;
    }
}
