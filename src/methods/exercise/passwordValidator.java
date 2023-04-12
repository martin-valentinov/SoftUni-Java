package methods.exercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean passwordIsValidLength = isValidLength(password);

        if (!passwordIsValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean passwordIsValidContent = isValidContent(password);

        if (!passwordIsValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean passwordIsValidCountDigits = isValidCountDigits(password);

        if (!passwordIsValidCountDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (passwordIsValidContent && passwordIsValidLength && passwordIsValidCountDigits) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isValidContent (String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigits (String password) {
        int digitCount = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
