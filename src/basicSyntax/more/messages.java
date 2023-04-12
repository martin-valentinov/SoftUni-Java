package basicSyntax.more;

import java.util.Scanner;

public class messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLetters = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = numberOfLetters; i > 0; i--) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                output += " ";
                continue;
            }

            int mainDigit = input % 10;
            int numberOfDigits = 0;

            // Find the number of digits
            while (input != 0) {
                input /= 10;
                numberOfDigits++;
            }

            // Find the offset number
            int offsetNumber = 0;

            if (mainDigit == 8 || mainDigit == 9) {
                offsetNumber = (mainDigit - 2) * 3 + 1;
            } else {
                offsetNumber = (mainDigit - 2) * 3;
            }

            // Find the letter index
            int letterIndex = offsetNumber + numberOfDigits - 1;

            int asciiCode = 97 + letterIndex;
            char letter = (char)asciiCode;
            output += letter;
        }
        System.out.println(output);

    }
}
