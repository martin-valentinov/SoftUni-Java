package methods.lab;

import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        printSign(integer);

    }

    public static void printSign(int integer) {
        if (integer > 0) {
            System.out.printf("The number %d is positive.", integer);
        } else if (integer < 0) {
            System.out.printf("The number %d is negative.", integer);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
