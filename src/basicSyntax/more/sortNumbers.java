package basicSyntax.more;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        if (number >= number2 && number2 >= number3) {
            System.out.printf("%d%n%d%n%d", number, number2, number3);
        } else if (number >= number3 && number3 >= number2) {
            System.out.printf("%d%n%d%n%d", number, number3, number2);
        } else if (number2 >= number && number >= number3) {
            System.out.printf("%d%n%d%n%d", number2, number, number3);
        } else if (number2 >= number3 && number3 >= number) {
            System.out.printf("%d%n%d%n%d", number2, number3, number);
        }   else if (number3 >= number && number >= number2) {
            System.out.printf("%d%n%d%n%d", number3, number, number2);
        } else if (number3 >= number2 && number2 >= number) {
            System.out.printf("%d%n%d%n%d", number3, number2, number);
        }
        }

        }


