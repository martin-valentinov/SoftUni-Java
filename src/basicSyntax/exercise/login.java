package basicSyntax.exercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";


        for (int position = username.length() - 1; position >= 0; position--) {
            char letter = username.charAt(position);
            password += letter;
        }

        String newPassword = scanner.nextLine();
        int counter = 0;
        while (!newPassword.equals(password)) {
            counter ++;

            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            newPassword = scanner.nextLine();
            }
        if (newPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
