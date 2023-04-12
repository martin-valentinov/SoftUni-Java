package basicSyntax.more;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char letter = word.charAt(i);
            reversedWord += letter;
        }
        System.out.println(reversedWord);
    }
}
